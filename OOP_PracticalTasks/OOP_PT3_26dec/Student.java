package OOP_PracticalTasks.OOP_PT3_26dec;

public class Student {

    private int studentID;
    private String name;
    private String birthdate;
    private float averageGrade;

    public Student(int studentID, String name, String birthdate, float averageGrade) {
        this.studentID = studentID;
        this.name = name;
        this.birthdate = birthdate;
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student [studentID=" + studentID + ", name=" + name + ", birthdate=" + birthdate + ", averageGrade="
                + averageGrade + "]";
    }
    
    public static Student nextStudent(int index) {
        return StudentGroup.studentList.get(index);
    }
    
}