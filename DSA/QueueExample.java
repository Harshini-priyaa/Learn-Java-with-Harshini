
import java.util.Scanner;

class QueueExample{

    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    

    public QueueExample(int capacity){
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.front = 0;
        this.size = 0;
        this.rear = -1;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean  isFull(){
        return size == capacity;
    }

    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is full, can't enqueue");
            return;
        }
        rear = (rear + 1)% capacity; //wrap around that is again go to front
        arr[rear] = value;
        size++;
        System.out.println("Enqueued: "+ value);
        
    }

    public void dequeue(int value){
        if(isEmpty()){
            System.out.println("Queue is empty, can't dequeue");
            return;
        }
        front = (front + 1)% capacity;
        arr[front] = value;
        size--;
        System.out.println("Dequeued: "+value);
        
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cap = in.nextInt();
        MyQueue queue = new MyQueue(cap);
        
        for(int i = 1; i <= cap ; i+=1){
            i = in.nextInt();
            queue.enqueue(i);
        }


    }
}