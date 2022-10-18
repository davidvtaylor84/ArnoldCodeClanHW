package vehicles;

import carComponents.EngineType;
import carComponents.SoundSystem;
import carComponents.Tyres;
import carComponents.WindowGlass;

public abstract class Vehicle implements IDrive{

    private String model;
    private String manufacturer;
    private String colour;
    private double price;
    Tyres tyres;
    SoundSystem soundSystem;
    WindowGlass windowGlass;
    EngineType engineType;

    public Vehicle(String model, String manufacturer, String colour, double price, Tyres tyres, SoundSystem soundSystem, WindowGlass windowGlass, EngineType engineType) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.colour = colour;
        this.price = price;
        this.tyres = tyres;
        this.soundSystem = soundSystem;
        this.windowGlass = windowGlass;
        this.engineType = engineType;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }

    public String drive(){
        return "Vroom vroom!";
    }

    public void setSoundSystem(SoundSystem soundSystem) {
        this.soundSystem = soundSystem;
    }

    public void setWindowGlass(WindowGlass windowGlass) {
        this.windowGlass = windowGlass;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public String getPowerTypeFromEnum(){
        return this.engineType.getPowerType();
    }
}
