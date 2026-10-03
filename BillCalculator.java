//1C
import java.util.Scanner;
public class BillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.print("Enter water consumption in litres: ");
        double consumption = scanner.nextDouble();
	int bill;
        if (consumption <= 500) {
            bill = 100;
        } else {
            bill = 200;
        }
	System.out.println("Water Bill: Rs." + bill);
	scanner.close();
    }
}