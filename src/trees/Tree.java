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

    public int getValue() { return this.value; }
    public Tree getLeftNode() { return this.leftNode; }
    public Tree getRightNode() { return this.rightNode; }

    public void setValue(int value) { this.value = value; }
    public void setLeftNode(Tree node) { this.leftNode = node; }
    public void setRightNode(Tree node) { this.rightNode = node; }
}
