package homeTask13;

public class FifoAlgorithm implements FifoLifoAlgorithm {
    protected int[] stackArray; //
    protected int top; // top of stack


    public FifoAlgorithm(int size) {

            stackArray = new int[size];
            top = -1; // while is no one element


    }

    public boolean isEmpty() {
        if (top == -1) return true;
        return false;
    }

    @Override
    public void push(int item) {
        if (top==stackArray.length-1) {
            int temp[] = new int[stackArray.length * 2];
            for (int i = 0; i < stackArray.length; i++) temp[i] = stackArray[i];
            stackArray = temp;
            stackArray[++top] = item;
        }else stackArray[++top] = item;


    }

    @Override
    public int pop() throws CrowdedArrayException {


        if (isEmpty())
            throw new CrowdedArrayException("Crowded array!");

        return stackArray[top--];

        }
        }



