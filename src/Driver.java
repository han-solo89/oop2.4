public abstract class Driver {
    private final String name;
    private final Boolean hasLicense;
    private final Integer experience;

    public Driver(String name, Boolean hasLicense, Integer experience) {
        this.name = ValidateUtils.validateString(name,"no name");
        this.hasLicense = ValidateUtils.validateBoolean(hasLicense);
        this.experience = ValidateUtils.validateInteger(experience, 1);
    }

    public String getName() {return name;}
    public Boolean getHasLicense() {return hasLicense;}
    public Integer getExperience() {return experience;}

    abstract String start();
    abstract String stop();
    abstract String refuel();

}
