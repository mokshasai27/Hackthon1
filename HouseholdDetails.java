import java.util.Scanner;
public class HouseholdDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.print("Enter number of family members: ");
        int familyMembers = scanner.nextInt();
	System.out.print("Enter water consumed (in litres): ");
        double waterConsumed = scanner.nextDouble();
	System.out.print("Enter house number: ");
        int houseNumber = scanner.nextInt();
	System.out.print("Enter water usage status: ");
        char usageStatus = scanner.next().charAt(0);
	System.out.println("\n--- Household Details ---");
        System.out.println("House Number: " + houseNumber);
        System.out.println("Family Members: " + familyMembers);
        System.out.println("Water Consumed: " + waterConsumed + " L");
        System.out.println("Usage Status: " + usageStatus);

        scanner.close();
    }
}
