package ro.fasttrackit.curs12.restaurant;

import java.util.*;

public class RestaurantService {
    private final List<Restaurant> restaurants = new ArrayList<>();

    public RestaurantService(Collection<Restaurant> restaurants) {
        if (restaurants != null) {
            this.restaurants.addAll(restaurants);
        }
    }

    public List<Restaurant> getRestaurantsInCity(String city) {
        List<Restaurant> result = new ArrayList<>();
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getCity()
                    .equalsIgnoreCase(city)) {
                result.add(restaurant);
            }
        }
        return result;
    }

    public List<Restaurant> getRestaurants(RestaurantType type) {
        List<Restaurant> result = new ArrayList<>();
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getType() == type) {
                result.add(restaurant);
            }
        }
        return result;
    }

    public Map<String, String> mapRestaurantToCity() {
        Map<String, String> result = new HashMap<>();
        for (Restaurant restaurant : restaurants) {
            result.put(restaurant.getName(), restaurant.getCity());
        }
        return result;
    }

    public Map<String, RestaurantType> mapRestaurantToType() {
        Map<String, RestaurantType> result = new HashMap<>();
        for (Restaurant restaurant : restaurants) {
            result.put(restaurant.getName(), restaurant.getType());
        }
        return result;
    }

    public Map<Integer, List<String>> mapRatingToRestaurantName() {
        Map<Integer, List<String>> result = new HashMap<>();
        for (Restaurant restaurant : restaurants) {
            List<String> grouppedRestaurants = result.get(restaurant.getRating());
            if (grouppedRestaurants == null) {
                grouppedRestaurants = new ArrayList<>();
                result.put(restaurant.getRating(), grouppedRestaurants);
            }
            grouppedRestaurants.add(restaurant.getName());
        }
        return result;
    }

    public Map<String, List<Restaurant>> mapCityToRestaurant() {
        Map<String, List<Restaurant>> result = new HashMap<>();
        for (Restaurant restaurant : restaurants) {
            List<Restaurant> grouppedRestaurants = result.get(restaurant.getCity());
            if (grouppedRestaurants == null) {
                grouppedRestaurants = new ArrayList<>();
                result.put(restaurant.getCity(), grouppedRestaurants);
            }
            grouppedRestaurants.add(restaurant);
        }
        return result;
    }
}
