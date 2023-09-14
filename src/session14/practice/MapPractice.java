package session14.practice;

import com.sun.source.tree.BreakTree;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        Map<String, Integer> myMap = initalizeMap();
        int receivedValue = receiveValue(myMap, "one");
        System.out.println(myMap.get("one"));

        updateMap(myMap, "three", 10);
        System.out.println(receiveValue(myMap, "three"));

        removeEntry(myMap, "three");
    }

    private static Map<String, Integer> initalizeMap() {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("one", 1);
        myMap.put("two", 2);
        myMap.put("three", 3);

        return myMap;
    }

    private static int receiveValue(Map<String, Integer> map, String key) {
        return map.get(key);
    }

    private static void updateMap(Map<String, Integer> map, String key, int value) {
        map.put(key, value);
    }

    private static void removeEntry(Map<String, Integer> map, String key){
        map.remove(key);
    }


}
