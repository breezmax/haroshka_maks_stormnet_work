package second.task;

import java.util.Scanner;

public class SpaceX implements IStart{
    double isCurrentFuel;
    double maxFuel;

    public SpaceX(double isCurrentFuel, double maxFuel) {
        this.isCurrentFuel = isCurrentFuel;
        this.maxFuel = maxFuel;
    }

    @Override
    public boolean preStartCheck() {
        if (isCurrentFuel >= 0 && maxFuel >= 0) {

            if (isCurrentFuel < maxFuel) {
            System.out.println("У SpaceX недрстаточно топлива для полета");

            } else if (isCurrentFuel > maxFuel) {
            System.out.println("Слишком много топлива, ты забыл закрыть вентиль!");

            } else if (isCurrentFuel == maxFuel) {
            return true;
        }
    }
        return false;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели SpaceX запущены. Все системы в норме.");
    }

    @Override
    public void mainStart() {
        System.out.println("Старт SpaceX");
    }
}
