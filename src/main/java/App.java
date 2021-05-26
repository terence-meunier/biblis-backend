import spark.Request;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {

    private static Map<String, String> generatedDatas(Request req) {
        Map<String, String> datas = new HashMap<>();
        for (String data : req.queryParams()) {
            if (data != null) {
                datas.put(data, req.queryParams(data));
            }
        }
        datas.putIfAbsent("title", "");
        datas.putIfAbsent("author", "");
        datas.putIfAbsent("editor", "");
        datas.putIfAbsent("pitch", "");
        return datas;
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        before("/*", (req, res) -> res.header("Access-Control-Allow-Origin", "*"));
        get("/records", (req, res) -> menu.readAllRecords());
        get("/records/:recordId", (req, res) -> menu.findRecord(req.params("recordId")));
        get("/create", (req, res) -> {
            Map<String, String> datas = generatedDatas(req);
            menu.createRecord(datas.get("title"), datas.get("author"), datas.get("editor"), datas.get("pitch"));
            res.redirect("/records");
            return null;
        });
        get("/update/:recordId", (req, res) -> {
            Map<String, String> datas = generatedDatas(req);
            menu.updateRecord(req.params("recordId"), datas.get("title"), datas.get("author"), datas.get("editor"), datas.get("pitch"));
            res.redirect("/records");
            return null;
        });
    }
}
