package session4.homework;

public class TriangleType {

    public static void main(String[] args) {

        int sideOne = 14;
        int sideTwo = 14;
        int sideThree = 16;

        String triangleType = (sideOne == sideTwo && sideOne == sideThree)
                ? "Equilateral"
                : (sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree)
                ? "Isoscel"
                : "Scalene";

        System.out.println("The triangle type is: "+ triangleType);
    }
}
