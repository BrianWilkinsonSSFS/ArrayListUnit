import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Algorithms {

    public static ArrayList<Integer> fileDuplicates() throws IOException {

        Scanner f = new Scanner(new File("file1.txt"));
        Scanner g = new Scanner(new File("file2.txt"));

        ArrayList<Integer> listOne = new ArrayList<>();
        ArrayList<Integer> listTwo = new ArrayList<>();
        ArrayList<Integer> dupes = new ArrayList<>();

        while (f.hasNext()) {
            listOne.add(f.nextInt());
        }

        while (g.hasNext()) {
            listTwo.add(g.nextInt());
        }

        for (Integer i: listOne) {
            for (Integer j: listTwo) {
                if (i.equals(j)) {
                    dupes.add(i);
                }
            }
        }

        return dupes;
    }

    public static ArrayList<String> fileDuplicatesTwo() throws IOException {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> ogNames = new ArrayList<>();


        Scanner f = new Scanner(new File("names.txt"));

        while (f.hasNext()) {
            ogNames.add(f.next());
        }

        System.out.println(ogNames);

        boolean isDupe = false;

        return names;
    }
}
