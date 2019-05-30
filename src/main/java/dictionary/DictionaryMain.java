package dictionary;

import java.util.HashMap;
import java.util.Map;

public class DictionaryMain {
    public static void main(String[] args) {
        final Map<Integer, String> myDictionary = new HashMap<>();
        myDictionary.put(10260, "Creator Expert - Diner");
        myDictionary.put(10769, "Extreme Adventure Truck");
        myDictionary.put(31313, "Mindstorms Home Kit");

        System.out.println("Printing a Specific Value: " + myDictionary.get(10260));

        myDictionary.forEach((key, value) ->
                System.out.println(String.format("%s: %s", key, value)));
    }
}
