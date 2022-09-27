package datastructures.hashtable;

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
