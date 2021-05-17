package users;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Member class determine a member of the biblis
 */
public class Member extends User {
    /**
     * int memberID The member id
     */
    private int memberID;

    /**
     * Date birthDate The birth date of the member
     */
    private Date birthDate;

    /**
     * int role The role level of the member (1: READER, 2:EDITOR, 3: AUTHOR)
     */
    private int role;

    /**
     * int accessLevel The access level of the member (1: BASIC, 2: MEDIUM, 3: HIGH)
     */
    private int accessLevel;

    /**
     * List recordsInProgress The records in progress by the member
     */
    private List<Integer> recordsInProgress;

    /**
     * List history The history of the member
     */
    private List<Integer> history;

    /**
     * Constructor
     * @param nickname The nickname of the member
     * @param lastname The lastname of the member
     * @param firstname The firsname of the member
     * @param birthDate The birth date of the member
     */
    public Member(String nickname, String lastname, String firstname, Date birthDate) {
        super(nickname, lastname, firstname);
        this.memberID = (int) Math.random()*100000;
        this.birthDate = birthDate;
        this.role = 1;
        this.accessLevel = 1;
        this.recordsInProgress = new ArrayList<>();
        this.history = new ArrayList<>();
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    public List<Integer> getRecordsInProgress() {
        return recordsInProgress;
    }

    public void setRecordsInProgress(List<Integer> recordsInProgress) {
        this.recordsInProgress = recordsInProgress;
    }

    public List<Integer> getHistory() {
        return history;
    }

    public void setHistory(List<Integer> history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberID=" + memberID +
                ", birthDate=" + birthDate +
                ", role=" + role +
                ", accessLevel=" + accessLevel +
                ", recordsInProgress=" + recordsInProgress +
                ", history=" + history +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Member member = (Member) o;
        return memberID == member.memberID && role == member.role && accessLevel == member.accessLevel && Objects.equals(birthDate, member.birthDate) && Objects.equals(recordsInProgress, member.recordsInProgress) && Objects.equals(history, member.history);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), memberID, birthDate, role, accessLevel, recordsInProgress, history);
    }
}
