package Day14;

public class Main {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(56);
        l.add(70);

        Node temp = LinkedList.head;
        while (temp.data != 56) {
            temp = temp.next;
        }
        Node newNode = new Node(30);
        newNode.next = temp.next;
        temp.next = newNode;
        l.display();
    }
}
