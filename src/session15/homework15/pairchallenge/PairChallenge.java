package session15.homework15;

public class PairChallenge<K, V> {

    private K key;
    private V value;

    public PairChallenge(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
