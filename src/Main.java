import java.util.Scanner;

public class Main
{
    public static void main(String[] args)

    {
        Scanner in = new Scanner(System.in);
        String partyAfil = "";

        System.out.print("Enter your party affiliation [R,D,I]:  ");
        partyAfil = in.nextLine();


        if (partyAfil.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant \uD83D\uDC18");
        }
        else if (partyAfil.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey \uD83E\uDECF");
        }
        else if (partyAfil.equalsIgnoreCase("I"))
        {
            System.out.println("You get a Independent Man \uD81A\uDE06");
        }
        else
        {
            System.out.println("You get: " + partyAfil + ", a Unrecognized party affiliation \uD83D\uDE15");
        }
    }
}