package trees;

public class Tree {

    private int value;
    private Tree leftNode;
    private Tree rightNode;

    public Tree(int value) {

        this.value = value;
    }

    public Tree(int value, Tree leftNode, Tree rightNode) {

        this.value = value;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }
}
