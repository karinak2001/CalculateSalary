import java.util.Scanner;

public class CalculateSalary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //לקלוט מהמשתמש שכר שעתי
        System.out.println("Enter hourly wage: ");
        double hourlyWage = scanner.nextDouble();

        //לקלוט מהמשתמש מספר שעות עבודה בחודש
        System.out.println("Enter number of hours worked per month: ");
        int hoursWorkedPerMonth = scanner.nextInt();

        //לחשב את המשכורת החודשית ברוטו
        double grossSalary = hourlyWage * hoursWorkedPerMonth;

        //להדפיס על המסך את התוצאה של החישוב של המשכורת
        System.out.println("Gross salary: " + grossSalary);


    }
}