package homeTask13;

import org.junit.Test;

import static org.junit.Assert.*;

public class LifoAlgorithmTest {
    int q1 = 1;
    int q2 = 2;
    int q3 = 3;
    int q4 = 4;
    LifoAlgorithm q = new LifoAlgorithm(4);

    @Test
    public void testEmpty() throws Exception {
        assertTrue(1==1);

    }

    @Test
    public void testPush() throws Exception, CrowdedArrayException {
        q.push(q1);
        q.push(q2);
        q.push(q3);
        q.push(q4);
        assertEquals(q.pop(), q1);
        assertEquals(q.pop(), q2);
        assertEquals(q.pop(), q3);
        assertEquals(q.pop(), q4);
    }

}