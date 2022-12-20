package OOP_Lectures.OOP_Lec2_16dec.Example6.Interface;

import OOP_Lectures.OOP_Lec2_16dec.Example6.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
