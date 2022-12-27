package OOP_PracticalTasks.OOP_PT3_26dec;

import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {

    protected int index = 0;
    private StudentGroup studentGroup;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.studentGroup.sizeStudentList();
    }

    @Override
    public Student next() {
        return Student.nextStudent(index++);
    }
 
}