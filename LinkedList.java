package Day14;

public class LinkedList {
    Node head;
    Node tail;
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail=newNode;
        }
        else {
            tail.next=newNode;
            tail=newNode;
        }
    }

    void display(){
        Node newNode = head ;
        while (newNode!=null){
            System.out.println(newNode.data);
            newNode =newNode.next;
        }
    }
}
