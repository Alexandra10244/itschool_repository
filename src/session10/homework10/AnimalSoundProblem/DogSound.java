package session10.homework10.AnimalSoundProblem;

import session10.homework10.AnimalSoundProblem.AnimalSound;

public class DogSound extends AnimalSound {

    public DogSound(String name){
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("The dog makes “bark”");
    }
}
