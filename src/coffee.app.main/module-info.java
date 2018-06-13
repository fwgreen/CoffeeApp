module coffee.app.main {
    exports coffee.app.main;
    requires coffee.app.heater;
    requires coffee.app.pump;
    uses coffee.app.pump.Pump;
    uses coffee.app.heater.Heater;

}