package ex3student;

import java.util.*;

/**
 * MapHashMap implements the MapI interface.
 * Note: null is not a valid key or a valid value.
 * Note: Keys must obey the contract for hashCode(), that is,
 *       if k1.equals(k2) is true, then k1.hashCode() == k2.hashCode().
 * Note: Keys used in a HashMap must be immutable
 *       (more precisely: a change in a key must not change the hashCode()).
 */
public class MapHashMap<K, V> implements MapI<K, V> {
    // capacity is the size of the hash table
    private final int capacity;
    // table is the hash table
    private final HashMap<K, V>[] table;

    public MapHashMap() {
        capacity = 11;
        @SuppressWarnings("unchecked")
        HashMap<K, V>[] emptyTable = new HashMap[capacity];
        table = emptyTable;

        // fill the table with empty HashMaps
        for (int i = 0; i < table.length; i++) {
            table[i] = new HashMap<>();
        }
    }

    int size = 0;

    // hash function
    private int hash(K key) {
        return key.hashCode() % capacity;
    }

    //-------------------------------------------------------------------------
    // Map<K,V> methods

    /**
     * Return the value corresponding to the key.
     * Return null, if the key is not in the map.
     */
    @Override
    public V get(K key) {
        int h = hash(key);
        return table[h].get(key);
    }

    /**
     * Insert a (key, value)-pair in the map.
     * Return the old value, if the key was in the map before this insertion.
     * If not, return null.
     */
    @Override
    public V put(K key, V value) {
        int h = hash(key);
        V v = table[h].get(key);
        table[h].put(key,value);
        size++;
        return v;
    }

    /**
     * Remove the (key, value)-pair with the key as key from the map.
     * Return the value, if the key was in the map before this removal.
     * If not, return null.
     */
    @Override
    public V remove(K key) {
        int h = hash(key);
        V v = table[h].get(key);
        table[h].remove(key,get(key));
        size--;
        return v;
    }

    /**
     * Return a set with all the keys in the map.
     */
    @Override
    public Set<K> keys() {
        Set<K> keys = new LinkedHashSet<>();
        for (int i = 0; i < table.length; i++) {
            keys.addAll(table[i].keySet());
        }
        return keys;
    }

    /**
     * Returns a list with all the values in the map.
     */
    @Override
    public List<V> values() {
        List<V> values = new ArrayList<>();
        for (int i = 0; i < table.length; i++) {
            values.addAll(table[i].values());
        }
        return values;
    }

    /**
     * Return the number of (key,value)-pairs in the map.
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Return true on an empty map, false on a non-empty map.
     */
    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

}
