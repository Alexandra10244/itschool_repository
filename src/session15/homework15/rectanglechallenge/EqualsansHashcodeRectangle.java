package session15.homework15.rectanglechallenge;

public class EqualsansHashcodeRectangle {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setWidth(20);
        rectangle1.setHeight(10);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setWidth(20);
        rectangle2.setHeight(10);

        System.out.println("rectangle1 equals rectangle2: " + rectangle1.equals(rectangle2));
        System.out.println("rectangle1 hashcode: " + rectangle1.hashCode());
        System.out.println("rectangle2 hashcode: " + rectangle2.hashCode());
    }
}
