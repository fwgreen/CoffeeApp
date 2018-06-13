package coffee.app.heater;

import java.util.ServiceLoader;

public interface Heater {

    static Heater getInstance() {
        return ServiceLoader.load(Heater.class).findFirst().get();
    }

    void on();
    void off();
    boolean isHot();
}