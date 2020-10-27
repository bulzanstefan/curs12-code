package ro.fasttrackit.curs12.homework.extra;

import java.util.*;

public class CarShop {
    private final List<Car> cars = new ArrayList<>();

    public CarShop(Collection<Car> cars) {
        if (cars != null) {
            this.cars.addAll(cars);
        }
    }

    public Map<CarMake, Integer> makeToNumber() {
        Map<CarMake, Integer> result = new HashMap<>();

        for (Car car : cars) {
            Integer counter = result.get(car.getName());
            if (counter == null) {
                counter = 0;
            }
            result.put(car.getName(), counter + 1);
        }
        return result;
    }

    public Map<CarMake, Integer> makeToKm() {
        Map<CarMake, Integer> result = new HashMap<>();

        for (Car car : cars) {
            Integer km = result.get(car.getName());
            if (km == null) {
                km = 0;
            }
            result.put(car.getName(), km + car.getKm());
        }
        return result;
    }

    public Map<CarMake, List<Integer>> makeToAge() {
        Map<CarMake, List<Integer>> result = new HashMap<>();

        for (Car car : cars) {
            List<Integer> carAges = result.get(car.getName());
            if (carAges == null) {
                carAges = new ArrayList<>();
                result.put(car.getName(), carAges);
            }
            carAges.add(car.getAge());
        }

        return result;
    }

    public Map<Range, List<Car>> rangeToCars(int rangeSize) {
        Map<Range, List<Car>> result = new HashMap<>();
        for (Car car : cars) {
            Range carRange = getRange(car, rangeSize);
            List<Car> carsInRange = result.get(carRange);
            if (carsInRange == null) {
                carsInRange = new ArrayList<>();
                result.put(carRange, carsInRange);
            }
            carsInRange.add(car);
        }
        return result;
    }

    private Range getRange(Car car, Integer rangeSize) {
        int carKm = car.getKm();
        return new Range(carKm / rangeSize * rangeSize,
                (carKm / rangeSize + 1) * rangeSize);
    }
}
