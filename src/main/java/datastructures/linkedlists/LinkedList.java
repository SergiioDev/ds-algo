package datastructures.linkedlists;

import org.w3c.dom.Node;

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

    public void insert (int index, int data){
        NodeLinkedList preNode = head;
        NodeLinkedList createdNode = new NodeLinkedList(data);

        for (int i = 0; i < index - 1 ; i++) {
           preNode = preNode.getNext();
        }

        createdNode.setNext(preNode.getNext());
        preNode.setNext(createdNode);

    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(5);
        linkedList.append(16);
        linkedList.append(17);
        linkedList.append(18);
        linkedList.insert(2,10);
        linkedList.print();
    }
    public void print(){
        NodeLinkedList currentNode = head;

        while (currentNode != null){
            System.out.printf(currentNode.getData()+"--->");
            currentNode = currentNode.getNext();
        }
    }

}
