package implementation;

public class Node {
    // store elements of sequence
    private int data;
    //refer to next node of sequence
    private Node next;
    //constructor,create a node with given date
    public Node(int data){
        this.data = data;
        next = null;

    }
//  getter and setter
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
