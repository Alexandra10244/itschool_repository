package session10.homework10.AnimalSoundProblem;

import session10.homework10.AnimalSoundProblem.AnimalSound;

public class CatSound extends AnimalSound {

    public CatSound(String name){
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("The cat makes “meow”");
    }
}
