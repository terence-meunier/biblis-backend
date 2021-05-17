import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        Menu menu = new Menu();
        before("/*", (req, res) -> {
            res.header("Access-Control-Allow-Origin", "*");
        });
        get("/", (req, res) -> menu.readAllRecords());
        get("/:recordId", (req, res) -> {
            return menu.findRecord(req.params("recordId"));
        });
    }
}
