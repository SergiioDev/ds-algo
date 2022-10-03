package datastructures.stacks;

import datastructures.linkedlists.singlylinkedlist.NodeLinkedList;

// Implementation of a Stack using linked list
public class Stack {
    NodeLinkedList top;
    NodeLinkedList bottom;
    int length;

    public Stack() {
        this.top = null;
        this.bottom = null;
        this.length = 0;
    }

    public NodeLinkedList peek(){
        return top;
    }

    public void push(int value){
        NodeLinkedList element = new NodeLinkedList(value);

        if (top == null) {
            top = element;
            bottom = top;

        }else{
            element.setNext(top);
            top = element;
        }
        length++;
    }


    public void pop(){
        if(length == 1){
            bottom = null;
        }
        if(top != null){
            top = top.getNext();
            length--;
        }

    }

    public void print(){
        NodeLinkedList currentNode = top;

        while(currentNode != null){
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();
        }

    }

}
