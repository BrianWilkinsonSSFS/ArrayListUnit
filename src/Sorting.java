import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sorting {

    public static ArrayList<Integer> getUnsorted() throws IOException {

        Scanner scan = new Scanner(new File("sortedData.txt"));
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i=0; i<8; i++) {
            nums.add(scan.nextInt());
        }
        return nums;
    }

    public static boolean isSorted(ArrayList<Integer> arr) {

        for (int i=0; i<arr.size()-1; i++) {
            if (arr.get(i) > arr.get(i+1)) {
                return false;
            }
        }
        return true;
    }
}
