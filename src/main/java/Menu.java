import biblis.Record;
import com.google.gson.Gson;
import database.RecordDAO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Menu implements MenuInterface {

    private Gson gson;
    private List<Record> records;

    public Menu() {
        gson = new Gson();
        records = new ArrayList<>();
    }

    public String readAllRecords() {
        return gson.toJson(RecordDAO.all());
    }

    public String findRecord(String recordId) {
        int id = Integer.parseInt(recordId);
        return gson.toJson(RecordDAO.findById(id));
    }

    public boolean createRecord(int recordId, String recordTitle, Date createdDate, String author, String editor, String pitch) {
        return true;
    }

    public boolean updateRecord(int recordId, String recordTitle, Date createdDate, String author, String editor, String pitch) {
        return true;
    }

    public boolean deleteRecord(int recordId) {
        return true;
    }

}
