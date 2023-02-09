import java.util.Scanner;

public class HM3_Task2 {
    public static void main(String[] args) {
        /*
        Author: Maksim Goroshko

        2) Одноклеточная амеба каждые 3 часа делится на 2 клетки.
        Определить, сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
        */

        int amebaCount;
        int sumPerThreeHour;
        int wholeSumAbema;

        Scanner amebaCountScanner = new Scanner(System.in);
        System.out.print("Сколько ты увидел амеб?: ");
        amebaCount = amebaCountScanner.nextInt();
        wholeSumAbema = amebaCount;

        for (int i = 3; i <= 24; i = i+3) {
            sumPerThreeHour = wholeSumAbema * 2;
            System.out.println("Через " + i + " часа(-ов) будет " + sumPerThreeHour);
            wholeSumAbema = sumPerThreeHour;

        }

    }
}
