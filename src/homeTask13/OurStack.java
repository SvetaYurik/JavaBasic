package homeTask13;

public class OurStack implements DataAlgorithm {
    public int maxSize; // size of stack
    protected int[] stackArray;
    protected int top; // top of stack

    public OurStack(int size) {
        try {
            maxSize = size;
            stackArray = new int[maxSize];
        }catch (NegativeArraySizeException e){
            System.out.println("Negative");
        }catch (NullPointerException e){
            System.out.println("Null array");
        }

            top = -1; // while is no one element

    }

    public boolean empty() {
        if (top == -1) return true;
        return false;
    }

    @Override
    public void push(int data) {
        try {
            stackArray[++top] = data;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("nelza dobavit");
        }catch (NullPointerException e){
            System.out.println("null pointer");
        }
    }

    @Override
    public int peek() {

        return stackArray[top];
    }
    public int pop() {

            return stackArray[top--];
        }

    }


