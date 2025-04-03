//Assessment-1
//Q1: Swap two numbers without using a third variable
import java.util.Scanner;
class Swapnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swapping: " + a + " " + b);
    }
}

// Q2: Type promotion example
import java.util.Scanner;
class Typepromotion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter an integer and a double: ");
        int a = sc.nextInt();
        double b = sc.nextDouble();
        double result = a + b;
        System.out.println("Result: " + result);
    }
}

// Q3: Reverse bits of an integer
import java.util.Scanner;
class Reversebits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter an integer: ");
        int num = sc.nextInt();
        int rev = Integer.reverse(num);
        System.out.println("Reversed bits: " + rev);
    }
}

// Q4: Check if a number is a power of two
import java.util.Scanner;
class Poweroftwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = sc.nextInt();
        boolean isPower = (num > 0) && ((num & (num - 1)) == 0);
        System.out.println("Is power of two: " + isPower);
    }
}

// Q5: Evaluate a mathematical expression entered as a string
import java.util.Scanner;
class Evalexpression {
    public static void main(String[] args) throws ScriptException {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a mathematical expression: ");
        String expr = sc.nextLine();
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        System.out.println("Result: " + engine.eval(expr));
    }
}

// Q6: Sum of digits of a number
import java.util.Scanner;
class Sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = sc.nextInt(), sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("sum of digits: " + sum);
    }
}

// Q7: Check if a number is prime
import java.util.Scanner;
class Primecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = sc.nextInt();
        boolean isPrime = num > 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println("Is prime: " + isPrime);
    }
}

// Q8: Generate Fibonacci series up to N terms
import java.util.Scanner;
class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt(), a = 0, b = 1, count = 0;
        System.out.print("Fibonacci series: ");
        do {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
            count++;
        } while (count < n);
    }
}
// Q9: Pattern printer
import java.util.Scanner;
public class PatternPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for the pattern:");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
// Q10: Immutable Class for Configurations
public final class Configuration {
    private final String configName;
    private final int configValue;
    public Configuration(String configName, int configValue) {
        this.configName = configName;
        this.configValue = configValue;
    }
    public String getConfigName() {
        return configName;
    }
    public int getConfigValue() {
        return configValue;
    }
}
//Q11: RGB to Grayscale Converter
import java.util.Scanner;
public class RGBToGrayscale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter R,G,B values :");
        int r = scanner.nextInt();
        int g = scanner.nextInt();
        int b = scanner.nextInt();
        int gray = (r + g + b) / 3;
        System.out.println("Grayscale value: " + gray);
    }
}
//Q12: Integer Compression (Bitwise Encoding)
import java.util.Scanner;

public class IntegerCompression {
    public static int encodeInteger(int input) {
        return input ^ 0xA5A5A5A5; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer to encode:");
        int userInput = scanner.nextInt();

        int encoded = encodeInteger(userInput);
        System.out.println("Encoded value: " + encoded);
    }
}
//Q13: Discount Calculator
import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the original price:");
        double price = scanner.nextDouble();
        System.out.println("Enter the discount rate in %:");
        double discountRate = scanner.nextDouble();
        double discountedPrice = price - (price * discountRate / 100);
        System.out.println("Discounted price: " + discountedPrice);
    }
}
//Q14: ATM Withdrawal Function
import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your account balance:");
        double balance = scanner.nextDouble();
        System.out.println("Enter the amount to withdraw:");
        double amount = scanner.nextDouble();
        if (amount <= balance) {
            balance -= amount;
            System.out.println("withdrawal successful.");
            System.out.println("remaining balance: " + balance);
        } else {
            System.out.println("insufficient balance.");
        }
    }
}
//Q15: Multiplication Table using loops
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to generate its multiplication table:");
        int number = scanner.nextInt();
        System.out.println("Using a 'for' loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        System.out.println("\nUsing a 'while' loop:");
        int j = 1;
        while (j <= 10) {
            System.out.println(number + " x " + j + " = " + (number * j));
            j++;
        }
        System.out.println("\nUsing a 'do-while' loop:");
        int k = 1;
        do {
            System.out.println(number + " x " + k + " = " + (number * k));
            k++;
        } while (k <= 10);
    }
}

//Assessment 2:
//Q1: Product Price Comparison
import java.util.Scanner;
public class ProductComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter price of product A:");
        double priceA = scanner.nextDouble();
        System.out.println("enter price of product B:");
        double priceB = scanner.nextDouble();
        if (priceA < priceB) {
            System.out.println("product A is cheaper.");
        } else if (priceA > priceB) {
            System.out.println("product B is cheaper.");
        } else {
            System.out.println("Both products have the same price.");
        }
    }
}
//Q2: Vehicle Inheritance System
class Vehicle {
    public void displayType() {
        System.out.println("This is a vehicle.");
    }
}

class Car extends Vehicle {
    @Override
    public void displayType() {
        System.out.println("This is a car.");
    }
}
public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.displayType();
        Vehicle car = new Car();
        car.displayType();
    }
}
//Q3: Payment System using Method Overloading
public class PaymentSystem {
    public void pay(int amount) {
        System.out.println("Paid using cash: " + amount);
    }
    public void pay(String cardNumber, int amount) {
        System.out.println("Paid using card (" + cardNumber + "): " + amount);
    }
    public static void main(String[] args) {
        PaymentSystem payment = new PaymentSystem();
        payment.pay(5000);
        payment.pay("1234-5678-9876-5432", 15000);
    }
}
//Q4: Employee Salary Calculation using Method Overriding
class Employee {
    public void calculateSalary() {
        System.out.println("Basic salary is calculated.");
    }
}
class Manager extends Employee {
    @Override
    public void calculateSalary() {
        System.out.println("Manager's salary includes bonuses.");
    }
}
public class SalarySystem {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.calculateSalary();
        Employee manager = new Manager();
        manager.calculateSalary();
    }
}
//Q5: Constructor Chaining in a Banking System
class Account {
    public Account() {
        this("Savings Account");
        System.out.println("Default Account Created.");
    }
    public Account(String type) {
        System.out.println(type + " Created.");
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        Account account = new Account();
    }
}
//Q6: Secure User Data with Encapsulation
import java.util.Scanner;

class User {
    private String name;
    private String password;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean validatePassword(String input) {
        return password.equals(input);
    }
}

public class setPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        user.setName(name);

        System.out.println("Set your password:");
        String password = scanner.nextLine();
        user.setPassword(password);

        System.out.println("\nName: " + user.getName());

        System.out.println("Enter your password for validation:");
        String inputPassword = scanner.nextLine();
        if (user.validatePassword(inputPassword)) {
            System.out.println("Password Valid: true");
        } else {
            System.out.println("Password Valid: false");
        }
    }
}
//Q7: Organizing a Library Management System
import java.util.ArrayList;
import java.util.Scanner;
class Book {
    private int id;
    private String title;
    private String author;
    private int publicationYear;
    private String genre;
    private int totalCopies;
    private int availableCopies;
    private String borrowedBy;
    public Book(int id, String title, String author, int publicationYear, String genre, int totalCopies) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.totalCopies = totalCopies;
        this.availableCopies = totalCopies;
        this.borrowedBy = null;
    }
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Genre: " + genre);
        System.out.println("Total Copies: " + totalCopies);
        System.out.println("Available Copies: " + availableCopies);
        System.out.println("Borrowed By: " + (borrowedBy == null ? "None" : borrowedBy));
        System.out.println();
    }
    public boolean borrowBook(String borrowerName) {
        if (availableCopies > 0) {
            availableCopies--;
            borrowedBy = borrowerName;
            return true;
        }
        return false;
    }
    public void returnBook() {
        if (availableCopies < totalCopies) {
            availableCopies++;
            borrowedBy = null;
        }
    }
    public int getId() {
        return id;
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();
        System.out.println("Enter the number of books to add:");
        int numBooks = scanner.nextInt();
        for (int i = 0; i < numBooks; i++) {
            System.out.println("Enter details for Book " + (i + 1) + ":");
            System.out.println("Enter ID:");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter Title:");
            String title = scanner.nextLine();
            System.out.println("Enter Author:");
            String author = scanner.nextLine();
            System.out.println("Enter Publication Year:");
            int publicationYear = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter Genre:");
            String genre = scanner.nextLine();
            System.out.println("Enter Total Copies:");
            int totalCopies = scanner.nextInt();
            library.add(new Book(id, title, author, publicationYear, genre, totalCopies));
        }
        while (true) {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Display All Books");
            System.out.println("2. Borrow a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\nLibrary Inventory:");
                    for (Book book : library) {
                        book.display();
                    }
                    break;
                case 2:
                    System.out.println("Enter the ID of the book to borrow:");
                    int borrowId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter your name:");
                    String borrowerName = scanner.nextLine();
                    boolean borrowed = false;
                    for (Book book : library) {
                        if (book.getId() == borrowId) {
                            if (book.borrowBook(borrowerName)) {
                                System.out.println("Book borrowed successfully!");
                            } else {
                                System.out.println("No copies available for this book.");
                            }
                            borrowed = true;
                            break;
                        }
                    }
                    if (!borrowed) {
                        System.out.println("Book with ID " + borrowId + " not found.");
                    }
                    break;
                case 3:
                    System.out.println("Enter the ID of the book to return:");
                    int returnId = scanner.nextInt();
                    boolean returned = false;
                    for (Book book : library) {
                        if (book.getId() == returnId) {
                            book.returnBook();
                            System.out.println("Book returned successfully!");
                            returned = true;
                            break;
                        }
                    }
                    if (!returned) {
                        System.out.println("Book with ID " + returnId + " not found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting Library Management System...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
//Q8: Online shopping  -Abstraction
import java.util.Scanner;
abstract class OnlineShop {
    public abstract void addToCart(String item);
    public void checkout() {
        System.out.println("Checkout completed.");
    }
}
class AmazonShop extends OnlineShop {
    @Override
    public void addToCart(String item) {
        System.out.println(item + " added to cart on Amazon.");
    }
}
public class ShoppingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OnlineShop shop = new AmazonShop();
        System.out.println("Enter the item you want to add to the cart:");
        String item = scanner.nextLine();
        shop.addToCart(item);
        System.out.println("Do you want to proceed to checkout? (yes/no):");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            shop.checkout();
        } else {
            System.out.println("You canceled the checkout.");
        }
    }
}
