import java.util.Scanner;

public class HW_Lesson2_TaskFour {
    public static void main(String args[]){
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи целое положительное/отрицательное и ты будешь удивлен.");
        System.out.println("P.S. Только не ломай мою систему, она пока работает в демо режиме");
        System.out.print("Итааак, твое число: ");
        number = scanner.nextInt();

        if (number > 0){
            System.out.print("Число '" + number + "' положительное");
            if (number <= 9 ){
                System.out.print(" и однозначное");
            } else{
                if (number <= 99){
                    System.out.print(" и двузначное");
                }else{
                    if (number > 99){
                        System.out.print(" и трехзначное (или более)");
                    } else {
                        System.out.print("Что-то пошло не так! Не понимаю сколько цифр... Посчитай цифры сам!");
                    }
                }
            }
        } else{
            System.out.print("Число '" + number + "' отрицательное");
            if (number >= -9){
                System.out.print(" и однозначное");
            } else {
                if (number >= -99){
                    System.out.print(" и двузначное");
                } else {
                    if (number < -99){
                        System.out.print(" и трехзначное (или более)");
                    } else {
                        System.out.print("Что-то пошло не так! Не понимаю сколько цифр... Посчитай цифры сам!");
                    }
                }
            }
        }
    }
}
