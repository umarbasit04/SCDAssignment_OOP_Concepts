package task3;

/**
 * Task 3: The contract every smart device must fulfill, regardless of what
 * kind of device it actually is.
 */
public interface SmartDevice {
    void turnOn();
    void turnOff();
    String getStatus();
}
