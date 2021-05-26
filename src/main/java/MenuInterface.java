public interface MenuInterface {
    String readAllRecords();
    String findRecord(String recordId);
    void createRecord(String title, String author, String editor, String pitch);
    void updateRecord(String id, String title, String author, String editor, String pitch);
    boolean deleteRecord(int id);
}

