package datastructures.linkedlists;

public class LinkedList {
    private NodeLinkedList head;
    private NodeLinkedList tail;
    private int length;

    public LinkedList (int data){
        this.head = new NodeLinkedList(data);
        this.tail = head;
        length++;
    }

    public void prepend (int data){
        NodeLinkedList node = new NodeLinkedList(data);
        node.setNext(head);
        this.head = node;
        length++;
    }

    public void append (int data){
        NodeLinkedList node = new NodeLinkedList(data);
        tail.setNext(node);
        tail = node;
        length++;
    }

    public void print(){
        NodeLinkedList currentNode = head;

        while (currentNode != null){
            System.out.printf(currentNode.getData()+"--->");
            currentNode = currentNode.getNext();
        }
    }

}
