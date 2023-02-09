import java.util.Scanner;

public class HW_Lesson2_TaskSix {
    public static void main(String args[]){
        double number;

         Scanner scanner = new Scanner(System.in);
         System.out.print("Введи какое-нить число: ");
         number = scanner.nextDouble();

         if (number > 0){
              System.out.println("Число положительное (условие: +1), результат: " + (number + 1));
         } else {
            if (number < 0){
                System.out.println("Число отрицательное (условие: -2), результат: " + (number - 2));
            } else {
                if (number == 0){
                    number = 10;
                    System.out.println("Ооо-па-чаа! \"0\" пришел (условие: =10), результат: " + number);
                }
            }
         }
    }
}