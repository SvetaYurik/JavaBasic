package homeTask13;

public class OurQueue implements DataAlgorithm {
    private int maxSize; //size of queue
    private int[] queArray;
    private int front; // pointer for first element of queue
    private int rear; // last element of queue
    private int nItems; // quantity of elements


    public OurQueue(int size) {
        queArray = new int[size];
        front = 0;
        rear = -1;
        nItems = 0;

    }

    @Override
    public boolean isEmpty() { // true if queue is empty
        if (nItems == 0) return true;
        return false;
    }

    @Override
    public void push(int data) {
        if (rear == maxSize - 1)
            rear = -1;
        rear++;
        queArray[rear] = data;
        nItems++;
    }

    @Override
    public int pop() {
        int temp = queArray[front];
        front++;
        if (front == maxSize)
            front = 0;
        nItems--;
        return temp;
    }

    @Override
    public int size(){
        return queArray.length;
    }
}
