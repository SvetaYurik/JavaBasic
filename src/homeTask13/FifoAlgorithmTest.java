package homeTask13;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class FifoAlgorithmTest {
    int s1 = 1;
    int s2 = 2;
    int s3 = 3;
    FifoAlgorithm s = new FifoAlgorithm(3);


    @Test
    public void testEmpty() throws Exception {
        assertTrue(2==2);

    }

    @Test
    public void testPush() throws Exception, CrowdedArrayException {
        s.push(s1);
        s.push(s2);
        s.push(s3);
        assertEquals(s.pop(), s3);
        assertEquals(s.pop(), s2);
        assertEquals(s.pop(), s1);
    }

    @Test
    public void testPop() throws Exception, CrowdedArrayException{
        s.push(s1);
        s.push(s2);
        s.pop();
        assertEquals(s.pop(), s1);
    }

}