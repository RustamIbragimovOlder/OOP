package OOP_Lectures.OOP_Lec4_22dec.example2;

import java.util.UUID;

public class Program {
    public static void main(String[] args) {

        Worker w = new Worker(28, "firstName", "lastName", 20, 22);
        System.out.println(w);
        
        // #region ParameterizedWorker

        ParameterizedWorker<Integer> w1 = new ParameterizedWorker<Integer>(
                1990,
                "firstName",
                "lastName",
                20,
                22);
        System.out.println(w1.getId());

        String uid = UUID.randomUUID().toString();
        ParameterizedWorker<String> w2 = new ParameterizedWorker<>(
                uid,
                "firstName",
                "lastName",
                20,
                22);
        System.out.println(w2.getId());

        // #endregion

        // #region MultiParameterized
        MultiParameterized<Integer, Double, String> mp1 = new MultiParameterized<>(
                1, 2.0, "3.0");
        System.out.println(mp1);

        MultiParameterized<String, String, String> mp2 = new MultiParameterized<>(
                "1", "2.0", "3.0");
        System.out.println(mp2);

        // #endregion

    }
}
