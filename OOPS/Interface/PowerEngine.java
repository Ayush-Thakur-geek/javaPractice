package OOPS.Interface;

public class PowerEngine implements Engine {
    @Override
    public void start() {
        System.out.println("power start");
    }

    @Override
    public void stop() {
        System.out.println("power stop");
    }

    @Override
    public void acc() {
        System.out.println("power acc");
    }
}
