// 1. Создайте интерфейс IsGood<T>.
// Внутри него содержится единственная функция: boolean isGood (T item).
// Смысл этого интерфейса: ему дают элемент, он его одобряет или не одобряет.
// Создайте следующие детские классы:
//     • IsEven — ему дают целое число, он одобряет его, если оно чётное
//     • IsPositive — ему дают целое число, он одобряет его, если оно положительное
//     • BeginsWithA — ему дают строку, он одобряет её, если она начинается с буквы A
//     • BeginsWith — в конструкторе запоминает строку.
//     Ему дают строку, он проверяет, что она начинается с того, что он запомнил

// 2. Создайте обобщённую функцию filter. Ей дают любую коллекцию любого типа и одобрятель IsGood.
// Функция возвращает новую коллекцию, куда входят только одобренные элементы из коллекции.
// Продемонстрируйте, что это работает.

package OOP_PracticalTasks.OOP_PT4_27dec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        ArrayList<Integer> checkListInt = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            checkListInt.add(new Random().nextInt(50) - 25);
        }
        System.out.println("Исходный список целых чисел => ");
        System.out.println(checkListInt);

        IsGood<Integer> isGoodEven = new IsEven();
        System.out.println("Вывод четных чисел => ");
        System.out.println(filter(checkListInt, isGoodEven));

        IsGood<Integer> isGoodPositive = new IsPositive();
        System.out.println("Вывод положительных чисел => ");
        System.out.println(filter(checkListInt, isGoodPositive));

        List<String> checkListStr = Arrays.asList(
                "January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December");
        System.out.println("Исходный список строк => ");
        System.out.println(checkListStr);

        System.out.println("Вывод строк, которые начинаются на <J> => ");
        IsGood<String> isGoodBeginsWithA = new BeginsWithA();
        System.out.println(filter(checkListStr, isGoodBeginsWithA));

        System.out.println("Вывод строк, которые начинаются на <Dec> => ");
        IsGood<String> isGoodBegins = new BeginsWith("Dec");
        System.out.println(filter(checkListStr, isGoodBegins));

    }

    // обобщённая функция filter
    public static <T> Iterable<T> filter(Iterable<T> arrayIn, IsGood<T> isGood) {
        ArrayList<T> arrayOut = new ArrayList<T>();
        for (T element : arrayIn) {
            if (isGood.isGood(element)) {
                arrayOut.add(element);
            }
        }
        return arrayOut;
    }

}
