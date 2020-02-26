import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Donor {

    private String name;
    private double amount;

    public Donor(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " gave $" + this.amount;
    }

    public static void main(String[] args) throws IOException {
        ArrayList<Donor> donors = new ArrayList<>();
        Scanner scan = new Scanner(new File("donors.txt"));
        while (scan.hasNext()) {
            Donor nextDonor = new Donor(scan.next(), scan.nextDouble());
            donors.add(nextDonor);
        }

    }
}
