import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods {

    public static Scanner scan = new Scanner(System.in);

    public static ArrayList<Integer> numberList() {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(0);
        numbers.add(-5);
        numbers.add(7);
        numbers.add(12);
        numbers.add(-1);
        numbers.add(2, 10);
        numbers.set(1, 9);
        numbers.remove(4);

        return numbers;
    }

    public static ArrayList<Double> firstAndLast() {
        ArrayList<Double> numbers = new ArrayList<>();
        ArrayList<Double> returnList = new ArrayList<>();

        while (true) {
            Double nextNum = scan.nextDouble();
            if (nextNum == 0) {
                break;
            } else {
                numbers.add(nextNum);
            }
        }


        Double numSize = (double)numbers.size();
        Double firstNum = numbers.get(0);
        Double lastNum = numbers.get(numbers.size()-1);

        returnList.add(numSize);
        returnList.add(firstNum);
        returnList.add(lastNum);

        return returnList;

    }

    public static ArrayList<Double> getNumbers() {
        ArrayList<Double> decimals = new ArrayList<>();

        System.out.println("Please enter the first number");
        Double num1 = scan.nextDouble();
        decimals.add(num1);
        System.out.println("Please enter the second number");
        Double num2 = scan.nextDouble();
        decimals.add(num2);
        System.out.println("Please enter the last number");
        Double num3 = scan.nextDouble();
        decimals.add(num3);

        return decimals;

    }

    public static ArrayList<Double> arrangeList(ArrayList<Double> numbers) {

        ArrayList<Double> arranged = new ArrayList<>();

        if (numbers.get(0) > numbers.get(1) && numbers.get(0) > numbers.get(2)) {
            arranged.add(0, numbers.get(0));
            numbers.remove(0);
        } else if (numbers.get(1) > numbers.get(0) && numbers.get(1) > numbers.get(2)) {
            arranged.add(0, numbers.get(1));
            numbers.remove(1);
        } else {
            arranged.add(0, numbers.get(2));
            numbers.remove(2);
        }

        if (numbers.get(0) > numbers.get(1)) {
            arranged.add(0, numbers.get(0));
            arranged.add(0, numbers.get(1));
        } else {
            arranged.add(0, numbers.get(1));
            arranged.add(0, numbers.get(0));
        }

        return arranged;

    }

    public static void guess(ArrayList<Integer> list){
        for(int i = 0; i < list.size(); i++){
            if(i / 3 > 0)
                list.set(0, list.get(i));
            else
                list.set(1, list.get(i));
            System.out.println(i + " " + list);
        }

    }



    public static void main(String[] args) {
        //System.out.println(numberList());
        //System.out.println(firstAndLast());
        //ArrayList<Double> myList = getNumbers();
        //System.out.println(arrangeList(myList));
        ArrayList<Integer> test = new ArrayList<>();
        test.add(5);
        test.add(4);
        test.add(9);
        test.add(11);
        test.add(24);
        test.add(65);
        guess(test);


    }
}
