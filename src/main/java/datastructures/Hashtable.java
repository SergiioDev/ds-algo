package datastructures;

import java.util.ArrayList;

public class Hashtable {

    // class that will work as a bucket to store the nodes
    private static class Bucket extends ArrayList<Node> {
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

        buckets[memoryAddress].add(new Node(key, value));

    }

    public Object get(String key) {
        int memoryAddress = hash(key);
        if (buckets[memoryAddress] != null) {
            for (Node n : buckets[memoryAddress]) {
                if (n.getKey().equals(key)) {
                    return n.getValue();
                }
            }
        }
        return 0;
    }

}

class Node<T, U> {
    private final T key;

    private U value;

    public Node(T key, U value) {
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