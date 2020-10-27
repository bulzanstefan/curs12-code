package ro.fasttrackit.curs12.homework.extra;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarShop carShop = new CarShop(List.of(
                new Car(CarMake.BMW, 12, 300000, 4000),
                new Car(CarMake.HYUNDAI, 2, 30000, 11000),
                new Car(CarMake.DACIA, 1, 300001, 40000),
                new Car(CarMake.TOYOTA, 3, 20000, 3000),
                new Car(CarMake.BMW, 10, 200000, 4200),
                new Car(CarMake.BMW, 3, 20000, 24200),
                new Car(CarMake.TOYOTA, 7, 20000, 14200)
        ));
        System.out.println(carShop.makeToAge());
        System.out.println(carShop.makeToNumber());
        System.out.println(carShop.makeToKm());
        System.out.println(carShop.rangeToCars(10000));
        System.out.println(carShop.rangeToCars(1));
    }
}
