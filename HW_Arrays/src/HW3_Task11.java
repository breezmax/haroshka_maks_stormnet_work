import java.util.Arrays;
import java.util.Random;

public class HW3_Task11 {
    public static void main(String[] args) {
        /*
        Author: Maksim Goroshko

        11) Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его на экран в строку.
            Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
        */

        boolean flagOrder = true;
        int arr[] = new int[4];

        System.out.println("Массив имеет следующие элементы:");
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = rnd.nextInt(10);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println();

        for (int i = 1; i < arr.length; i++){
            if (arr[i] <= arr[i-1]){
                flagOrder = false;
                break;
            }
        }

        if (flagOrder){
            System.out.println("Последовательность в массиве возрастающая!");
        } else {
            System.out.println("Последовательность в массиве убывающая или рандомная!");
        }
    }
}
