import java.util.Comparator;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamAPICarsSortByPrice {
    public static void main(String[] args) {
        Stream<Car> carStream = Stream.of(new Car("Audi", 2001, 6500, "Red"),
                new Car("BMW", 2015, 13500, "Black"),
                new Car("Honda", 2020, 18200, "Grey"),
                new Car("Lada", 1991, 2000, "Black"),
                new Car("Toyota", 2012, 9000, "White"));

        // 5. Выводим автомобили по убыванию стоимости
        System.out.println("Сортируем автомобили по стоимости (убывание):");
        Comparator<Car> comparator = (a, b) -> {
            return (int) (b.getPrice() - a.getPrice());
        };
        Stream<Car> sortedStream = carStream.sorted(comparator);
        Consumer<Car> info = (c) -> {
            System.out.println(c.getName() + " " + c.getPrice());
        };
        sortedStream.forEach(info);
    }
}
