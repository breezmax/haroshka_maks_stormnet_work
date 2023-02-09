public class HW3_Task6 {
    public static void main(String[] args) {
        /*
        Author: Maksim Goroshko

        6) Напишите программу вывода всех четных чисел от 2 до 100 включительно
        */

        int chtn = 2;

        while (chtn <= 100){
            if (chtn % 2 == 0){
                System.out.println(chtn);
            }
            chtn++;
        }
    }
}
