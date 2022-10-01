package datastructures.linkedlists.doublylinkedlist;

public class DoublyLinkedListNode {
    private int data;
    private DoublyLinkedListNode previous;
    private DoublyLinkedListNode next;

    public DoublyLinkedListNode(int data){
        this.data = data;
        this.previous = null;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public DoublyLinkedListNode getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(DoublyLinkedListNode next) {
        this.next = next;
    }

    public DoublyLinkedListNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyLinkedListNode previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "DoublyNodeLinkedList{" +
                "data=" + data +
                ", previous=" + previous +
                ", next=" + next +
                '}';
    }
}
