public class PassengerTransport extends GroundTransport{
    String bodyOfCar;
    int numberOfPassengers;

    public PassengerTransport(double power, double maxSpeed, double weight, String brand, int numberOfWheels, double fuelConsumption, String bodyOfCar, int numberOfPassengers){
        super(power, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.bodyOfCar = bodyOfCar;
        this.numberOfPassengers = numberOfPassengers;

    }

    public void printRoadInfo(double roadTime){
        double maxDistance = roadTime * getMaxSpeed();
        System.out.printf("За время %.1f ч, автомобиль %s двигаясь с максимальной " +
                "скоростью %.1f км/ч проедет %.2f км и израсходует %.1f литров топлива.\n", roadTime, getBrand(), getMaxSpeed(), maxDistance, calculateFuel(maxDistance));
    }

    private double calculateFuel(double maxDistance){

        return (maxDistance / 100) * getFuelConsumption();
    }

    @Override
    public void printTransportInfo(){
        System.out.printf("\n%s: Мощность (л.с.): %.1f, Мощьность (кВ): %.2f, Макс. скорость: %.1f, Вес: %.2f, Кол-во колес: %d, Расход топлива на 100 км: %.1f, Тип кузова: %s, " +
                        "Кол-во пассажирских мест: %d\n",
                getBrand(), getPower(), getPowerKB(), getMaxSpeed(), getWeight(), getNumberOfWheels(), getFuelConsumption(), bodyOfCar, numberOfPassengers);

    }

}
