import java.util.*;

public class Main {
    private static double wins = 0;
    private static double gamesPlayed = 0;
    private static double averageWins;

    public static void main(String[] args) {
        for (int x = 0; x < 10000; x++) {
            int llama1 = ((int) (Math.random() * 3)) + 1;
            int llama2;
            int car;

            do {
                llama2 = ((int) (Math.random() * 3)) + 1;
            }
            while (llama2 == llama1);

            do {
                car = ((int) (Math.random() * 3)) + 1;
            }
            while (car == llama1 || car == llama2);

            System.out.print("Which door would you like? ");
            int userChoice = 1;
            System.out.println(userChoice);

            if (userChoice == llama1) {
                int change = userChoice;
                System.out.println("A llama is behind door " + llama2);
                System.out.println("You switch doors");
                do {
                    userChoice = ((int) (Math.random() * 3)) + 1;
                }
                while (userChoice == llama2 || userChoice == change);

            }

            else if (userChoice == llama2) {
                int change = userChoice;
                System.out.println("A llama is behind door " + llama1);
                System.out.println("You switch doors");
                do {
                    userChoice = ((int) (Math.random() * 3)) + 1;
                }
                while (userChoice == llama1 || userChoice == change);

            }

            else if (userChoice == car) {
                int change = userChoice;
                System.out.println("A llama is behind door " + llama2);
                System.out.println("You switch doors");
                do {
                    userChoice = ((int) (Math.random() * 3)) + 1;
                }
                while (userChoice == llama1 || userChoice == change);


            }

            if (userChoice == car) {
                System.out.println("A llama is behind door " + llama1 + " and door " + llama2);
                System.out.println("The car is behind door " + car);
                System.out.println("You Win");

                wins++;
                gamesPlayed++;
                averageWins = (wins / gamesPlayed) * 100;
                System.out.println("Your win percentage is " + averageWins + "%\n"); }

            else {
                System.out.println("A llama is behind door " + llama1 + " and door " + llama2);
                System.out.println("The car is behind door " + car);
                System.out.println("You Lose");

                gamesPlayed++;
                averageWins = (wins / gamesPlayed) * 100;
                System.out.println("Your win percentage is " + averageWins + "%\n");
            }
        }
    }
}
