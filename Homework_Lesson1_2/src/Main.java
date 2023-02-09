import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task3
        int tableService;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Какое количество сервизных чашечек ты поставишь на стол? Кол-во: ");
        tableService = scanner.nextInt();
        System.out.println("Всего на стол тебе нужно поставить " + tableService * 3 + " предмет(ов) из сервиза:");
        System.out.println(tableService + " блюдца(ец), " + tableService + " чашечки(чек), " + tableService + " ложечки(чек)");
    }
}