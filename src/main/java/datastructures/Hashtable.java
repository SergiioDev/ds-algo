package datastructures;

import java.util.ArrayList;

public class Hashtable {

    // class that will work as a bucket to store the nodes
    private static class Bucket extends ArrayList<HashTableNode> {
    }

    private final Bucket[] buckets;

    private final int size;

    public Hashtable(int size) {
        this.size = size;
        buckets = new Bucket[size];
    }

    private int hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.charAt(i) * i) % size;
        }
        return hash;
    }

    public void put(String key, int value) {
        int memoryAddress = hash(key);

        if (buckets[memoryAddress] == null) {
            buckets[memoryAddress] = new Bucket();
        }

        buckets[memoryAddress].add(new HashTableNode(key, value));

    }

    public Object get(String key) {
        int memoryAddress = hash(key);
        if (buckets[memoryAddress] != null) {
            for (HashTableNode n : buckets[memoryAddress]) {
                if (n.getKey().equals(key)) {
                    return n.getValue();
                }
            }
        }
        return 0;
    }

    public ArrayList<String> getKeys() {
        ArrayList<String> keys = new ArrayList<>();

        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i] != null) {
                if (buckets[i].size() > 1) {
                    for (int j = 0; j < buckets[i].size(); j++) {
                        keys.add((String) buckets[i].get(j).getKey());
                    }
                } else {
                    keys.add((String) buckets[i].get(0).getKey());
                }

            }

        }
        return keys;

    }

}

class HashTableNode<T, U> {
    private final T key;

    private U value;

    public HashTableNode(T key, U value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public U getValue() {
        return value;
    }

}