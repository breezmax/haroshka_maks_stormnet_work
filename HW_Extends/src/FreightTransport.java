public class FreightTransport extends GroundTransport{
    double liftingCapacity;

    public FreightTransport(double power, double maxSpeed, double weight, String brand, int numberOfWheels, double fuelConsumption, double liftingCapacity){
        super(power, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.liftingCapacity = liftingCapacity;
    }

    public void printCapacity(double cargo){
        if (cargo < 0){
            System.out.println("Недопустимое значение!");
        } else if (cargo == 0) {
            System.out.println("Грузовик должен поехать пустым? Ты ввел \'0\'");
        } else if (liftingCapacity >= cargo){
            System.out.println("Грузовик загружен!");
        } else {
            System.out.println("Вам нужен грузовик побольше!");
        }
    }

    @Override
    public void printTransportInfo(){
        System.out.printf("\n%s:, Мощность (л.с.): %.1f, Мощьность (кВ): %.2f, Макс. скорость: %.1f, Вес: %.2f, Кол-во колес: %d, Расход топлива на 100 км: %.1f, Грузоподъемность: %.2f\n",
                getBrand(), getPower(), getPowerKB(), getMaxSpeed(), getWeight(), getNumberOfWheels(), getFuelConsumption(), liftingCapacity);

    }

}
