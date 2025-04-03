// 1. Advanced Banking System (Checked & Unchecked Exceptions)
import java.util.Scanner;
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your current account balance:");
        double balance = scanner.nextDouble();
        try {
            System.out.println("Enter the amount to withdraw:");
            double withdrawAmount = scanner.nextDouble();
            if (withdrawAmount > balance) {
                throw new InsufficientFundsException("Insufficient funds in your account.");
            } else if (withdrawAmount <= 0) {
                throw new IllegalArgumentException("Withdrawal amount must be positive.");
            }
            balance -= withdrawAmount;
            System.out.println("Withdrawal successful! Remaining balance: " + balance);
        } catch (InsufficientFundsException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
//2. File Processing with Try-with-Resources & Custom Exception
import java.io.*;
import java.util.Scanner;
class FileEmptyException extends Exception {
    public FileEmptyException(String message) {
        super(message);
    }
}
public class FileProcessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file path:");
        String filePath = scanner.nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();
            if (line == null) {
                throw new FileEmptyException("The file is empty.");
            }
            System.out.println("File contents:");
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (FileEmptyException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
//3. Multi-Catch Block: E-Commerce System
import java.util.Scanner;
public class ECommerceSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the price of the product:");
            double price = scanner.nextDouble();
            System.out.println("Enter the quantity:");
            int quantity = scanner.nextInt();
            if (price < 0 || quantity < 0) {
                throw new IllegalArgumentException("Price and quantity must be positive.");
            }
            double totalCost = price * quantity;
            System.out.println("Total cost: " + totalCost);
        } catch (IllegalArgumentException e) {
            System.out.println("Input Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
    }
}
