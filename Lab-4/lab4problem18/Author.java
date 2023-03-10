package lab4problem18;

public class Author {
    String firstName;
    String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String LastName) {
        this.lastName = LastName;
    }
    public String getLastName() {
        return lastName;
    }
    public String toString() {
        return "Author:" + firstName + " " + lastName;
    }
}
