// 1. Пара хранит в себе два значения произвольных типов, например,
// Pair<Integer, String> или Pair<Float, Double>.
// Напишите самодельный класс Pair, используя обобщения.
// У него должны быть конструкторы, геттеры и toString ().
// 2. Тройка хранит в себе три значения произвольных типов, например,
// Triple<Integer, Integer, Integer>.
// Напишите самодельный класс Triple.
// 3. Напишите функцию, которая возвращает тройку случайных целых чисел в диапазоне от 0 до 255 (то есть случайный цвет).

package OOP_Seminars.OOP_Sem4_23dec.task1;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<Integer,String>(29, "March");
        Pair<Integer, String> pair2 = new Pair<Integer,String>(23, "February");
        System.out.println(pair1 + "\n" + pair2);

        List<Triple<Integer, Float, String>> triplelist = Arrays.asList(
            new Triple<>(35, 3.14f, "Toyota"), 
            new Triple<>(201, 13.5f, "Volga"));
        
        System.out.println("------");
        System.out.println(triplelist);

        System.out.println("--------");
        System.out.println(getRandomColor());

    }

    private static Triple<Integer, Integer, Integer> getRandomColor() {
        return new Triple<>(getNumber(), getNumber(), getNumber());

    }

    private static int getNumber() {
        return new Random().nextInt(256);
    }
    
}
