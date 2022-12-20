// Создайте базовый класс Оружие.
// У оружия есть название, повреждение, скорострельность,
// количество зарядов в обойме, звук при выстреле — это методы.
// Напишите метод, который делает один выстрел.
// Напишите три класса-наследника Оружия.
// В них переопределите родительские методы.
// Проверьте, как работают все виды оружия.
// Создайте тестовый стенд для оружия — метод, который испытывает одно оружие.
// У мишени 100 единиц здоровья. Оружие стреляет в него, пока не убьёт.
// Протестируйте все виды оружия на стенде.

package OOP_Seminars.OOP_Sem2_17dec.Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Weapon> weapons = new ArrayList<>();
        weapons.add(new GunWeapon());
        weapons.add(new MachineGunWeapon());
        weapons.add(new FireGunWeapon());

        for (Weapon weapon : weapons) {
            System.out.println(weapon.getName());
            System.out.println(weapon.getSoundWhenShot());
            shootingTarget(weapon);
            System.out.println("---------------------");
        }

    }

    // метод стрельбы по мишени
    private static void shootingTarget (Weapon weapon) {
        
        float health = 100; // здоровье мишени (стенда)
        
        while (health > 0) {
            health -= weapon.getDamage();
            System.out.println(weapon.getSoundWhenShot());
            System.out.println(health);
            try {
                Thread.sleep(1000); // временная задержка
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
