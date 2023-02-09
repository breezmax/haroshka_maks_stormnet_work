public class HM3_Task5 {
    public static void main(String[] args) {
        /*
        Author: Maksim Goroshko

        5) Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
        */

        int d = 1;
        double cm = 2.54;

        System.out.println("| Дюймы | Сантиметры |");
        System.out.println("----------------------");
        while (d < 21){
            System.out.print("|   " + d);
            System.out.print( "   |    " + (cm * d));
            System.out.print("    |");
            System.out.println();
            d++;
        }
    }
}
