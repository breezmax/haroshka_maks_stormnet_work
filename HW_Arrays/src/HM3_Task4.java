import java.util.Scanner;

public class HM3_Task4 {
    public static void main(String[] args) {
        /*
        Author: Maksim Goroshko

        4) Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
        */

        int A;
        int B;
        int i = 1;
        int multiplicationAB = 0;

        Scanner enterA = new Scanner(System.in);
        System.out.println("Введи число A: ");
        A = enterA.nextInt();

        Scanner enterB = new Scanner(System.in);
        System.out.println("Введи число B: ");
        B = enterB.nextInt();

        while (i <= B) {
            multiplicationAB += A;
            i = i + 1;
        }
        System.out.println("\'Умножение A на B\' дало бы следующий результат: " + multiplicationAB);
    }
}
