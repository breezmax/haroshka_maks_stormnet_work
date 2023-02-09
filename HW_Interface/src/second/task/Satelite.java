package second.task;

import java.util.Random;
import java.util.Scanner;

public class Satelite implements IStart{
    @Override
    public boolean preStartCheck() {
        System.out.println("Для запуска Спутника на ордиту введи \'1\' в консоль:");
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        if (start == 1){
            return true;

        }
        return false;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели спутника запущены. Все системы в норме.");
    }

    @Override
    public void mainStart() {
        System.out.println("Старт спутника");
    }
}
