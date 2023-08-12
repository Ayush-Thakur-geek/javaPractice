package OOPS.Interface;

public class Car implements Engine, Brake, Media{

    int a = 90;
    @Override
    public void brake() {
        System.out.println("brake");
    }

    @Override
    public void start() {
        System.out.println("key");
    }

    @Override
    public void stop() {
        System.out.println("halt");
    }

    @Override
    public void acc() {
        System.out.println("torque");
    }
}
