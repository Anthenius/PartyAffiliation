import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String partyAffiliation = "";

        System.out.print("Enter your party affiliation [R, D, I]:  ");
        partyAffiliation = in.nextLine();

        if (partyAffiliation.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant 🐘");
        } else if (partyAffiliation.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey 🦙");
        } else if (partyAffiliation.equalsIgnoreCase("I")) {
            System.out.println("You get an Independent Person 👤");
        } else {
            System.out.println("You get: " + partyAffiliation + ", an unrecognized party affiliation 😕");
        }

        in.close(); // Close the scanner
    }
}
