//Queue -> First in First out
//pointers -> front and back
//front points the element which is to be processed next
//back(rear) points the last element in queue
//in enqueue the back keeps on changing and in dequeue front changes


class MyQueue{

    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    

    public MyQueue(int capacity){
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
        rear = (rear + 1)% capacity;
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
        
        MyQueue queue = new MyQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.dequeue(1);
        queue.dequeue(2);
        queue.dequeue(3);
        queue.dequeue(4);
        queue.dequeue(5);
        queue.dequeue(6);

    }
}