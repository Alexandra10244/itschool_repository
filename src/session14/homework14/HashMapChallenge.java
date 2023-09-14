package session14.homework14;


import java.util.HashMap;

public class HashMapChallenge {

    public static void main(String[] args) {

        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Ana", 18);
        map1.put("Alin", 38);
        map1.put("Maria", 28);
        System.out.println("Map:" + map1);

        int size = map1.size();
        System.out.println("First map size: " + size);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.putAll(map1);
        System.out.println(map2);

        System.out.println("Second map contains 'Maria': " + searchKey(map2, "Maria"));

    }

    public static boolean searchKey(HashMap<String, Integer> map, String key) {

        if (map.containsKey(key)) {
            return true;
        }
        return false;
    }
}
