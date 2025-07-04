package easy;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Test;

public class TwoSumTest {

    @Test
    public void testTwoSum() {
        TwoSum ts = new TwoSum();
        int[] result = ts.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(new int[]{0, 1}, result);
    }
    
    @Test
    public void testNoMatch() {
        TwoSum ts = new TwoSum();
        assertNull(ts.twoSum(new int[]{1, 2, 3}, 100));
    }
}

