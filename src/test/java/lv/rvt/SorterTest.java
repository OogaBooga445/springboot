package lv.rvt;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import rvt.Sorter;

public class SorterTest {

    @Test
    public void testSmallest() {

        int[] numbers = {6, 5, 8, 7, 11};
        assertEquals(5, Sorter.smallest(numbers));
    }

    @Test
    public void testindexOfSmallest() {

        int[] numbers = {6, 5, 8, 7, 11};
        assertEquals(1, Sorter.indexOfSmallest(numbers));
    }


    @Test
    public void testIndexOfSmallestFrom() {

        int[] numbers = {6, 5, 8, 7, 11};
        assertEquals(3, Sorter.indexOfSmallestFrom(numbers, 2));
    }

    @Test
    public void testswap() {

        int[] numbers = {3, 2, 5, 4, 8};
        int[] expectedArray = {4, 2, 5, 3, 8};
        assertArrayEquals(expectedArray, Sorter.swap(numbers, 0, 3));
    }




    @Test
    public void sorttest() {
        int[] wrongnumber   = {8, 3, 7, 9, 1, 2, 4};
        int[] expectedArray = {1, 2, 3, 4, 7, 8, 9};

        assertArrayEquals(expectedArray, Sorter.sort(wrongnumber));

    }
}
