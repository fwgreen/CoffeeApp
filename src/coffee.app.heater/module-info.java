module coffee.app.heater {
    exports coffee.app.heater;
    uses coffee.app.heater.Heater;
    provides coffee.app.heater.Heater with coffee.app.heater.ElectricHeater;
}