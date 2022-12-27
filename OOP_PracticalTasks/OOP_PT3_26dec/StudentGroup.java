package OOP_PracticalTasks.OOP_PT3_26dec;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentGroup implements Iterable<Student> {
    
    static List<Student> studentList;

    public StudentGroup(List<Student> studentList) {
        StudentGroup.studentList = studentList;
    }

    public int sizeStudentList() {
        return studentList.size();
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    public ListIterator<Student> listIterator(int index) {
        return new GroupListIterator(this, index);
    }

    public Iterator<Student> reverseIterator() {
        return new ReverseIterator(this);
    }

}