package homeTask13;


public interface FifoLifoAlgorithm {


        boolean isEmpty() throws CrowdedArrayException; //check is the repository empty
        void push(int element); // add in the repository new data
        int pop() throws CrowdedArrayException, FullArrayException; // get top value with removing

    }

