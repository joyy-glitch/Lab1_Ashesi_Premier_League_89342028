import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter player name:");
        String name = input.nextLine();
        System.out.println("Enter player age:");
        int age = input.nextInt();
        System.out.println("Enter player height in meters:");
        float height = input.nextFloat();
        System.out.println("Enter player weight in pounds:");
        float weight = input.nextFloat();
        System.out.println("Enter player jersey number:");
        int jerseyNumber = input.nextInt();


        final double POUND = 0.45359237;
        final int METER = 100;

        double weightInKg = weight * POUND;
        int wholeWeight = (int) weightInKg;
        float heightInCm = height * METER;

        boolean eligibility = (age >= 18 && age <= 35 && wholeWeight < 90);

        String category;
        if (age < 20) {
            category = "Rising Star";
        } else if (age <= 30) {
            category = "Prime Player";
        } else {
            category = "Veteran";
        }

        System.out.println("Enter the player jersey number:");
        int coachJersey = input.nextInt();


        String position;
        switch (coachJersey) {
            case 1: position = "Goalkeeper"; System.out.println("Player position:"+ position);break;
            case 2, 5: position = "Defender";System.out.println("Player position:"+ position);break;
            case 6, 8: position = "Midfielder";System.out.println("Player position:"+ position); break;
            case 7, 11: position = "Winger";System.out.println("Player position:"+ position);break;
            case 9: position = "Striker";System.out.println("Player position:"+ position); break;
            case 10: position = "Playmaker";System.out.println("Player position:"+ position); break;
            default: position = "Player position not known";
        }

        String lineupDecision;
        if (category.equals("Prime Player")) {
            if (wholeWeight < 80) {
                lineupDecision = "Starting lineup";
            } else {
                lineupDecision = "Bench";
            }
        } else {
            lineupDecision = "Bench";
        }
        // Assuming these are the numbers that show that a player is an attacker.

        boolean AttackerStatus = (jerseyNumber == 7 || jerseyNumber == 9
                || jerseyNumber == 10 || jerseyNumber == 11);


        String finalStatus = eligibility ? "Play" : "Rest";


        System.out.println("Player: " + name);
        System.out.println("Age: " + age + " (" + category + ")");
        System.out.println("Height: " + (int)heightInCm + " cm");
        System.out.println("Weight: " + wholeWeight + " kg");
        System.out.println("Jersey: " + jerseyNumber);
        System.out.println("Position: " + position);
        System.out.println("Attacker jersey: " + (AttackerStatus ? "Yes" : "No"));
        System.out.println("Eligibility: " + (eligibility ? "Eligible" : "Not Eligible"));
        System.out.println("Lineup Decision: " + lineupDecision);
        System.out.println("Final Status: " + finalStatus);

        input.close();






    }
}
