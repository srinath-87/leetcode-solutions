package hard;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MedianOfTwoSortedArraysTest {

    private final MedianofTwoSortedArrays solver = new MedianofTwoSortedArrays();

    @Test
    void exampleEvenTotal() {
        assertEquals(2.5, solver.findMedianSortedArrays(
                new int[]{1, 2},
                new int[]{3, 4}
        ));
    }

    @Test
    void exampleOddTotal() {
        assertEquals(2.0, solver.findMedianSortedArrays(
                new int[]{1, 3},
                new int[]{2}
        ));
    }

    @Test
    void oneArrayEmpty() {
        assertEquals(2.0, solver.findMedianSortedArrays(
                new int[]{},
                new int[]{1, 2, 3}
        ));
    }

    @Test
    void differentSizesWithDuplicates() {
        assertEquals(2.0, solver.findMedianSortedArrays(
                new int[]{1, 2, 2},
                new int[]{2, 2, 3, 4}
        ));
    }

    @Test
    void largeFirstSmallSecond() {
        assertEquals(8.0, solver.findMedianSortedArrays(
                new int[]{7, 8, 9, 10},
                new int[]{6}
        ));
    }
}

