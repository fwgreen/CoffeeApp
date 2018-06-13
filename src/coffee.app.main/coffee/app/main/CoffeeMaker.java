package coffee.app.main;

import coffee.app.heater.Heater;
import coffee.app.pump.Pump;

public class CoffeeMaker {

    private final Heater heater;
    private final Pump pump;

    public CoffeeMaker() {
        this.heater = Heater.getInstance();
        this.pump =  Pump.getInstance();
    }

    public void brew() {
        heater.on();
        pump.pump();
        System.out.println("[_]P Coffee [_]P");
        heater.off();
    }
}