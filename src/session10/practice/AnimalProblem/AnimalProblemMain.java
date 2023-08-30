package session10.practice.AnimalProblem;

public class AnimalProblemMain {

    public static void main(String[] args) {

        Mammal mammal = new Mammal("Wolf");
        mammal.eat();

        Bird bird = new Bird("Sparrow");
        bird.eat();

        Fish fish = new Fish("Piranha");
        fish.eat();
    }
}
