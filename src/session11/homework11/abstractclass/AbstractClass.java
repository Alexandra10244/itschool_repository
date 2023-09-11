package session11.homework11.abstractclass;

public abstract class AbstractClass {
    //An abstract class has a constructor which prints "This is constructor of abstract class",
    // an abstract method named 'a_method' and a non-abstract method which prints "This is a normal method of abstract class".
    // A class 'SubClass' inherits the abstract class and has a method named 'a_method' which prints "This is abstract method".
    // Now create an object of 'SubClass' and call the abstract method and the non-abstract method.
    // (Analyse the result)
    public AbstractClass() {
        System.out.println("This is constructor of abstract class.");
    }

    public abstract void a_method();

    public void non_abstract() {

        System.out.println("This is a normal method of astract class");
    }
}

class SubClass extends AbstractClass {
    @Override
    public void a_method() {
        System.out.println("This is abstract method");
    }
}
