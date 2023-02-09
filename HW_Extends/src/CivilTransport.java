public class CivilTransport extends AirTransport{
    private int numberOfPassengers;
    private boolean businessClass = true;

    public CivilTransport(double power, double maxSpeed, double weight, String brand, double wingspan, double minFlyLine, int numberOfPassengers, boolean businessClass){
        super(power, maxSpeed, weight, brand, wingspan, minFlyLine);
        this.numberOfPassengers = numberOfPassengers;
        this.businessClass = businessClass;
    }

    private String businessClassYesNo(){
        if (businessClass){
            return "Да";
        } else {
            return "Нет";
        }
    }

    public void printPassengers(int passToFly){
        if (passToFly == 0){
            System.out.println("Самолет должен полететь пустой? Ты ввел \'0\'");
        } else if (passToFly < 0){
            System.out.println("Количество пассажиров не может быть отрицательным!");
        } else if (numberOfPassengers >= passToFly){
            System.out.println("В самолете хватит места всем!");
        } else {
            System.out.println("Самолет маловат! Найди самолет побольше!");
        }
    }

    @Override
    public void printTransportInfo(){
        System.out.printf("\n%s:, Мощность (л.с.): %.1f, Мощьность (кВ): %.2f, Макс. скорость: %.1f, Вес: %.2f, Размах Крыла: %.2f, Мин. взлетно посадочная полоса: %.2f, " +
                        "Кол-во пассажиров: %d, Наличие бизнес класса: %s\n",
                getBrand(), getPower(), getPowerKB(), getMaxSpeed(), getWeight(), getWingspan(), getMinFlyLine(), numberOfPassengers, businessClassYesNo());
    }

}
