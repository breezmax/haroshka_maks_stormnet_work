abstract class AirTransport extends Transport{
    private double wingspan;
    private double minFlyLine;

    public AirTransport(double power, double maxSpeed, double weight, String brand, double wingspan, double minFlyLine){
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minFlyLine = minFlyLine;

    }

    abstract void printTransportInfo();

    public double getWingspan() {
        return wingspan;
    }

    public double getMinFlyLine() {
        return minFlyLine;
    }

}
