package linked_list;

public class Node {

    private int value;
    private Node next;

    public Node(int value) {

        this.value = value;
        this.next = null;
    }

    public Node(int value, Node next) {

        this.value = value;
        this.next = next;
    }

    public void PrintNode() {

        System.out.print(this.value + " ");

        if (this.next != null) { this.next.PrintNode(); }
    }

    public int getValue() { return this.value; }
    public Node getNext() { return this.next; }

    public void setValue(int value) { this.value = value; }
    public void setNext(Node next) { this.next = next; }
}
