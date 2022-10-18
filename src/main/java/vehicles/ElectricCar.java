package vehicles;

import carComponents.EngineType;
import carComponents.SoundSystem;
import carComponents.Tyres;
import carComponents.WindowGlass;

public class ElectricCar extends Vehicle{

    private int chargeCapacity;

    public ElectricCar(String model, String manufacturer, String colour, double price, Tyres tyres, SoundSystem soundSystem, WindowGlass windowGlass, EngineType engineType, int chargeCapacity) {
        super(model, manufacturer, colour, price, tyres, soundSystem, windowGlass, engineType);
        this.chargeCapacity = chargeCapacity;
    }

    public int getChargeCapacity() {
        return chargeCapacity;
    }
}
