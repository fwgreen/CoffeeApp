package coffee.app.heater;

public class ElectricHeater implements Heater {

    private boolean heating;

    private static final ElectricHeater instance = new ElectricHeater();

    public void on() {
        System.out.println("~~~heating~~~");
        this.heating = true;
    }

    public void off() {
        this.heating = false;
    }

    public boolean isHot() {
        return this.heating;
    }

    public static Heater provider() {
        return instance;
    }
}