package OOPS.Interface;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        Media carMedia = new CD();
//        carMedia.stop();
//        car.stop();

        NiceCar car1 = new NiceCar();

        car1.start();
        car1.stop();

        car1.upgrade();

        car1.start();
        car1.stop();
    }
}
