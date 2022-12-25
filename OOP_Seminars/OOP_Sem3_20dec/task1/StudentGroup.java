package OOP_Seminars.OOP_Sem3_20dec.task1;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private List<Student> studentList;

    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
    }

    public int sizeStudentList() {
        return this.studentList.size();
    }

    public Student getStudent(int index) {
        return this.studentList.get(index);
    }

    @Override
    public Iterator<Student> iterator() {

        return new StudentGroupIterator(this);
    }
    
    
    
}