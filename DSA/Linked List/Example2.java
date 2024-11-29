//DoublyLinkedList -> collection of nodes

class Node{
    public int data;
    public Node next;
    public Node prev;
    Node(int data){
        this.data = data;
        this.next = null;    }
}


class DoublyLinkedList{
    public Node head;
    public Node tail;


    DoublyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    void add(int value){
        Node newNode = new Node(value);
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
        }
        else{
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
        }
    }

    void print(){
        Node ptr = this.head;
        while(ptr != null){
            System.out.print(ptr.data + "->");
            ptr = ptr.next;
        }
        System.out.println();
    }

}
public class Example2{
    public static void main(String[] args) {
        DoublyLinkedList  ll = new DoublyLinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.print();
    }
}    