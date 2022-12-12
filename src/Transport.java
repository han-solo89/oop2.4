import java.util.Objects;
public abstract class Transport {
    private final String brand;
    private final String model;
    private final Integer enginePower;

    public Transport(String brand, String model, Integer enginePower) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.enginePower = ValidateUtils.validateInteger(enginePower,2);
    }

    private String validateCarParameters(String model) {
        return model;
    }

    public String getBrand() {return brand;}

    public String getModel() {return model;}

    public Integer getEnginePower() {return enginePower;}

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", enginePower=" + enginePower +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(enginePower, transport.enginePower);
    }
    @Override
    public int hashCode() {
        return Objects.hash(brand, model, enginePower);
    }

    abstract void startToMove();
    abstract void finish();

}
