package homeTask13;


public interface DataAlgorithm {


        boolean empty(); //check is the repository empty
        void push(int data); // add in the repository new data
        int peek(); // get top value without removing
        int pop(); // get top value with removing
    }

