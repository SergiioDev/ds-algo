package datastructures.binarytrees;

public class BinaryTree {
    private BinaryTreeNode root;

    public BinaryTree() {
        root = null;
    }

    public void insert(int value){
        BinaryTreeNode created = new BinaryTreeNode(value);
        if (root == null){
            root = created;
            return;
        }

        BinaryTreeNode current = root;

        while(true){
            if (value >= current.getData()){
                if (current.getRight() == null){
                    current.setRight(created);
                    return;
                }
                current = current.getRight();

            }else {
                if(current.getLeft() == null){
                    current.setLeft(created);
                    return;
                }
                current = current.getLeft();

            }

        }
    }

    public int lookup(int value){
        BinaryTreeNode current = root;
        while(true){
            if (value > current.getData()){
                current = current.getRight();
            }else if (value < current.getData()){
                current = current.getLeft();
            }else if (value == current.getData()){
                return value;
            }
        }
    }


}
