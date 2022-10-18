package vehicles;

import carComponents.EngineType;
import carComponents.SoundSystem;
import carComponents.Tyres;
import carComponents.WindowGlass;

public class HybridCar extends Vehicle{

    private int chargeCapacity;
    private int fuelCapacity;

    public HybridCar(String model, String manufacturer, String colour, double price, Tyres tyres, SoundSystem soundSystem, WindowGlass windowGlass, EngineType engineType, int chargeCapacity, int fuelCapacity) {
        super(model, manufacturer, colour, price, tyres, soundSystem, windowGlass, engineType);
        this.chargeCapacity = chargeCapacity;
        this.fuelCapacity = fuelCapacity;
    }

    public int getChargeCapacity() {
        return chargeCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }
}
