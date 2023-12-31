package session9.onlinecheckoutsystem;

import java.util.UUID;

public class Item {

    private UUID id;
    private String name;
    private double price;

    public Item(String name, double price) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.price = price;
    }

    public Item() {
    }

    @Override
    public String toString() {
        return "Id: " + id + " Name: " + name + "Price: " + price;
    }

    public double getPrice() {
        return price;
    }
}
