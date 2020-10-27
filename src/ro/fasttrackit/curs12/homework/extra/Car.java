package ro.fasttrackit.curs12.homework.extra;

public class Car {
    private final CarMake name;
    private final int age;
    private final int km;
    private final double price;

    public Car(CarMake name, int age, int km, double price) {
        this.name = name;
        this.age = age;
        this.km = km;
        this.price = price;
    }

    public CarMake getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getKm() {
        return km;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name=" + name +
                ", age=" + age +
                ", km=" + km +
                ", price=" + price +
                '}';
    }
}
