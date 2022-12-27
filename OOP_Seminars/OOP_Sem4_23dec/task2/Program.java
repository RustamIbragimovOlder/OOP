// Напишите самодельный обобщённый класс MyCollection, внутри которого спрятан массив.
// Используйте обобщения, чтобы класс мог хранить данные произвольного типа,
// например, MyCollection<Integer> или MyCollection<String>.
// Обязательные операции, которые надо прописать:
//     get: достаёт элемент по указанному индексу
//     set: перезаписывает элемент по указанному индексу
//     size: сколько элементов в массиве?
//     toString
// (Необязательная часть, если есть время).
// Пропишите операцию add, которая делает динамическое перевыделение массива
// и добавляет новый элемент в конец.

package OOP_Seminars.OOP_Sem4_23dec.task2;

public class Program {
    public static void main(String[] args) {
        
        MyCollection<Integer> myCollection = new MyCollection<>();
        myCollection.add(1);
        myCollection.add(2);
        myCollection.add(3);
        myCollection.add(4);
        System.out.println(myCollection);
        


    }
    
}
