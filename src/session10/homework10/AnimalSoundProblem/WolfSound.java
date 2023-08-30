package session10.homework10.AnimalSoundProblem;

import session10.homework10.AnimalSoundProblem.AnimalSound;

public class WolfSound extends AnimalSound {

    public WolfSound(String name){
        super(name);
    }

    @Override
    public void sound(){
        System.out.println("The wolf makes “how”");
    }
}
