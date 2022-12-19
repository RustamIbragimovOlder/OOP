package OOP_Seminars.OOP_Sem1_13dec;

// import java.util.HashMap;

abstract public class VendingMachine {

    public abstract int enterNumber();

    public abstract Product showProduct(int productNumber);

    public abstract void productBuy(Product product);

    public abstract void displayingListProducts();

}
