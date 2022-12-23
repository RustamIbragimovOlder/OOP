package OOP_PracticalTasks.OOP_PT2_23dec;

import java.io.FileWriter;
import java.util.Map;

public class XmlFormat extends Format {

    @Override
    public void write() {
    }

    public static void saveAs(Map<String, Float> students) {

        StringBuilder stringBuilder = new StringBuilder();
        try (FileWriter writer = new FileWriter("students.xml", true)) {
            writer.append("Format XML => \n");
            writer.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n");
            writer.append("<students>\n");
            for (Map.Entry<String, Float> entry : students.entrySet()) {
                stringBuilder.delete(0, stringBuilder.length());
                stringBuilder.append("\t<student>\n" + "\t\t<name>" + entry.getKey() + "</name>\n" + "\t\t<grade>"
                        + entry.getValue() + "</grade>\n" + "\t</student>\n");
                writer.append(stringBuilder);
            }
            writer.append("</students>");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}