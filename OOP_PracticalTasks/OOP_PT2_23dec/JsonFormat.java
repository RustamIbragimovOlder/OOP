package OOP_PracticalTasks.OOP_PT2_23dec;

import java.io.FileWriter;
import java.util.Map;

public class JsonFormat extends Format {


    @Override
    public void write() {
    }

    public static void saveAs(Map<String, Float> students) {
        StringBuilder stringBuilder = new StringBuilder();
        try (FileWriter writer = new FileWriter("students.json", true)) {
            writer.append("Format JSON => \n");
            writer.append("{\n");
            int counter = 0;
            for (Map.Entry<String, Float> entry : students.entrySet()) {
                stringBuilder.delete(0, stringBuilder.length());
                stringBuilder.append("\"" + entry.getKey() + "\"" + ":" + entry.getValue() + ",\n");
                counter++;
                if (counter == students.size()) {
                    stringBuilder.deleteCharAt(stringBuilder.length() - 2);
                }
                writer.append(stringBuilder);
            }
            writer.append('}');
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}