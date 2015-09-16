/**
 * Created by Света on 10.09.2015.
 */
public class Loop {
    public static void main (String [] args){
         int times = 0;
        for (int i = 0; i < 20; i++){
            if (i % 2 == 0) {
                times++;
                System.out.println("i= " +i);
            }
        }
        System.out.println("");
    }
}
