import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter your party affiliation (R, D, I): ");
        String partyAffil = "";
        partyAffil = input.nextLine();


        if (partyAffil.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant");
        }
        else if (partyAffil.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey");
        }
        else if (partyAffil.equalsIgnoreCase("I"))
        {
            System.out.println("You get an Independent Person");
        }
        else
        {
            System.out.println("I don't know what party you belong to.");
            System.out.println("Please run the program again with [R, D, or I]");
        }


    }
}