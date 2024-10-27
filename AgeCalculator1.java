import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Menu options
        System.out.println("Choose an option:");
        System.out.println("1. Calculate age from date of birth");
        System.out.println("2. Calculate date of birth from age in years");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        if (choice == 1) {
            calculateAge(scanner);
        } else if (choice == 2) {
            calculateDOBFromAge(scanner);
        } else {
            System.out.println("Invalid option.");
        }
        
        scanner.close();
    }

    // Method to calculate age from date of birth
    public static void calculateAge(Scanner scanner) {
        System.out.print("Enter your date of birth (dd-MM-yyyy): ");
        String dobInput = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        try {
            LocalDate dob = LocalDate.parse(dobInput, formatter);
            LocalDate currentDate = LocalDate.now();

            if (dob.isAfter(currentDate)) {
                System.out.println("The date of birth cannot be in the future.");
            } else {
                Period age = Period.between(dob, currentDate);
                System.out.printf("Your age is %d years, %d months, and %d days.%n", 
                                  age.getYears(), age.getMonths(), age.getDays());
            }
        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter the date in the format dd-MM-yyyy.");
        }
    }

    // Method to calculate date of birth from age in years
    public static void calculateDOBFromAge(Scanner scanner) {
        System.out.print("Enter your age in years: ");
        int years = scanner.nextInt();

        LocalDate currentDate = LocalDate.now();
        LocalDate dob = currentDate.minusYears(years);

        System.out.println("Your approximate date of birth could be around: " 
                           + dob.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
    }
}
