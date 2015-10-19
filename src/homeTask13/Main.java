package homeTask13;
public class Main extends Exception{

    static void throwOne(int size1) throws NegativeSizeOfArrayException, ZeroSizeArrayException {
        OurStack s = new OurStack(size1);
        System.out.println("FIFO");
        s.push(1);
        s.push(12);
        s.push(8);
        s.push(14);
        if (size1 == 0)throw new ZeroSizeArrayException("zero");
        if (size1 < 0)throw new NegativeSizeOfArrayException ("negative value");
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
        System.out.println("array size " + s.size());
    }
    static void throwTwo(int size2) throws NegativeSizeOfArrayException, ZeroSizeArrayException {
        System.out.println("LIFO");
        OurQueue q = new OurQueue(size2);
        q.push(3);
        q.push(6);
        q.push(23);
        q.push(-1);
        q.push(0);
        q.push(7);
        if (size2 == 0) throw new ZeroSizeArrayException("zero value");
        if (size2 < 0)throw new NegativeSizeOfArrayException ("negative value");
        while (!q.isEmpty()) {
            System.out.println(q.pop());
        }
        System.out.println("array size " + q.size());

    }


    public static void main(String[] args){
        try {
             throwOne(6);
            throwTwo(6);

        }catch (ZeroSizeArrayException e){
            System.out.println("utfhn");
        }catch (NegativeSizeOfArrayException e){
            System.out.println("iufndns");
        }
    }
    }


