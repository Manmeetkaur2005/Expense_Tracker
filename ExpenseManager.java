import java.util.ArrayList;

public class ExpenseManager {
    private ArrayList<Expense> expenses;

    public ExpenseManager() {
        expenses = new ArrayList<>();
    }

    public void addExpense(Expense expense) {  //  renamed to singular
        expenses.add(expense);                //  correct object added
        System.out.println("Expense added successfully!");
    }

    public void showAllExpenses() {           // corrected method name
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded yet.");
            return;
        }

        System.out.println("\nALL EXPENSES:");
        for (Expense e : expenses) {
            System.out.println(e);
        }
    }

    public double getTotalExpense() {
        double total = 0;
        for (Expense e : expenses) {
            total += e.getAmount();
        }
        return total;
    }
}








