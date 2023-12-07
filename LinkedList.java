package Day14;

public class LinkedList {
    Node head;
    Node tail;
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
        }
        else{
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void display(){
        Node newNode = head ;
        while (newNode != null){
            System.out.println(newNode.data);
            newNode =newNode.next;
        }
    }

}
