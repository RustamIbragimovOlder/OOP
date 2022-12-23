package OOP_PracticalTasks.OOP_PT2_23dec;

import java.io.FileWriter;
import java.util.Map;

public class TxtFormat extends Format {
    
    @Override
    public void write() {
    }
    
    public static void saveAs(Map<String, Float> students) {
        try (FileWriter writer = new FileWriter("students.txt", true)) {
            writer.append("Format TXT => \n");
            for (Map.Entry<String, Float> entry : students.entrySet()) {
                writer.append(entry.toString());
                writer.append("\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}