//1B
import java.util.Scanner;
public class ConsumptionTracker {
	public static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.print("Enter morning water usage: ");
        int morningUsage = scanner.nextInt();
	System.out.print("Enter evening water usage: ");
        int eveningUsage = scanner.nextInt();
	int totalUsage = calculateTotal(morningUsage, eveningUsage);
	System.out.println("Total Water Consumption: " + totalUsage + " litres");
	scanner.close();
    }
}