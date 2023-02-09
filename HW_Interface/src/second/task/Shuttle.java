package second.task;

import java.util.Random;

public class Shuttle implements IStart{

    @Override
    public boolean preStartCheck() {
        Random rnd = new Random();
        int i = rnd.nextInt(10);
        if (i > 3){
            return true;
        }
        return false;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void mainStart() {
        System.out.println("Старт шатла");
    }
}
