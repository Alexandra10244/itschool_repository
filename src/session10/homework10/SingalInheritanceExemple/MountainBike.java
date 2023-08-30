package session10.homework10.SingalInheritanceExemple;

public class MountainBike extends Bicycles{

    private String tireType;
    private String suspencion;

    public void ajustSuspension(String suspencion){
        this.suspencion=suspencion;
    }

    @Override
    public void speedUp(int speed) {
        super.speedUp(speed);
    }
}
