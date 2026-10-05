import java.util.Scanner;

public class BookstoreCredit
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String name;
        double gpa;

        System.out.print("Enter student's name: ");
        name = input.nextLine();

        System.out.print("Enter student's grade point average: ");
        gpa = input.nextDouble();

        displayCredit(name, gpa);
    }

    public static void displayCredit(String name, double gpa)
    {
        double credit = gpa * 10;

        System.out.println(name + " has a grade point average of " + gpa +
                " and will receive a bookstore credit of $" + credit + ".");
    }
}