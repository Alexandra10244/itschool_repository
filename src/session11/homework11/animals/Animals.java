package session11.homework11.animals;

public abstract class Animals {

    public abstract void cats();

    public abstract void dogs();
}

class Cats extends Animals {
    @Override
    public void cats() {
        System.out.println("Cats meow");
    }

    @Override
    public void dogs() {

    }
}

class Dogs extends Animals {

    @Override
    public void cats() {

    }

    @Override
    public void dogs() {
        System.out.println("Dogs bark");
    }
}
