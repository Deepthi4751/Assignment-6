import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        boolean continueInput = true;
        while (continueInput) {
            System.out.print("Enter a number (or type 'stop' to finish): ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("stop")) {
                continueInput = false;
            } else {
                try {
                    int number = Integer.parseInt(input);
                    largest = Math.max(largest, number);
                    smallest = Math.min(smallest, number);
                    sum += number;
                    count++;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number or 'stop' to finish.");
                }
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Largest number: " + largest);
            System.out.println("Smallest number: " + smallest);
            System.out.println("Average of all numbers: " + average);
        } else {
            System.out.println("No numbers entered.");
        }

        scanner.close();
    }
}
