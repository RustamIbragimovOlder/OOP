package OOP_Seminars.OOP_Sem1_13dec;

import java.util.Objects;

public class Product {

    private String name;
    private int artikl;
    private float price;
    private int amount;

    public Product(String name, int artikl, float price, int amount) {
        this.name = name;
        this.artikl = artikl;
        this.price = price;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArtikl() {
        return artikl;
    }

    public void setArtikl(int artikl) {
        this.artikl = artikl;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return artikl == product.artikl && Float.compare(product.price, price) == 0 && amount == product.amount && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, artikl, price, amount);
    }

    @Override
    public String toString() {
        return "Product {" +
                "name='" + name + '\'' +
                ", artikl=" + artikl +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
