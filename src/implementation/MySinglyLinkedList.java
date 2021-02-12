package implementation;

import myinterface.implementation.LIst;

public class MySinglyLinkedList implements LIst {
    //head reference
    private Node head;
    private Node tail;
    private int size;

    //constructor
    public MySinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addLast(int element) {
        Node node = new Node(element);
        if (isEmpty()){
            head = node;
            tail =node;

        }
        else{
            tail.setNext(node);
            tail = node;
        }
        size++;

    }

    @Override
    public void addLastWithoutTail(int element) {
        Node node = new Node(element);
        if (isEmpty()){
            head = node;
            tail = node;
        }
        else{
            Node temp = head;
            while(temp.getNext()!= null){
                temp = temp.getNext();
            }
            temp.setNext(node);//temp is last node
            tail = node;
        }
        size++;

    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void addfirst(int element) {
        Node node = new Node(element);
        if (isEmpty()) {
            head = node;
            tail = node;
            size++;
        } else {
            node.setNext(head);
            head = node;
            size++;
        }
    }

    //traverse
    public void traverse() {
        if (!isEmpty()) {

            Node temp = head;
            System.out.print("head-->");
            while (temp != null) {
                System.out.print(temp.getData() + "-->");
                //upgrade temp value to refer next node of the sequence
                temp = temp.getNext();
            }
            System.out.print("null");
        } else {
            System.out.println("LinkedList is empty");
        }
    }

    @Override
    public void addAfterGivenNode(int givenElement, int element) {
        Node node = new Node(element);
        if (!isEmpty()) {
            if (head == tail) {
                if (head.getData() == givenElement) {
                    head.setNext(node);
                    tail = node;
                    size++;


                } else {
                    System.out.println("givenElement not found in list");
                }
            } else {
                Node temp = head;
                while (temp != null && temp.getData() != givenElement) {
                    temp = temp.getNext();
                }
                // when temp = null means elemnt not found
                if (temp != null) {
                    //case 2
                    node.setNext(temp.getNext());
                    temp.setNext(node);
                    size++;
                    if (temp == tail) {
                        tail = node;

                    }
                } else {
                    System.out.println("givenElement not found in the list:");

                }
            }

        } else {
            System.out.println("Empty list");
        }


    }

    @Override
    public int removeFirst() {
        int response = 0; //considering 0 as invalid data
        if (!isEmpty()){
            response = head.getData();
            head = head.getNext();
            if (head == null){
                tail = null;
            }
            size--;
        }
        return response;
    }

    @Override
    public int removeLast() {
        int response = 0;

        if (!isEmpty()){
            response = tail.getData();
            Node temp = head;
            Node previous = null;
            while (temp.getNext()!= null){
                previous = temp;
                temp = temp.getNext();
            }
            // for multiple nodes in a linkedlist
            if(previous != null){
                previous.setNext(null);
                tail = previous;


            }
            //single node{
            else{
                head = null;
                tail = null;

            }
            size--;
        }
        return response;
    }

    @Override
    public int removeGivenNode(int givenElement) {

        return 0;
    }

    @Override
    public boolean search(int element) {
        return false;
    }

}
