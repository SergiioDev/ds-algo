package datastructures.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Graph {
    private int numberOfNodes;
    private HashMap<Integer, List<Integer>> adjacentList;


    public Graph() {
        this.numberOfNodes = 0;
        this.adjacentList = new HashMap<>();
    }

    public void addNode(int node){
        adjacentList.put(node,new ArrayList<>());
        numberOfNodes++;
    }

    public void addEdge(int node1, int node2){
        if (adjacentList.containsKey(node1)){
            adjacentList.get(node1).add(node2);
        }

        if (adjacentList.containsKey(node2)){
            adjacentList.get(node2).add(node1);
        }
    }


    public void showConnections(){
        adjacentList.forEach((key, value) -> System.out.println(key + "-->"+value.toString()));
    }

    public int getSize(){
        return numberOfNodes;
    }

}
