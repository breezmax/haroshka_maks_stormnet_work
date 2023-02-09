import java.util.Arrays;
import java.util.Random;

public class HW3_Task10 {
    public static void main(String[] args) {
        /*
        Author: Maksim Goroshko

        10) Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый, выведите массивы на экран
            в двух отдельных строках. Посчитайте среднее арифметическое элементов каждого массива и сообщите,
            для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
        */

        double msum1 = 0;
        double msum2 = 0;

        int arr1[] = new int[5];
        int arr2[] = new int[5];

        System.out.println("Первый массив имеет следующие элементы:");
        Random rnd = new Random();
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = rnd.nextInt(15);
            msum1 += arr1[i];
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println();

        System.out.println("Второй массив имеет следующие элементы:");
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = rnd.nextInt(15);
            msum2 += arr2[i];
        }

        System.out.println(Arrays.toString(arr2));
        System.out.println();

        if(msum1/arr1.length > msum2/arr2.length){
            System.out.println("Среднее арифметическое значение первого массива больше второго!");
        } else if(msum1/arr1.length < msum2/arr2.length){
            System.out.println("Среднее арифметическое значение второго массива больше первого!");
        } else if(msum1/arr1.length == msum2/arr2.length){
            System.out.println("Карамба!!! Средние значения массивов равны!");
        }
    }
}
