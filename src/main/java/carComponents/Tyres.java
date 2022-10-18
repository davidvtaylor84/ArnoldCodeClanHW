package carComponents;

public class Tyres {

    private String manufacturer;
    private int tread;
    private double width;
    private double height;

    public Tyres(String manufacturer, int tread, double width, double height) {
        this.manufacturer = manufacturer;
        this.tread = tread;
        this.width = width;
        this.height = height;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getTread() {
        return tread;
    }

    public void setTread(int tread) {
        this.tread = tread;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
