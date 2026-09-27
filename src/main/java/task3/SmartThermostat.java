package task3;

public class SmartThermostat implements SmartDevice {

    private boolean on;
    private double temperature; // in Celsius

    @Override
    public void turnOn() {
        on = true;
    }

    @Override
    public void turnOff() {
        on = false;
    }

    @Override
    public String getStatus() {
        return on ? "ON (target temperature: " + temperature + "C)" : "OFF";
    }

    // Unique to SmartThermostat - not part of the SmartDevice contract.
    public void setTemperature(double temp) {
        this.temperature = temp;
    }
}
