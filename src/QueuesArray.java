// queues using array

public class QueuesArray {
    private int data[];
    private int front;
    private int rear;
    private int size;

    public QueuesArray(int n) {
        data = new int[n];
        front = 0;
        rear = 0;
        size = 0;
    }

    public int length() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }
// add element in array
    public void enqueue(int e) {
        if(isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        else {
            data[rear] = e;
            rear = rear + 1;
            size = size + 1;
        }
    }
//delet element
    public int dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        else {
            int e = data[front];
            front = front + 1;
            size = size - 1;
            return e;
        }
    }

    public void display() {
        for(int i=front;i<rear;i++)
            System.out.print(data[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        QueuesArray q = new QueuesArray(10);
        q.enqueue(5);
        q.enqueue(3);
        q.display();
        System.out.println("Size: " + q.length());
        System.out.println("Element Removed: " + q.dequeue());
        System.out.println("IsEmpty: "+q.isEmpty());
        System.out.println("Element Removed: " + q.dequeue());
        System.out.println("IsEmpty: "+q.isEmpty());
        q.enqueue(7);
        q.enqueue(9);
        q.enqueue(4);
        q.display();
        System.out.println("Size: " + q.length());
    }

}
