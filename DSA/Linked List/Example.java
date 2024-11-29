//LinkedList -> collection of nodes

//node has 2 things -> data and next pointer
//no random access
//insert head, delete head and delete tail, delete form middle  --> task hw

class Node{
    public int data;
    public Node next;

    Node(int data){
        this.data = data;
        this.next = null;    }
}


class LinkedList{
    public Node head;
    public Node tail;

    LinkedList(){
        this.head = null;
        this.tail = null;
    }

    void add(int value){
        Node newNode = new Node(value);
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
        } else{
            this.tail.next = newNode;
            this.tail = tail.next;
            //only with head and having pointer
            // Node ptr = this.head;
            // while(ptr.next != null){
            //     ptr = ptr.next;
            // }
            // ptr.next = newNode;
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
public class Example{
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.print();
    }
}    