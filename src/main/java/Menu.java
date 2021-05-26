import biblis.Record;
import com.google.gson.Gson;
import database.RecordDAO;

import java.time.LocalDate;
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

    public void createRecord(String title, String author, String editor, String pitch) {
        Record record = new Record(0, title, null, author, editor, pitch);
        RecordDAO.save(record);
    }

    public void updateRecord(String id, String title, String author, String editor, String pitch) {
        int recordId = Integer.parseInt(id);
        Record record = new Record(recordId, title, null, author, editor, pitch);
        RecordDAO.update(record);
    }

    public boolean deleteRecord(int id) {
        return true;
    }

}
