package coffee.app.pump;

import coffee.app.heater.Heater;

public class Thermosiphon implements Pump {

    private Heater heater = Heater.getInstance();

    private static final Thermosiphon instance = new Thermosiphon();

    public void pump() {
        if (heater.isHot()) {
            System.out.println("=> => pumping => =>");
        }
    }

    public static Pump provider() {
        return instance;
    }
}