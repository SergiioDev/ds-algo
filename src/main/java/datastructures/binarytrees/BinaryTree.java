package datastructures.binarytrees;

public class BinaryTree {
    private BinaryTreeNode root;

    public BinaryTree() {
        root = null;
    }

    public void insert(BinaryTreeNode node){
        if (root == null){
            root = node;
        }

        BinaryTreeNode current = root;

        while(current != null){
            if (node.getData() > current.getData()){
                if (current.getRight() == null){
                    current.setRight(node);
                    return;
                }
                current = current.getRight();

            }else {
                if(current.getLeft() == null){
                    current.setLeft(node);
                    return;
                }
                current = current.getLeft();

            }

        }
    }

}
