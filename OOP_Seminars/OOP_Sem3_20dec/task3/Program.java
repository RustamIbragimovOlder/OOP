// 1. Создайте и наполните LinkedList<String> строками.
// 2. Используйте descendingIterator (), чтобы пройтись по нему с конца к началу.
// 3. Используйте метод LinkedList<String> listIterator (), чтобы получить свободно перемещающийся итератор.
// Пройдитесь по списку и замените все строки их заглавными версиями.
// 4. Напишите программу, которая позволяет пользователю управлять перемещением ListIterator<String> по шагам.
// Нужны следующие команды:
// Шаг вперёд
// Шаг назад
// Удалить элемент на текущей позиции
// Вставить новый элемент на текущей позиции


package OOP_Seminars.OOP_Sem3_20dec.task3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
// import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        // пункт 1
        LinkedList<String> list = new LinkedList<>();
        list.add("create");
        list.add("update");
        list.add("read");
        list.add("delete");


        // пункт 2
        Iterator<String> iterator = list.descendingIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        

        // пункт 3
        System.out.println();
        ListIterator<String> iterator1 = list.listIterator(list.size());

        while (iterator1.hasPrevious()) {
            System.out.println(iterator1.previous().toUpperCase());
        }

        // пункт 4
        // System.out.println();
        // Scanner scanner = new Scanner(System.in);
        // ListIterator<String> iterator2 = list.listIterator();

        // String action = scanner.next();





        // scanner.close();
        
    }
    
}
