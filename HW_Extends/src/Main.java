public class Main {
    public static void main(String[] args) {
        // Author: Maksim Goroshko     Module: Наследование (без интерфейсов)
        // Легковой
        PassengerTransport ps = new PassengerTransport(32,220.5,3560.7, "BMW", 4, 10.8,"Седан", 4);
        ps.printTransportInfo();
        ps.printRoadInfo(3.5);

        // Грузовой
        FreightTransport fr = new FreightTransport(45, 180.8, 6950, "Dacia", 8, 18, 20);
        fr.printTransportInfo();
        fr.printCapacity(7);

        // Гражданский
        CivilTransport civ = new CivilTransport(2500, 1000, 30000, "Airbus", 59.5, 1500, 150, true);
        civ.printTransportInfo();
        civ.printPassengers(151);

        // Военный
        MilitaryTransport ml = new MilitaryTransport(2650,1200, 35000, "Zipline", 60.5, 1800, 12, false);
        ml.printTransportInfo();

    }
}