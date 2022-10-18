package carComponents;

public enum EngineType {

    PETROL_ENGINE("Petrol"),
    HYBRID("Petrol/Battery"),
    ELECTRIC("Battery");

    private final String powerType;

    EngineType(String powerType) {
        this.powerType = powerType;
    }

    public String getPowerType() {
        return powerType;
    }
}


