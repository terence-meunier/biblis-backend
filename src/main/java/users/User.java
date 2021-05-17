package users;

import java.util.Objects;

/**
 * Abstract class User
 *
 * @author MEUNIER TERENCE
 * @version 1.0
 */
public abstract class User {

    /**
     * String nickName
     * The nickname of the user
     */
    private String nickName;

    /**
     * String firstName
     * The firstname of the user
     */
    private String firstName;

    /**
     * String lastName
     * The lastname of the user
     */
    private String lastName;

    /**
     * Empty Constructor
     */
    public User() {
        this("Anonymous" + Math.random()*10000);
    }

    /**
     * Constructor with one parameter
     * @param nickName the nickname of the user
     */
    public User(String nickName) {
        this(nickName, "", "");
    }

    /**
     * Constructor with three parameters
     * @param nickName the nickname of the user
     * @param lastName the lastname of the user
     * @param firstName the firstname of the user
     */
    public User(String nickName, String lastName, String firstName) {
        this.nickName = nickName;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "nickName='" + nickName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(nickName, user.nickName) && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickName, firstName, lastName);
    }
}
