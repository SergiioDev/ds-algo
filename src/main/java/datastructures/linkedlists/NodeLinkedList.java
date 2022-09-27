package datastructures.linkedlists;

public class NodeLinkedList {
    private int data;
    private NodeLinkedList next;

    public NodeLinkedList(int data){
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public NodeLinkedList getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(NodeLinkedList next) {
        this.next = next;
    }
}
