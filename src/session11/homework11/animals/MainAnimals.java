package session11.homework11.animals;

public class MainAnimals {
    //Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'.
    // Now create a class 'Cats' with a method 'cats' which prints "Cats meow" and
    // a class 'Dogs' with a method 'dogs' which prints "Dogs bark", both inheriting the class 'Animals'.
    // Now create an object for each of the subclasses and call their respective methods.
    public static void main(String[] args) {

        Cats cats = new Cats();
        Dogs dogs = new Dogs();
        cats.cats();
        dogs.dogs();
    }
}
