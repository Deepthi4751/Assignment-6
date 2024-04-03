import java.util.Scanner;

public class CalculateTotalExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input quantity and price per item
        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the price per item: ");
        double pricePerItem = scanner.nextDouble();

        // Calculate total expenses
        double totalExpenses = calculateTotalExpenses(quantity, pricePerItem);

        // Output total expenses
        System.out.println("Total expenses: $" + totalExpenses);

        scanner.close();
    }

    public static double calculateTotalExpenses(int quantity, double pricePerItem) {
        double totalExpenses = quantity * pricePerItem;

        // Apply discount based on the quantity purchased
        if (quantity > 50) {
            totalExpenses -= totalExpenses * 0.10; // 10% discount
        } else if (quantity >= 25 && quantity <= 50) {
            totalExpenses -= totalExpenses * 0.05; // 5% discount
        }

        return totalExpenses;
    }
}
