package session8.homework8;

public class ShoppingList {
    //Create a shopping list with Array and print the values
    public static void main(String[] args) {
        String[] list = {"tomatoes", "water", "milk", "carrot", "bread"};

        System.out.println("My shopping list: ");
        for (String product : list) {
            System.out.println(product);
        }
    }
}
