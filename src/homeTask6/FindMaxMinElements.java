package homeTask6;

import java.util.Arrays;

public class FindMaxMinElements {
    public static void main (String[] args) {
        int intArray[] = {2, 3, -1, 6, 6, 6, 7, 8, 9, 0, 11111};
        Arrays.sort(intArray);

        System.out.println(" max element " + intArray[10]);
        System.out.println(" min element " + intArray[0]);

    }
}
