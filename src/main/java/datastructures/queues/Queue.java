package datastructures.queues;

import datastructures.linkedlists.singlylinkedlist.NodeLinkedList;

public class Queue {
    private NodeLinkedList first;
    private NodeLinkedList last;
    private int length;

    public Queue(){
        first = null;
        last = null;
        length = 0;
    }

    public NodeLinkedList peek(){
        return first;
    }

    public void push(NodeLinkedList element){
        if(length == 0){
            first = element;
            last = first;
        }else{
            last.setNext(element);
            last = element;
        }
        length++;
    }

    public void pop(){
        if(first.equals(last)){
            last = null;
        }
        if(length > 0){
           first = first.getNext();
        }
        length--;
    }

    public void print(){
        NodeLinkedList current = first;

        while(current!=null){
            System.out.println(current.getData());
            current = current.getNext();
        }

    }

}
