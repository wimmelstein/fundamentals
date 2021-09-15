package nl.inholland.fundamentals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        List<String> words = List.of("wing", "inconclusive", "drain", "uninterested", "arrive", "bulb", "friction", "deliver", "temper", "wiggly", "tested", "plug");
        Map<Integer, List<String>> map = new HashMap<>();

        for (String word : words) {
            List<String> list = map.getOrDefault(word.length(), new ArrayList<>());
            list.add(word);
            map.put(word.length(), list);
        }

        for (int i : map.keySet()) {
            System.out.println(i + ": "  + map.get(i));
        }
    }
}
