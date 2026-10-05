import java.util.Scanner;

public class TestSandwich
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Sandwich sandwich = new Sandwich();

        System.out.print("Enter the main ingredient: ");
        sandwich.setMainIngredient(input.nextLine());

        System.out.print("Enter the bread type: ");
        sandwich.setBreadType(input.nextLine());

        System.out.print("Enter the price: ");
        sandwich.setPrice(input.nextDouble());

        System.out.println("\nSandwich Information:");
        System.out.println("Main ingredient: " + sandwich.getMainIngredient());
        System.out.println("Bread type: " + sandwich.getBreadType());
        System.out.println("Price: $" + sandwich.getPrice());
    }
}
