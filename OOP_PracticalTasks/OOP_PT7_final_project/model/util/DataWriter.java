package OOP_PracticalTasks.OOP_PT7_final_project.model.util;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import OOP_PracticalTasks.OOP_PT7_final_project.model.data.User;


public class DataWriter {

    public static <C extends User> void dataWrite(List<C> list) {
        try (FileWriter writer = new FileWriter("contactDB.txt", false)) {
            for (C contact : list) {
                writer.write(contact.toString());
                writer.write("\n");
                // System.out.println();
            }
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
}
