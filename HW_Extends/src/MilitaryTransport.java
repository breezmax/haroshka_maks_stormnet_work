public class MilitaryTransport extends AirTransport{
    int numberOfRocket;
    boolean catapultSystem = true;

    public MilitaryTransport(double power, double maxSpeed, double weight, String brand, double wingspan, double minFlyLine, int numberOfRocket, boolean catapultSystem){
        super(power, maxSpeed, weight, brand, wingspan, minFlyLine);
        this.numberOfRocket = numberOfRocket;
        this.catapultSystem = catapultSystem;

    }

    private String catapultYesNo(){
        if (catapultSystem){
            return "Да";
        } else {
            return "Нет";
        }
    }

    private void checkFireRocket(){
        if (numberOfRocket > 0){
            System.out.println("Ракета пошла...!");
        } else if (numberOfRocket == 0){
            System.out.println("Боеприпасы отсутствуют!");
        } else {
            System.out.println("Ошибка данных для количества ракет!");
        }
    }

    private void checkCatapult(){
        if (catapultSystem){
            System.out.println("Катапультирование прошло успешно!");
        } else {
            System.out.println("У вас нет такой системы!");
        }
    }

    @Override
    public void printTransportInfo(){
        System.out.printf("\n%s:, Мощность (л.с.): %.1f, Мощьность (кВ): %.2f, Макс. скорость: %.1f, Вес: %.2f, Размах Крыла: %.2f, Мин. взлетно посадочная полоса: %.2f, Кол-во ракет: %d, " +
                        "Наличие системы катапультирования: %s\n",
                getBrand(), getPower(), getPowerKB(), getMaxSpeed(), getWeight(), getWingspan(), getMinFlyLine(), numberOfRocket, catapultYesNo());
        checkFireRocket();
        checkCatapult();
    }

}
