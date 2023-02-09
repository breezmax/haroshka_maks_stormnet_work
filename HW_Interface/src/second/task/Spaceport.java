package second.task;

public class Spaceport{
    public void start(IStart start) {
        if(start.preStartCheck()){
            start.startEngine();
            for (int i = 10; i >= 0; i--){
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            start.mainStart();
        } else{
            System.out.println("Предстартовая проверка провалена");

        }
    }
}

