package session15.homework15.productchallenge;

public class EqualsAndHashcodeForProduct {

    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setId(123);

        Product product2 = new Product();
        product2.setId(123);

        System.out.println("product1 equals product2: " + product1.equals(product2));
        System.out.println("Hascode product1:" + product1.hashCode());
        System.out.println("Hascode product2:" + product2.hashCode());

        product1.setId(456);
        System.out.println("Hascode product1:" + product1.hashCode());
        System.out.println("Hascode product2:" + product2.hashCode());
    }
}
