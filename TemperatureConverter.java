import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Help make a conversion choice
        System.out.println("Temperature Converter");
        System.out.println("Choose an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");

        // Validate user choice
        int choice;
        while (true) {
            System.out.print("Enter your choice (1 or 2): ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice == 1 || choice == 2) {
                    break; // Valid choice
                } else {
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }

        // Prompt for temperature input
        double temperature;
        while (true) {
            System.out.print("Enter the temperature: ");
            if (scanner.hasNextDouble()) {
                temperature = scanner.nextDouble();
                break; // Valid temperature
            } else {
                System.out.println("Invalid input. Please enter a valid temperature.");
                scanner.next(); // Clear invalid input
            }
        }

        // Perform conversion based on user choice
        if (choice == 1) {
            // Convert Celsius to Fahrenheit
            double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.printf("%.2f Celsius is %.2f Fahrenheit.%n", temperature, fahrenheit);
        } else {
            // Convert Fahrenheit to Celsius
            double celsius = (temperature - 32) * 5 / 9;
            System.out.printf("%.2f Fahrenheit is %.2f Celsius.%n", temperature, celsius);
        }

        // Close the scanner
        scanner.close();
    }}
