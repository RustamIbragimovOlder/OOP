package OOP_Lectures.OOP_Lec4_22dec.example2;

public class Worker {
    
    // private int id;
    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public Worker(int id, String firstName,
            String lastName,
            int age,
            int salary) {

        // this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;

        
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }
}
