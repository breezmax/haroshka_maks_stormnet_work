import java.util.Arrays;
import java.util.Random;

public class HW3_Task9 {
    public static void main(String[] args) {
        /*
        Author: Maksim Goroshko

        9) Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите массив на экран в строку.
        Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
        */

        int arr[] = new int[20];

        System.out.println("Массив имеет следующие элементы:");
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = rnd.nextInt(20);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println();

        System.out.println("Все нечетные числа заменены на \'0\'. Массив имеет следующий вид:");
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 1){
                arr[i] = 0;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
