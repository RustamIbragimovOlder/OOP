// Создайте унаследованный класс ГорячийНапиток с дополнительным полем int температура.
// Создайте класс АвтоматГорячихНапитков, реализующий интерфейс ТорговыйАвтомат
// и реализуйте перегруженный метод getProduct(int name, int volume, int temperature),
// выдающий продукт, соответствующий имени, объему и температуре.
// В main проинициализируйте несколько ГорячихНапитков и АвтоматГорячихНапитков
// и позвольте покупателю купить товар.

package OOP_PracticalTasks.OOP_PT1_19dec;

public class Main {
    public static void main (String[] args) {
        
        СoldGoodsVendingMachine coldGoodsVendingMachine = new СoldGoodsVendingMachine();
        HotDrinkVendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine();

        coldGoodsVendingMachine.addProduct(1, new Product("чипсы", "Lays", 10001, 49.55f, 0.2f, 20));
        coldGoodsVendingMachine.addProduct(2, new Product("чипсы", "Русская картошка", 10002, 40.70f, 0.2f, 15));
        coldGoodsVendingMachine.addProduct(3, new Product("чипсы", "Pringles", 10003, 99.99f, 0.3f, 10));
        coldGoodsVendingMachine.addProduct(4, new Product("шоколад", "Аленка", 10004, 75.9f, 0.1f, 9));
        coldGoodsVendingMachine.addProduct(5, new Product("шоколад", "Ritter Sport", 10005, 115.9f, 0.1f, 5));
        coldGoodsVendingMachine.addProduct(6, new Product("шоколад", "Snickers", 10006, 80.9f, 0.1f, 7));
        
        hotDrinkVendingMachine.addHotDrink(7, new HotDrink("кофе", "Paulig Arabica", 10007, 35.4f, 0.2f, 35, 75));
        hotDrinkVendingMachine.addHotDrink(8, new HotDrink("чай", "Три слона", 10008, 15.3f, 0.2f, 42, 75));
        hotDrinkVendingMachine.addHotDrink(9, new HotDrink("какао", "Royal Forest", 10009, 28.75f, 0.2f, 15, 75));
        hotDrinkVendingMachine.addHotDrink(10, new HotDrink("компот", "Ягодный", 10010, 12.5f, 0.2f, 22, 70));
    
        // coldGoodsVendingMachine.displayingListProducts();
        hotDrinkVendingMachine.displayingListProducts();
        System.out.println("Введите номер товара => ");
        // int number = coldGoodsVendingMachine.enterNumber();
        int number = hotDrinkVendingMachine.enterNumber();
        HotDrink hotDrink = (HotDrink) hotDrinkVendingMachine.showProduct(number);
        hotDrinkVendingMachine.productBuy(hotDrink);

    }
}