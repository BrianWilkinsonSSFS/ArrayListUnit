import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Traversing {

    public static Scanner scan = new Scanner(System.in);

    public static ArrayList<String> getStates() {
        ArrayList<String> states = new ArrayList<>();
        while (true) {
            String state = scan.next();
            if (state.equals("Stop")) {
                break;
            } else {
                states.add(state);
            }
        }

        return states;

    }

    public static String createList(ArrayList<String> states) {
        String blank = "";
        for (int i=0; i<states.size()-1; i++) {
            blank += states.get(i) + " -> ";
        }
        blank += states.get(states.size()-1);
        return blank;
    }

    public static ArrayList<Integer> largestAndSmallest() throws IOException {
        Scanner f = new Scanner(new File("numbers.txt"));
        ArrayList<Integer> nums = new ArrayList<>();

        while (f.hasNext()) {
            nums.add(f.nextInt());
        }
        Integer max = Integer.MIN_VALUE;
        Integer min = Integer.MAX_VALUE;
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < nums.size(); i++) {
            Integer current = nums.get(i);
            if (current > max) {
                max = current;
                maxIndex = i;
            }

            if (current < min) {
                min = current;
                minIndex = i;
            }
        }

        if (!nums.get(0).equals(min)) {
            nums.remove(minIndex);
            nums.add(0, min);
        }

        if (!nums.get(nums.size()-1).equals(max)) {
            nums.remove(maxIndex);
            nums.add(max);
        }

        return nums;
    }

}
