package myinterface.implementation;

public interface LIst {
    /*insertAtBeginning
    insertAtHead*/
     void addfirst(int element);
     /*insertAtEnd
     insertAtTail
     void addLast(int element)  */
    boolean isEmpty();//will give true if linkedlist is empty
    int size();// will return total number of elements of linkedlist
    void addLast(int element);
    void addLastWithoutTail(int element);
    void traverse();
    void addAfterGivenNode(int givenElement, int element );
/*
    void addBeforeGivenNode(int givenElement,int element);
*/
    int removeFirst();
    int removeLast();
    int removeGivenNode(int givenElement);
    boolean search(int element);





}
