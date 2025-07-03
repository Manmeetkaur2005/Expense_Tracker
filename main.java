import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        int choice;

        do {
            System.out.println("\n======== Personal Expense Tracker ========");
            System.out.println("1. Add Expense");
            System.out.println("2. View All Expenses");
            System.out.println("3. Show Total Expense");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: $ ");
                    double amount = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter category (Food / Travel / Others): ");
                    String category = sc.nextLine();

                    System.out.print("Enter description: ");
                    String description = sc.nextLine();

                    System.out.print("Enter date (DD-MM-YYYY): ");
                    String dateStr = sc.nextLine();
                    LocalDate date = null;

                    try {
                        date = LocalDate.parse(dateStr, formatter);
                    } catch (DateTimeParseException e) {
                        System.out.println("Invalid date format! Please enter in DD-MM-YYYY format.");
                        break; // Skip adding this expense
                    }

                    Expense e = new Expense(amount, category, description, date);
                    manager.addExpense(e);
                    break;

                case 2:
                    manager.showAllExpenses();
                    break;

                case 3:
                    System.out.println("Total Expenses: $" + manager.getTotalExpense());
                    break;

                case 4:
                    System.out.println("Thank you for using Expense Tracker!");
                    break;

                default:
                    System.out.println("Invalid choice, try again!");
                    break;
            }
        } while (choice != 4);

        sc.close();
    }
}
