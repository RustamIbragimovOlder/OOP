package OOP_PracticalTasks.OOP_PT2_23dec;

import java.io.*;
import java.util.*;


public class Program {
    public static void main(String[] args) throws IOException {

        // формируем список объектов Student
        Map<String, Float> students = new HashMap<>();
        students.put("Иван Иванов", 4.8f);
        students.put("Мария Кузнецова", 5.0f);
        students.put("Степан Кузьмин", 3.6f);
        
        TxtFormat.saveAs(students);
        JsonFormat.saveAs(students);
        XmlFormat.saveAs(students);
    }

}