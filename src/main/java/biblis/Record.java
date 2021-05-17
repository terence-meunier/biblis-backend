package biblis;

import java.util.Date;
import java.util.Objects;

public class Record {
    private int recordID;
    private String recordTitle;
    private Date createdDate;
    private String author;
    private String editor;
    private String pitch;

    public Record(int recordID, String recordTitle, Date createdDate, String author, String editor, String pitch) {
        this.recordID = recordID;
        this.recordTitle = recordTitle;
        this.createdDate = createdDate;
        this.author = author;
        this.editor = editor;
        this.pitch = pitch;
    }

    public int getRecordID() {
        return recordID;
    }

    public void setRecordID(int recordID) {
        this.recordID = recordID;
    }

    public String getRecordTitle() {
        return recordTitle;
    }

    public void setRecordTitle(String recordTitle) {
        this.recordTitle = recordTitle;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getPitch() {
        return pitch;
    }

    public void setPitch(String pitch) {
        this.pitch = pitch;
    }

    @Override
    public String toString() {
        return "Record{" +
                "recordID=" + recordID +
                ", recordTitle='" + recordTitle + '\'' +
                ", createdDate=" + createdDate +
                ", author='" + author + '\'' +
                ", editor='" + editor + '\'' +
                ", pitch='" + pitch + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record record = (Record) o;
        return recordID == record.recordID && Objects.equals(recordTitle, record.recordTitle) && Objects.equals(createdDate, record.createdDate) && Objects.equals(author, record.author) && Objects.equals(editor, record.editor) && Objects.equals(pitch, record.pitch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordID, recordTitle, createdDate, author, editor, pitch);
    }
}
