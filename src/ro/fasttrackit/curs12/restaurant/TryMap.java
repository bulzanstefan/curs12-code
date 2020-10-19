package ro.fasttrackit.curs12.restaurant;

import java.util.HashMap;
import java.util.Map;

public class TryMap {
    public static void main(String[] args) {
        Map<String, Integer> nameToAge = new HashMap<>();

        nameToAge.put("Ana", 30);
        nameToAge.put("Ioan", 33);
        nameToAge.put("Dan", 13);
        nameToAge.put("Mircea", 23);
        nameToAge.put("Adina", 27);
        nameToAge.put("Romeo", 27);

        System.out.println(nameToAge);

        nameToAge.remove("Ana");
        System.out.println(nameToAge);

        for (String name : nameToAge.keySet()) {
            System.out.println(name + " - " + nameToAge.get(name));
        }

        for (Integer age : nameToAge.values()) {
            System.out.println(age);
        }

        for (Map.Entry<String, Integer> entry : nameToAge.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
