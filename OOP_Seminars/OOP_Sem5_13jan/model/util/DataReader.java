package OOP_Seminars.OOP_Sem5_13jan.model.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import OOP_Seminars.OOP_Sem5_13jan.model.data.Student;

public class DataReader {

    // private String path;

    // public List<Student> readFromFile () {
    //     List<Student> students = new ArrayList<>();
    //     try {
    //         BufferedReader br = new BufferedReader(new FileReader(path));
    //         String line = br.readLine();
    //         while (line != null) {
    //             String[] str = line.split(",");
    //             students.add(new Student(str[0], str[1], str[2], str[3], str[4]));
    //         }
    //         br.close();
    //     }
    //     catch (IOException e) {}
    //     return students;
    // }
    

    public static List<Student> dataRead(String path) {
        List<Student> list = new ArrayList<>();

        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
            String str = bf.readLine();
            while (str != null) {
                String[] array = str.split(", ");
                list.add(new Student(array[0], array[1], array[2], array[3], Integer.parseInt(array[4])));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
