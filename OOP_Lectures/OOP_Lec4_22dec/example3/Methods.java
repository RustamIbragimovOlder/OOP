package OOP_Lectures.OOP_Lec4_22dec.example3;

// import java.util.HashMap;
import java.util.List;
// import java.util.Map;

public class Methods {
    public static Integer getElementFromIntegerCollection(List<Integer> col, int index) {
        return col.get(index);
    }

    public static String getElementFromStringCollection(List<String> col, int index) {
        return col.get(index);
    }

    public static Double getElementFromDoubleCollection(List<Double> col, int index) {
        return col.get(index);
    }

    // #region
    public static <U> U getElementFromUCollection(List<U> col, int index) {
        return col.get(index);
    }


    // #endregion

    //#region

    public static <T1, T2> T2 put(T1 arg1, T2 arg2) {
        // Map<Integer,String> hm = new HashMap<>();
        // hm.put(key, value)
        return arg2;
    }

    //#endregion
}
