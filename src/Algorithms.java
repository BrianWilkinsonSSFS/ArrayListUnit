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

        names.add(ogNames.get(0));

        for (String name: ogNames) {
            boolean found = false;
            for (int i=0; i<names.size(); i++){
                if (name.equals(names.get(i))) {
                    found = true;
                    break;
                }

            }
            if (!found) {
                names.add(name);
            }
        }

        return names;
    }

    public static ArrayList<Integer> orderedList() throws IOException {
        Scanner f = new Scanner(new File("file1.txt"));
        ArrayList<Integer> ordered = new ArrayList<>();
        while (f.hasNext()) {
            Integer currentNumber = f.nextInt();
            if (ordered.size()==0) {
                ordered.add(currentNumber);
            } else {
                boolean added = false;
                for (int i=0; i<ordered.size(); i++) {
                    if (currentNumber < ordered.get(i)) {
                        ordered.add(i, currentNumber);
                        added = true;
                        break;
                    }
                }
                if (!added) {
                    ordered.add(currentNumber);
                }

            }

        }

        return ordered;
    }
}
