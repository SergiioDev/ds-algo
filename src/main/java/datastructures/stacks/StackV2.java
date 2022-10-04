package datastructures.stacks;


import datastructures.linkedlists.singlylinkedlist.NodeLinkedList;

import java.util.ArrayList;

// Implementation of a Stack using an array
public class StackV2 {
    private ArrayList<NodeLinkedList> stack;

    public StackV2() {
        stack = new ArrayList<>();
    }

    public NodeLinkedList peek(){
        if(!stack.isEmpty()){
            return stack.get(stack.size() - 1);
        }
        return null;
    }

    public void push(int value){
        stack.add(new NodeLinkedList(value));
    }


    public void pop(){
        if(!stack.isEmpty()){
            stack.remove(stack.size() -1);
        }
    }

    public void print(){
        stack.forEach(node -> System.out.println(node.getData()));
    }

}

