package uz.example;

public class User {
    public String username;
    public String firstName;
    public String lastName;
    public int age;

    @Override
    public String toString() {
        return "username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age;
    }
}
