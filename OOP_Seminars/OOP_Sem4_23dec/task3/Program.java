// 1. Напишите обобщённую функцию сортировки.
// Она может отсортировать массив любого типа T.
// Любые ли типы можно сортировать? Какие ограничения надо наложить на тип T?
// 2. Отсортируйте несколько массивов разных типов с помощью этой функции.
// Можно ли отсортировать массив примитивных типов?

package OOP_Seminars.OOP_Sem4_23dec.task3;

public class Program {
    public static void main(String[] args) {
        String[] arr = {"hgf", "tgf", "asd", "bgs", "duj"};
        for (String str : arr) {
            System.out.println(str);
        }
        System.out.println();
        sortArray(arr);
        for (String str : arr) {
            System.out.println(str);
        }

        Integer[] mas = {6, 0, 3, 7, 2};
        for (int item : mas) {
            System.out.println(item);
        }
        System.out.println();
        sortArray(mas);
        for (int item : mas) {
            System.out.println(item);
        }
        
    }
    
    private static <T extends Comparable<T>> void sortArray(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    T temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                
            }
            
        }
    }


}
