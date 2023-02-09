import java.util.Scanner;

public class HW_Lesson2_TaskFive {
    public static void main(String args[]){

        double A;
        double B;
        double C;

        Scanner sideA = new Scanner(System.in);
        System.out.print("Какая длинна у \"сторона A\" в нашем треугольнике?: ");
        A = sideA.nextDouble();

        Scanner sideB = new Scanner(System.in);
        System.out.print("Какая длинна у \"сторона B\" в нашем треугольнике?: ");
        B = sideB.nextDouble();

        Scanner sideC = new Scanner(System.in);
        System.out.print("Какая длинна у \"сторона C\" в нашем треугольнике?: ");
        C = sideC.nextDouble();

        if ((A + B) > C){
            if ((B + C) > A){
                if ((A + C) > B){
                    System.out.println("Урааа! Такой треугольник существует!");
                } else {
                    System.out.println("Ууух!, такого треугольника не существует!");
                }
            } else {
                System.out.println("Ууух!, такого треугольника не существует!");
            }
        } else {
            System.out.println("Ууух!, такого треугольника не существует!");
        }
    }
}
