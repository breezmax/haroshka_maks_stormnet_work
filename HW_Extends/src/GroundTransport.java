public abstract class GroundTransport extends Transport{
    private int numberOfWheels;
    private double fuelConsumption;

    public GroundTransport(double power, double maxSpeed, double weight, String brand, int numberOfWheels, double fuelConsumption){
        super(power, maxSpeed, weight, brand);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    public double getFuelConsumption() {
        return fuelConsumption;
    }

}
