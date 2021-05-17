package users;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Admin extends User {

    /**
     * int adminID The ID of the admin
     */
    private int adminID;

    /**
     * String departement The departement of the admin
     */
    private String departement;

    /**
     * int adminLevel The level of the admin
     */
    private int adminLevel;

    /**
     * List membersFollowing The list of the members following by the admin
     */
    List<Integer> membersFollowing;

    /**
     * Constructor
     */
    public Admin(String departement, int adminLevel) {
        this.adminID = (int) Math.random()*100000;
        this.departement = departement;
        this.adminLevel = adminLevel;
        this.membersFollowing = new ArrayList<>();
    }

    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public int getAdminLevel() {
        return adminLevel;
    }

    public void setAdminLevel(int adminLevel) {
        this.adminLevel = adminLevel;
    }

    public List<Integer> getMembersFollowing() {
        return membersFollowing;
    }

    public void setMembersFollowing(List<Integer> membersFollowing) {
        this.membersFollowing = membersFollowing;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminID=" + adminID +
                ", departement='" + departement + '\'' +
                ", adminLevel=" + adminLevel +
                ", membersFollowing=" + membersFollowing +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Admin admin = (Admin) o;
        return adminID == admin.adminID && adminLevel == admin.adminLevel && Objects.equals(departement, admin.departement) && Objects.equals(membersFollowing, admin.membersFollowing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), adminID, departement, adminLevel, membersFollowing);
    }
}
