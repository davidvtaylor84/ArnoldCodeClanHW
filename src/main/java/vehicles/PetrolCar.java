package vehicles;

import carComponents.EngineType;
import carComponents.SoundSystem;
import carComponents.Tyres;
import carComponents.WindowGlass;

public class PetrolCar extends Vehicle{

    private int fuelTankCapacity;

    public PetrolCar(String model, String manufacturer, String colour, double price, Tyres tyres, SoundSystem soundSystem, WindowGlass windowGlass, EngineType engineType, int fuelTankCapacity) {
        super(model, manufacturer, colour, price, tyres, soundSystem, windowGlass, engineType);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public int getFuelTankCapacity() {
        return fuelTankCapacity;
    }
}
