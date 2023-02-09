import java.util.Scanner;

public class HM3_Task3 {
    public static void main(String[] args) {
        /*
        Author: Maksim Goroshko

        3) Вычислить: 1+2+4+8+…+256
        */

        int sumNumbers = 0;

        for (int i = 1; i <= 256; i = i*2) {
            sumNumbers += i;
        }
        System.out.println("Сумма чисел равна: " + sumNumbers);
    }
}
