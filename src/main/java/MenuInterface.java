import com.google.gson.Gson;

import java.util.Date;

public interface MenuInterface {
    String readAllRecords();
    String findRecord(String recordId);
    boolean createRecord(int recordId, String recordTitle, Date createdDate, String author, String editor, String pitch);
    boolean updateRecord(int recordId, String recordTitle, Date createdDate, String author, String editor, String pitch);
    boolean deleteRecord(int recordId);
}

