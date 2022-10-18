package carComponents;

public class WindowGlass {


    private String manufacturer;
    private double opacity;

    public WindowGlass(String manufacturer, double opacity) {
        this.manufacturer = manufacturer;
        this.opacity = opacity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getOpacity() {
        return opacity;
    }
}
