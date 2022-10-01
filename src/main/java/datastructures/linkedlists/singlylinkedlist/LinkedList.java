package datastructures.linkedlists.singlylinkedlist;

public class LinkedList {
    private NodeLinkedList head;
    private NodeLinkedList tail;
    private int length;

    public LinkedList(int data) {
        this.head = new NodeLinkedList(data);
        this.tail = head;
        length++;
    }

    public void prepend(int data) {
        NodeLinkedList node = new NodeLinkedList(data);
        node.setNext(head);
        this.head = node;
        length++;
    }

    public void append(int data) {
        NodeLinkedList node = new NodeLinkedList(data);
        tail.setNext(node);
        tail = node;
        length++;
    }


    public NodeLinkedList insert(int index, int value) {
        NodeLinkedList created = new NodeLinkedList(value);

        if (index <=0){
            created.setNext(head);
            head = created;
            return created;
        }

        if (index >= length) {
            tail.setNext(created);
            tail = created;
            return created;
        }

        NodeLinkedList currentNode = head;
        for (int i = 0; i < index - 1; i++) {
            currentNode = head.getNext();
        }

        created.setNext(currentNode.getNext());
        currentNode.setNext(created);
        return created;
    }

    public void remove(int index) {
        NodeLinkedList currentNode = head;
        for (int i = 0; i < index - 1; i++) {
            currentNode = head.getNext();
        }
        NodeLinkedList deletedNode = currentNode.getNext();
        currentNode.setNext(deletedNode.getNext());
        length--;
    }


    public void reverse(){
        if(!head.equals(tail)){
            NodeLinkedList first = head;
            NodeLinkedList currentNode = head.getNext();

            tail = head;

            while (currentNode !=null){
                NodeLinkedList nextNode = currentNode.getNext();
                currentNode.setNext(first);
                first = currentNode;
                currentNode = nextNode;
            }
            head.setNext(null);
            head = first;
        }
    }

    public void print() {
        NodeLinkedList currentNode = head;
        while (currentNode != null) {
            System.out.printf(currentNode.getData() + "--->");
            currentNode = currentNode.getNext();

        }
        System.out.println();
    }

}
