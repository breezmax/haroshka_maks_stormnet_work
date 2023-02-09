import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class HW3_Task8 {
    public static void main(String[] args) {
        /*
        Author: Maksim Goroshko

        8) Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите массив на экран.
        Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
        */
        int countElements = 0;

        int arr [] = new int[15];

        System.out.println("Массив имеет следующие элементы:");
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = rnd.nextInt(99);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println();

        System.out.println("Этом массив имеет следующие четные элементы:");
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                System.out.print(arr[i] + " ");
                countElements++;
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Количество четных элементов в массиве: " + countElements);
    }
}
