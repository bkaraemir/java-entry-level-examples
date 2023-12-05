import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Choose your move: (1) Rock, (2) Paper, (3) Scissors, or (0) Quit");
            int playerMove = scanner.nextInt();

            if (playerMove == 0) {
                System.out.println("Thanks for playing. Goodbye!");
                break;
            }

            if (playerMove < 1 || playerMove > 3) {
                System.out.println("Invalid move. Please choose a valid move.");
                continue;
            }

            int computerMove = random.nextInt(3) + 1; // 1 for Rock, 2 for Paper, 3 for Scissors

            System.out.println("Computer's move: " + getMoveName(computerMove));

            determineWinner(playerMove, computerMove);
        }

        scanner.close();
    }

    private static void determineWinner(int playerMove, int computerMove) {
        if (playerMove == computerMove) {
            System.out.println("It's a tie!");
        } else if ((playerMove == 1 && computerMove == 3) ||
                   (playerMove == 2 && computerMove == 1) ||
                   (playerMove == 3 && computerMove == 2)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }

    private static String getMoveName(int move) {
        switch (move) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Unknown";
        }
    }
}
