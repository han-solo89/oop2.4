public class Car extends Transport implements Competing {
    private final Integer pitStopTime;
    private final Integer maxSpeed;
    private final Integer bestLapTime;
    public Car(String brand, String model, Integer enginePower, Integer pitStopTime, Integer maxSpeed, Integer bestLapTime) {
        super(brand, model, enginePower);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
    }

    @Override
    void startToMove() { System.out.println("Car started");}

    @Override
    void finish() { System.out.println("Car finished");}

    @Override
    public void  getPitStop() {System.out.println("pit-stop time is " + pitStopTime);}
    @Override
    public void  getBestLapTime() {System.out.println("best lap time is " + bestLapTime);}

    @Override
    public void getMaxSpeed() {System.out.println("max speed is " + maxSpeed);}


}
