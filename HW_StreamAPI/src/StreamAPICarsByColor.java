import java.util.stream.Stream;

public class StreamAPICarsByColor {
    public static void main(String[] args) {
        Stream<Car> carStream = Stream.of(new Car("Audi", 2001, 6500, "Red"),
                new Car("BMW", 2015, 13500, "Black"),
                new Car("Honda", 2020, 18200, "Grey"),
                new Car("Lada", 1991, 2000, "Black"),
                new Car("Toyota", 2012, 9000, "White"));

        // 2. Выводим автомобили черного цвета:
        System.out.println("Следующие автомобили имеют \'черный\' цвет:");
        carStream.filter(c -> c.getColor() == "Black").forEach(c -> System.out.println(c.getName() + " " + c.getColor()));
    }
}
