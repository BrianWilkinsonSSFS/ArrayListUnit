import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class AlgorithmsTest {

    @Test
    public void fileDuplicates() throws IOException {

        ArrayList<Integer> myList = new ArrayList<Integer>(Arrays.asList(75, 20, 10, 39, 28, 17, 55));
        assertEquals(myList, Algorithms.fileDuplicates());
    }
}