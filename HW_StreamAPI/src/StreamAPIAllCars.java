import java.util.stream.Stream;

public class StreamAPIAllCars {
    public static void main(String[] args) {
        Stream<Car> carStream = Stream.of(new Car("Audi", 2001, 6500, "Red"),
                new Car("BMW", 2015, 13500, "Black"),
                new Car("Honda", 2020, 18200, "Grey"),
                new Car("Lada", 1991, 2000, "Black"),
                new Car("Toyota", 2012, 9000, "White"));

        // 1. Выводим все автомобили
        System.out.println("У нас есть следующие автомобили:");
        carStream.forEach(c -> System.out.println(c.getName() + " " + c.getYear() + " " + c.getColor()
                + " " + c.getPrice()));

    }
}
