package second.task;

public class Program {
    public static void main(String[] args) {
        Shuttle sht = new Shuttle();
        Spaceport space = new Spaceport();
        space.start(sht);

        Satelite stl = new Satelite();
        space.start(stl); // Запуск, если 1 в консоли

        SpaceX x = new SpaceX(5, 5);
        space.start(x); // Запуск, если isCurrentFuel = maxFuel
    }
}
