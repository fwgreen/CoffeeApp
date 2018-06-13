module coffee.app.pump {
    exports coffee.app.pump;
    requires coffee.app.heater;
    uses coffee.app.pump.Pump;
    uses coffee.app.heater.Heater;
    provides coffee.app.pump.Pump with coffee.app.pump.Thermosiphon;
}