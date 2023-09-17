package session15.homework15;

import java.util.HashMap;

//Simulate a cache where objects are stored. Objects with the same hashcode should overwrite existing objects in the cache.
// Consider how would you design the hashcode method to facilitate this.

public class CachObject<K, V> {

    HashMap<K, V> map = new HashMap<>();

    public void put(K key, V value) {
        map.put(key, value);
    }

    public V get(K key) {
        return map.get(key);
    }

    public static void main(String[] args) {

        CachObject<Integer, String> cachObject = new CachObject();
        cachObject.put(1, "object1");
        cachObject.put(2, "object2");

        String object1 = cachObject.get(1);
        String object2 = cachObject.get(2);

        System.out.println("Object 1: " + object1);
        System.out.println("Object 2: " + object2);

        cachObject.put(1, "Object 1 overwritten");
        object1 = cachObject.get(1);
        System.out.println("Object 1: " + object1);

    }
}
