
import java.util.Scanner;

public class TestTeam
{
    public static void main(String[] args)
    {
        Team team1 = setTeamData();
        Team team2 = setTeamData();
        Team team3 = setTeamData();

        display(team1);
        display(team2);
        display(team3);
    }

    public static Team setTeamData()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter high school name >> ");
        String school = input.nextLine();

        System.out.print("Enter sport >> ");
        String sport = input.nextLine();

        System.out.print("Enter team name >> ");
        String name = input.nextLine();

        Team tempTeam = new Team(school, sport, name);

        return tempTeam;
    }

    public static void display(Team team)
    {
        System.out.println("High School: " + team.getHighSchoolName());
        System.out.println("Sport: " + team.getSport());
        System.out.println("Team Name: " + team.getTeamName());
        System.out.println("Motto: " + Team.MOTTO);
        System.out.println();
    }
}
