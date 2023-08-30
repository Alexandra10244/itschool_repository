package session10.homework10.AnimalSoundProblem;

public class TestAnimal {

    public static void main(String[] args) {

        DogSound dog = new DogSound("Teckel");
        dog.sound();

        CatSound cat = new CatSound("Sfinx");
        cat.sound();

        WolfSound wolf = new WolfSound("Gray");
        wolf.sound();
    }
}
