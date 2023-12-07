package Day14;

public class LinkedList {
    static Node head;
    Node tail;
    int size;

    public LinkedList() {
        this.head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }
        else{
            Node temp=head;
            while (temp.next != null && temp.next.data < data){

                temp = temp.next;
            }
            newNode.next = temp.next;
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

    public void search() {
        if (head == null) {
            return;
        } else {
            Node newNode = head;
            while(newNode!=null){
                if(newNode.data==30){
                    System.out.println("30 is present in " +size+ " Node");
                }
                newNode = newNode.next;
                size++;
            }

        }

    }
}
