package homeTask13;
public class Main {

    static void throwOne(int size1) throws ZeroSizeArrayException, CrowdedArrayException {
        FifoAlgorithm s = new FifoAlgorithm(size1);
        if (size1 == 0)throw new ZeroSizeArrayException("zero");
        if (size1 < 0)throw new NegativeArraySizeException("negative value");
        System.out.println("FIFO");
        s.push(1);
        s.push(12);
        s.push(7);
        s.pop();


        while (!s.isEmpty()) {
            System.out.println(s.pop());

        }

    }
    static void throwTwo(int size2) throws ZeroSizeArrayException, CrowdedArrayException {
        System.out.println("LIFO");
        LifoAlgorithm q = new LifoAlgorithm(size2);
        if (size2 < 0)throw new NegativeArraySizeException ("negative value");
        if (size2 == 0) throw new ZeroSizeArrayException("zero value");


        q.push(3);
        q.pop();
        q.pop();


        while (!q.isEmpty()) {
            System.out.println(q.pop());

        }
    }

    public static void main(String[] args) throws CrowdedArrayException {
        try {
            throwOne(3);
            throwTwo(3);

        }catch (NegativeArraySizeException e){
            System.out.println("You enter negative value of array size.");
        }catch (ZeroSizeArrayException e){
            System.out.println("You enter zero size of array. Enter new value, please!");
        }
    }
    }


