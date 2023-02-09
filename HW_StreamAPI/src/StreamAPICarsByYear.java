import java.util.stream.Stream;

public class StreamAPICarsByYear {
    public static void main(String[] args) {
        Stream<Car> carStream = Stream.of(new Car("Audi", 2001, 6500, "Red"),
                new Car("BMW", 2015, 13500, "Black"),
                new Car("Honda", 2020, 18200, "Grey"),
                new Car("Lada", 1991, 2000, "Black"),
                new Car("Toyota", 2012, 9000, "White"));

        // 4. Выводим автомобили c 2000 до 2020
        System.out.println("Выводим автомобили с 2000 до 2020:");
        carStream.filter(c -> c.getYear() >= 2000 && c.getYear() < 2020).forEach(c -> System.out.println(c.getName() + " " + c.getYear()));
    }
}
