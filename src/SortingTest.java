import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.*;

public class SortingTest {


    @Test
    public void aIsSorted() throws IOException {
        ArrayList<Integer> num1 = Sorting.getUnsorted();
        assertEquals(false, Sorting.isSorted(num1));
    }

    @Test
    public void bIsSorted() throws IOException {
        ArrayList<Integer> num1 = Sorting.getUnsorted();
        assertEquals(false, Sorting.isSorted(num1));
    }

    @Test
    public void cIsSorted() throws IOException {
        ArrayList<Integer> num1 = Sorting.getUnsorted();
        assertEquals(true, Sorting.isSorted(num1));
    }

    @Test
    public void dIsSorted() throws IOException {
        ArrayList<Integer> num1 = Sorting.getUnsorted();
        assertEquals(false, Sorting.isSorted(num1));
    }
}