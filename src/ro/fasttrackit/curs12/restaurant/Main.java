package ro.fasttrackit.curs12.restaurant;

import java.util.List;

import static ro.fasttrackit.curs12.restaurant.RestaurantType.FUSION;
import static ro.fasttrackit.curs12.restaurant.RestaurantType.ROMANIAN;

public class Main {
    public static void main(String[] args) {
        RestaurantService service = new RestaurantService(List.of(
                new Restaurant("Dock", "Oradea", RestaurantType.FUSION, 4),
                new Restaurant("Rivo", "Oradea", RestaurantType.MEDITERANEEAN, 3),
                new Restaurant("Pizza Hut", "Bucuresti", RestaurantType.GREEK, 2),
                new Restaurant("Indigo", "Cluj", RestaurantType.FUSION, 3),
                new Restaurant("Bricks", "Cluj", ROMANIAN, 4),
                new Restaurant("Flavours", "Oradea", ROMANIAN, 5),
                new Restaurant("Spoon", "Oradea", ROMANIAN, 4),
                new Restaurant("Traditional", "Bucuresti", ROMANIAN, 3)
        ));

        printRestaurants("restaurants in Oradea", service.getRestaurantsInCity("Oradea"));
        printRestaurants("Fusion Restaurants", service.getRestaurants(FUSION));

    }

    private static void printRestaurants(String description, List<Restaurant> restaurants) {
        System.out.println(description + " :");

        for (Restaurant restaurant : restaurants) {
            System.out.println(restaurant.getName() + " - " + restaurant.getCity() + " - " + restaurant.getType() + " - " + restaurant.getRating());
        }
    }
}
