package OOP_Seminars.OOP_Sem4_23dec;

public class ExampleTheory {
    public static void main(String[] args) {
        // вызов метода
        // printArray(array);

        // вызов класса
        // ListOf<Integer>;
        // или другой тип
         
    }

    // Пример 1 Переменные
    
    // 1 день
    static void printArray1 (int[] array) {
        for (int item : array) {
            System.out.println(item);
        }
    }

    // 2 день
    static void printArray2 (String[] array) {
        for (String item : array) {
            System.out.println(item);
        }
    }

    // 3 день
    static void printArray3 (float[] array) {
        for (float item : array) {
            System.out.println(item);
        }
    }

    // каждый раз новая однообразная функция, который различаются типом переменных
    // все три метода можно заменить одним
    static <T> void printArray (T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }
    // Т - типовой параметр

    // Пример 2 Классы

    class ListOfIntegers {
        private int[] array;
        int get (int index) {return array[index];}
    }

    class ListOfStrings {
        private String[] array;
        String get (int index) {return array[index];}
    }

    class ListOfFloats {
        private float[] array;
        float get (int index) {return array[index];}
    }

    // все заменяем на класс
    class ListOf<T> {
        private T[] array;
        T get (int index) {return array[index];}
    }

}