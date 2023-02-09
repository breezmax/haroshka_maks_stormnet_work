public class Car {
    private String name;
    private int year;
    private double price;
    private String color;

    public Car(String name, int year, double price, String color) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
}
