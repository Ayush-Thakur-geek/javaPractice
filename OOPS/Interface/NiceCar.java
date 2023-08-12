package OOPS.Interface;

public class NiceCar {
    private Engine engine;
    private Media player = new CD();

    public NiceCar() {
        this.engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void upgrade() {
        this.engine = new ElectricEngine();
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMedia() {
        player.start();
    }

    public void stopMedia() {
        player.stop();
    }
}
