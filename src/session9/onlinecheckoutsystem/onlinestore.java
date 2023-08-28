package session9.onlinecheckoutsystem;

public class onlinestore {

    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new Item("Laptop", 3544));
        shoppingCart.addItem(new Item("Montior", 2000));

        shoppingCart.printShoppingCart();
        System.out.println("Total cost: " + shoppingCart.getTotalCost());
    }
}
