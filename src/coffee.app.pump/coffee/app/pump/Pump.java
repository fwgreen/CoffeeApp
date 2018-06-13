package coffee.app.pump;

import java.util.ServiceLoader;

public interface Pump {

    static Pump getInstance() {
        return ServiceLoader.load(Pump.class).findFirst().get();
    }

    void pump();
}