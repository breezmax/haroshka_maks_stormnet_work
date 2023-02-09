import java.util.Arrays;
import java.util.Random;

public class HW3_Task12 {
    public static void main(String[] args) {
        /*
        Author: Maksim Goroshko

        12) Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите какой элемент является в этом
            массиве максимальным и сообщите индекс его последнего вхождения в массив.
        */

        int value = 0;
        int arrIndex = 0;

        int arr[] = new int[12];

        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = rnd.nextInt(15);
            if (arr[i] >= value){
                value = arr[i];
                arrIndex = i;
            }
        }
        System.out.println("Массив имеет следующие значения:");
        System.out.println(Arrays.toString(arr));

        System.out.println();
        System.out.printf("Максимальное значение елемента в массиве %d, индекс последнего вхождения %d", value, arrIndex);
    }
}
