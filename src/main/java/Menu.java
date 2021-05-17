import biblis.Record;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Menu implements MenuInterface {

    private Gson gson;
    private List<Record> records;

    public Menu() {
        gson = new Gson();
        records = new ArrayList<>();
        records.add(new Record("1", "Mobydick", "2021-05-05", "Eliot Nes", "La baleine", "Une baleine bien venere!"));
        records.add(new Record("2", "Tic et Tac", "2021-05-05", "Walt Disney", "Disney production", "Des Ecureils plutot nuts"));
    }

    public String readAllRecords() {
        return gson.toJson(records);
    }

    public String findRecord(String recordId) {
        for (Record record: records) {
            if (record.getRecordID().equals(recordId)) {
                return gson.toJson(record);
            }
        }
        return "";
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
