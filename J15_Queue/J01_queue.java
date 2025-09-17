package J15_Queue;

public class J01_queue {
    private int[] arr;   // Array to store queue elements
    private int front;   // Front points to the first element
    private int rear;    // Rear points to the last element
    private int capacity; // Maximum capacity of the queue
    private int count;   // Current size of the queue

    // Constructor
    public J01_queue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    // Add element to the queue (Enqueue)
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot insert " + item);
            return;
        }
        rear = (rear + 1) % capacity;  // Circular increment
        arr[rear] = item;
        count++;
        System.out.println(item + " inserted into the queue.");
    }

    // Remove element from the queue (Dequeue)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Cannot dequeue.");
            return -1;
        }
        int item = arr[front];
        front = (front + 1) % capacity; // Circular increment
        count--;
        return item;
    }

    // Get front element without removing (Peek)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[front];
    }

    // Return the size of the queue
    public int size() {
        return count;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return (count == 0);
    }

    // Check if queue is full
    public boolean isFull() {
        return (count == capacity);
    }

    // Display queue elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}

// Test the Queue
public class QueueDemo {
    public static void main(String[] args) {
        MyQueue q = new MyQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();

        System.out.println("Front element: " + q.peek());
        System.out.println("Removed element: " + q.dequeue());

        q.display();

        q.enqueue(60); // Will go in place of removed element
        q.display();
    }
}

