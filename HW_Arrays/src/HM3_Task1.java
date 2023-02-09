import java.util.Scanner;

public class HM3_Task1 {
    public static void main(String[] args) {
        /*
        Author: Maksim Goroshko

        1) Начав тренировки, спортсмен в первый день пробежал 10 км.
        Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
        Какой суммарный путь пробежит спортсмен за 7 дней?
        */

        double distanceFirstDay;
        double distanceWeek = 0;
        double nextDay;

        Scanner firstDayDistanceScanner = new Scanner(System.in);
        System.out.print("Укажи, какую дистанцию пробежал легкокотлет в первый день: ");
        distanceFirstDay = firstDayDistanceScanner.nextDouble();

        for (int i = 0; i < 6; i++) {
            int day = 2;
            nextDay = (distanceFirstDay * 0.1) + distanceFirstDay;
            System.out.println("Дистанция " + (i+2) + "-ого дня: " + nextDay);
            distanceWeek += nextDay;
            distanceFirstDay = nextDay;

        }

        System.out.println("Дистанция за неделю равна: " + (distanceWeek + distanceFirstDay));
    }
}
