package OOP_Seminars.OOP_Sem5_13jan.model.data;

public abstract class User {
    private String firstName;
    private String lastName;
    private String nameOfUniversity;

    public User(String firstName, String lastName, String nameOfUniversity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nameOfUniversity = nameOfUniversity;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNameOfUniversity() {
        return nameOfUniversity;
    }

    public String toFileString() {
        return String.format("%s, %s, %s", firstName, lastName, nameOfUniversity);
    }

    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", lastName=" + lastName + ", nameOfUniversity=" + nameOfUniversity
                + "]";
    }

    
}
