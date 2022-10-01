package datastructures.linkedlists.doublylinkedlist;

public class DoublyLinkedList {
    private DoublyLinkedListNode head;
    private DoublyLinkedListNode tail;
    private int length;

    public DoublyLinkedList(int data) {
        this.head = new DoublyLinkedListNode(data);
        this.tail = head;
        length++;
    }

    public void prepend(int data) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(data);
        head.setPrevious(head);
        node.setNext(head);
        this.head = node;
        length++;
    }

    public void append(int data) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(data);
        node.setPrevious(tail);
        tail.setNext(node);
        tail = node;
        length++;
    }


    public DoublyLinkedListNode insert(int index, int value) {
        DoublyLinkedListNode created = new DoublyLinkedListNode(value);

        if (index <=0) {
            head.setPrevious(created);
            created.setNext(head);
            head = created;
            return created;
        }

        if (index >= length) {
            created.setPrevious(tail);
            tail.setNext(created);
            tail = created;
            return created;
        }

        DoublyLinkedListNode currentNode = head;
        for (int i = 0; i < index - 1; i++) {
            currentNode = head.getNext();
        }

        currentNode.getNext().setPrevious(created);
        created.setPrevious(currentNode);
        created.setNext(currentNode.getNext());
        currentNode.setNext(created);
        return created;
    }

    public void remove(int index) {
        DoublyLinkedListNode currentNode = head;
        for (int i = 0; i < index - 1; i++) {
            currentNode = head.getNext();
        }
        DoublyLinkedListNode deletedNode = currentNode.getNext();
        deletedNode.getNext().setPrevious(currentNode);
        currentNode.setNext(deletedNode.getNext());
        length--;
    }

    public void print() {
        DoublyLinkedListNode currentNode = head;
        while (currentNode != null) {
            System.out.printf(currentNode.getData() + "--->");
            currentNode = currentNode.getNext();

        }
        System.out.println();
    }

}
