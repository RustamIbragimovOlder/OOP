package OOP_Lectures.OOP_Lec2_16dec.Example6.Applications;

import java.util.ArrayList;
import java.util.List;

import OOP_Lectures.OOP_Lec2_16dec.Example6.Document.TextDocument;
import OOP_Lectures.OOP_Lec2_16dec.Example6.Format.TextFormat;

public class Notepad {
    private List<TextDocument> documents;
    private int index;

    public Notepad() {
        documents = new ArrayList<>();
        index = -1;
    }

    public void newFile() {
        documents.add(new TextDocument());
        index++;
    }

    public TextDocument currentDocument(){
        return documents.get(index);
    }

    public void SaveAs(String path, TextFormat format) {
        format.SaveAs(documents.get(index), path);
    }
}

