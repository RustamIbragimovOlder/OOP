package OOP_PracticalTasks.OOP_PT3_26dec;

public class ReverseIterator extends StudentGroupIterator {

    public ReverseIterator(StudentGroup studentGroup) {
        super(studentGroup);
        index = studentGroup.sizeStudentList() - 1;
    }

    public boolean hasNext() {
        return index > -1;
    }

    public Student next() {
        return Student.nextStudent(index--); 
    }

}