package session12.practice.objectvsreference;

public class TestVehicle {

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle track = new Track();

        System.out.println(car.fuelType());
        System.out.println(track.fuelType());

        //explicit casting
        Car anotherCar = (Car) car;
        System.out.println(anotherCar.fuelType());
    }
}
