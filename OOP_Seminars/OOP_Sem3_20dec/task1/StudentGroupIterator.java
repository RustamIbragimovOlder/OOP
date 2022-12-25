package OOP_Seminars.OOP_Sem3_20dec.task1;

import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {

    private int index = -1;
    private StudentGroup studentGroup;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }


    @Override
    public boolean hasNext() {
        
        // длинное написание условия
        // if (this.index < this.studentGroup.sizeStudentGroup()) {
        //     return true;
        // }
        // else {
        //     return false;
        // }

        // тоже самое, только коротко

        return this.index < this.studentGroup.sizeStudentList() - 1;
        
    }

    @Override
    public Student next() {
        this.index++;
        return studentGroup.getStudent(this.index);
    }
 
}