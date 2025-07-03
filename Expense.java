import java.time.LocalDate;

public class Expense {
    private double amount;
    private String description;
    private String category;  
    private LocalDate date;  

    // Constructor
    public Expense(double amount, String category, String description, LocalDate date) {
        this.amount = amount;
        this.category = category;
        this.description = description;
        this.date = date;
    }

    // Getters
    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {   //  corrected spelling
        return description;
    }

    public LocalDate getDate() {       //  corrected return type
        return date;
    }

    // toString method
    @Override
    public String toString() {
        return "Date: " + date + " | $" + amount + " | " + category + " | " + description;
    }
}
