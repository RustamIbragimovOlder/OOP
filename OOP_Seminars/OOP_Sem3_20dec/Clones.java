package OOP_Seminars.OOP_Sem3_20dec;

public class Clones {
    public static void main(String[] args) throws CloneNotSupportedException {

        // создание нового экземпляра
        Student originalStudent = new Student("Иван", "Иванов", 4.7f);

        // создание клона по трудному варианту
        Student clone = new Student(
            originalStudent.getFirstName(), 
            originalStudent.getLastName(), 
            originalStudent.getAverageGrade());

        // автоматическое клонирование с помощью маркерного интерфейса Cloneable
        Student clone = (Student) originalStudent.clone();



    }
    
}

class Student implements Cloneable {

    private String firstName;
    private String lastName;
    private float averageGrade;

    public Student(String firstName, String lastName, float averageGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.averageGrade = averageGrade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public float getAverageGrade() {
        return averageGrade;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    
    
}
