package task3;

public class SmartBulb implements SmartDevice {

    private boolean on;
    private int brightness; // 0-100

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
        return on ? "ON (brightness: " + brightness + "%)" : "OFF";
    }

    // Unique to SmartBulb - not part of the SmartDevice contract.
    public void setBrightness(int level) {
        if (level < 0 || level > 100) {
            throw new IllegalArgumentException("Brightness must be between 0 and 100.");
        }
        brightness = level;
    }
}
