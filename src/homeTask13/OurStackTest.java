package homeTask13;


import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class OurStackTest {
    int s1 = 1;
    int s2 = 2;
    int s3 = 3;
    OurStack s = new OurStack(3);


    @Test
    public void testEmpty() throws Exception {
        assertTrue(2==2);

    }

    @Test
    public void testPush()  throws Exception {
        s.push(s1);
        s.push(s2);
        s.push(s3);
        assertEquals(s.pop(), s3);
        assertEquals(s.pop(), s2);
        assertEquals(s.pop(), s1);
            }



    @Test
    public void testPop() throws Exception {
    }

    @Test
    public void testSize() throws Exception{
        s.push(s1);
        s.push(s2);
        s.push(s3);
        assertEquals(s.size(), 3);

    }
}