public class Truck extends Transport implements Competing {
    private final Integer pitStopTime;
    private final Integer maxSpeed;
    private final Integer bestLapTime;
    public Truck(String brand, String model, Integer enginePower, Integer pitStopTime, Integer maxSpeed, Integer bestLapTime) {
        super(brand, model, enginePower);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
    }

    @Override
    void startToMove() { System.out.println("truck started");}

    @Override
    void finish() { System.out.println("truck finished");}

    @Override
    public void  getPitStop() {System.out.println("truck pit-stop time is " + pitStopTime);}
    @Override
    public void  getBestLapTime() {System.out.println("truck best lap time is " + bestLapTime);}

    @Override
    public void getMaxSpeed() {System.out.println("truck max speed is " + maxSpeed);}


}
