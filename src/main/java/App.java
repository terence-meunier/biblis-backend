import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        Menu menu = new Menu();
        before("/*", (req, res) -> {
            res.header("Access-Control-Allow-Origin", "*");
        });
        get("/records", (req, res) -> menu.readAllRecords());
        get("/records/:recordId", (req, res) -> {
            return menu.findRecord(req.params("recordId"));
        });
        get("/create", (req, res) -> {
            menu.createRecord("Titanic", "Mr Ismet", "White Star Line", "Une belle histoire d'amour !");
            res.redirect("/records");
            return null;
        });
        get("/update/:recordId", (req, res) -> {

            String title, author, editor, pitch;

            if (req.queryParams("title") == null
                    && req.queryParams("author") == null
                    && req.queryParams("editor") == null
                    && req.queryParams("pitch") == null) {
                title = author = editor = pitch = "";
            } else {
                title = req.queryParams("title");
                author = req.queryParams("author");
                editor = req.queryParams("editor");
                pitch = req.queryParams("pitch");
            }
            menu.updateRecord(req.params("recordId"), title, author, editor, pitch);
            res.redirect("/records");
            return null;
        });
    }
}
