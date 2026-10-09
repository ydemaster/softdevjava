
import java.util.Scanner;

public class TestGame
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first team details:");
        Team team1 = TestTeam.setTeamData();

        System.out.println("Enter second team details:");
        Team team2 = TestTeam.setTeamData();

        System.out.print("Enter game time >> ");
        String time = input.nextLine();

        Game game = new Game(team1, team2, time);

        displayGame(game);
    }

    public static void displayGame(Game game)
    {
        System.out.println();
        System.out.println("Game Details:");

        System.out.println("First Team:");
        TestTeam.display(game.getTeam1());

        System.out.println("Second Team:");
        TestTeam.display(game.getTeam2());

        System.out.println("Game Time: " + game.getGameTime());
    }
}
