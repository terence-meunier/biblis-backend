package database;

import biblis.Record;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecordDAO {

    // All records
    public static List<Record> all() {
        ResultSet results = null;
        List<Record> records = new ArrayList<>();
        try {
            results = Database.query("SELECT * FROM records");
            while (results.next()) {
                int id = results.getInt("id");
                String title = results.getString("title");
                Date date = results.getDate("created");
                String author = results.getString("author");
                String editor = results.getString("editor");
                String pitch = results.getString("pitch");
                records.add(new Record(id, title, date, author, editor, pitch));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Database.close();
        }
        return records;
    }

    // Find record by id
    public static Record findById(int id) {
        Record record = null;
        ResultSet result = null;
        try {
            result = Database.query("SELECT * FROM records WHERE id=" + id);
            while (result.next()) {
                int recordId = result.getInt("id");
                String recordTitle = result.getString("title");
                Date recordDate = result.getDate("created");
                String recordAuthor = result.getString("author");
                String recordEditor = result.getString("editor");
                String recordPitch = result.getString("pitch");
                record = new Record(recordId, recordTitle, recordDate, recordAuthor, recordEditor, recordPitch);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }  finally {
            Database.close();
        }
        return record;
    }
}
