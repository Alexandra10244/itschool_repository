package session11.homework11.parent;

public abstract class Parent {

    public abstract void message();
}

class FirstSubclass extends Parent {
    @Override
    public void message() {
        System.out.println("This is first subclass.");
    }
}

class SecndSubclass extends Parent {

    @Override
    public void message() {
        System.out.println("This is second subclass");
    }
}
