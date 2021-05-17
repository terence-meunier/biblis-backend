package biblis;

import java.util.Objects;

public class Format {
    private int typeID;
    private String formatName;

    public Format(int typeID, String formatName) {
        this.typeID = typeID;
        this.formatName = formatName;
    }

    public int getTypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public String getFormatName() {
        return formatName;
    }

    public void setFormatName(String formatName) {
        this.formatName = formatName;
    }

    @Override
    public String toString() {
        return "Format{" +
                "typeID=" + typeID +
                ", formatName='" + formatName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Format format = (Format) o;
        return typeID == format.typeID && Objects.equals(formatName, format.formatName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeID, formatName);
    }
}
