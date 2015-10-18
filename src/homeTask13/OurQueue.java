package homeTask13;

public class OurQueue implements DataAlgorithm {
    private int maxSize; //size of queue
    private int[] queArray;
    private int front; // pointer for first element of queue
    private int rear; // last element of queue
    private int nItems; // quantity of elements


    public OurQueue(int size) {
        try {
            maxSize = size;
            queArray = new int[maxSize];
        }catch (NegativeArraySizeException e){
           System.out.println("Negative array size. Enter new array size");
        }catch (NullPointerException e){
            System.out.println("Null size of array");
        }

        front = 0;
        rear = -1;
        nItems = 0;

    }

    @Override
    public boolean empty() { // true if queue is empty
        if (nItems == 0) return true;
        return false;
    }

    @Override
    public void push(int data) {
       try {
            if (rear == maxSize-1)
                rear = -1;
            rear++;
            queArray[rear] = data;
            nItems++;
        }catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("array index out of bounds exception");
       }catch (NullPointerException e){
           System.out.println("bla bla");
       }

    }

    @Override
    public int peek() {
        return queArray[front];
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
}
