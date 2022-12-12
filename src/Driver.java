import java.util.Objects;

public abstract class Driver {
    private final String name;
    private final Boolean hasLicense;
    private final Integer experience;

    public Driver(String name, Boolean hasLicense, Integer experience) {
        this.name = ValidateUtils.validateString(name,"no name");
        this.hasLicense = ValidateUtils.validateBoolean(hasLicense);
        this.experience = ValidateUtils.validateInteger(experience, 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return Objects.equals(name, driver.name) && Objects.equals(hasLicense, driver.hasLicense) && Objects.equals(experience, driver.experience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hasLicense, experience);
    }

    public String getName() {return name;}
    public Boolean getHasLicense() {return hasLicense;}
    public Integer getExperience() {return experience;}
    abstract String start();
    abstract String stop();
    abstract String refuel();
    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", hasLicense=" + hasLicense +
                ", experience=" + experience +
                '}';
    }
}
