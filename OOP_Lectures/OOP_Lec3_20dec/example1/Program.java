package OOP_Lectures.OOP_Lec3_20dec.example1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(12);
        nums.add(123);
        nums.add(1234);
        nums.add(12345);

        Iterator<Integer> iter = nums.iterator(); // можно использовать итератор
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        // Worker worker = new Worker("Имя", "Фамилия", 23, 4567);

        // Iterator<Object> components = worker.iterator(); // нельзя использовать итератор
        
    }
    
}