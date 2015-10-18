package homeTask13;



public class Main {


        public static void main(String[] args) {

            System.out.println("FIFO");
            OurStack s = new OurStack(4);
            s.push(1);
            s.push(12);
            s.push(8);
            s.push(14);

            while (!s.empty()){
                System.out.println(s.pop());

            }
            System.out.println("LIFO");
            OurQueue q = new OurQueue(0);
            q.push(3);
            q.push(6);
            q.push(23);
            q.push(-1);
            q.push(0);


            while (!q.empty()){

                System.out.println(q.pop());

            }







    }

}
