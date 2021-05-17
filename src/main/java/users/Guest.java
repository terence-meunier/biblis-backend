package users;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Guest extends User {

    /**
     * int tempID A temp number for the guest
     */
    private int tempID;

    /**
     * List history A history for the number
     */
    private List<Integer> history;

    /**
     * Constructor
     */
    public Guest() {
        this.tempID = (int) Math.random()*100000;
        this.history = new ArrayList<>();
    }

    public int getTempID() {
        return tempID;
    }

    public void setTempID(int tempID) {
        this.tempID = tempID;
    }

    public List<Integer> getHistory() {
        return history;
    }

    public void setHistory(List<Integer> history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "tempID=" + tempID +
                ", history=" + history +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Guest guest = (Guest) o;
        return tempID == guest.tempID && Objects.equals(history, guest.history);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tempID, history);
    }
}
