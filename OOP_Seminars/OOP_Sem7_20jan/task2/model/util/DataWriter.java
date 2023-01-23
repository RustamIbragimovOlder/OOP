package OOP_Seminars.OOP_Sem7_20jan.task2.model.util;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import OOP_Seminars.OOP_Sem7_20jan.task2.model.data.User;

public class DataWriter {

    public static <U extends User> void dataWrite(List<U> list) {
        try (FileWriter writer = new FileWriter("studentDB.txt", false)) {
            for (U user : list) {
                writer.write(user.toFileString());
                writer.write("\n");
            }
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}