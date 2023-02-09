public class HW3_Task7 {
    public static void main(String[] args) {
        /*
        Author: Maksim Goroshko

        7) Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
        */

        int nonchtn = 1;
        int sumNonChtn = 0;

        while (nonchtn <= 100){
            if (nonchtn % 2 == 1){
                System.out.print(nonchtn + " ");
                sumNonChtn += nonchtn;

            }
            nonchtn++;

        }

        System.out.println();
        System.out.println("Сумма нечетных чисел от 1 до 100 равна " + sumNonChtn);
    }
}
