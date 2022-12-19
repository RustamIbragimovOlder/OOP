package OOP_PracticalTasks.OOP_PT1_19dec;

import java.util.Objects;

public class Product {

    private String type;
    private String name;
    private int artikl;
    private float price;
    private float volume;
    private int amount;

    public Product(String type, String name, int artikl, float price, float volume, int amount) {
        this.type = type;
        this.name = name;
        this.artikl = artikl;
        this.price = price;
        this.volume = volume;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
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
        return artikl == product.artikl && Float.compare(product.price, price) == 0 && Float.compare(product.volume, volume) == 0 && amount == product.amount && Objects.equals(name, product.name) && Objects.equals(type, product.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, artikl, price, volume, amount);
    }

    @Override
    public String toString() {
        return "Product {" +
                "type = " + type + 
                ", name = " + name + 
                ", artikl = " + artikl +
                ", price = " + price +
                ", volume = " + volume +
                ", amount = " + amount +
                '}';
    }
}
