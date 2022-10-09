import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        String player1Move;
        String player2Move;
        int accepted;
        int accepted2;
        String playagain;
        do {
            do {
                System.out.println("Player1, enter your move");
                Scanner in = new Scanner(System.in);
                player1Move = in.nextLine();
                if (player1Move.equalsIgnoreCase("R")) {
                    accepted = 1;
                } else if (player1Move.equalsIgnoreCase("P")) {
                    accepted = 1;
                } else if (player1Move.equalsIgnoreCase("S")) {
                    accepted = 1;
                } else {
                    accepted = 0;
                    System.out.println("Invalid letter. Enter valid one.");
                }
            } while (accepted != 1);
            do {
                System.out.println("Player2, enter your move");
                Scanner in = new Scanner(System.in);
                player2Move = in.nextLine();
                if (player2Move.equalsIgnoreCase("R")) {
                    accepted2 = 1;
                } else if (player2Move.equalsIgnoreCase("P")) {
                    accepted2 = 1;
                } else if (player2Move.equalsIgnoreCase("S")) {
                    accepted2 = 1;
                } else {
                    accepted2 = 0;
                    System.out.println("Invalid letter. Enter valid one.");
                }
            } while (accepted2 != 1);
            if (player1Move.equalsIgnoreCase("R")) {
                if (player2Move.equalsIgnoreCase("R")) {
                    System.out.print("Rock vs Rock! It's a tie!");
                } else if (player2Move.equalsIgnoreCase("S")) {
                    System.out.print("Rock crushes Scissors! Player 1 wins!");
                } else {
                    System.out.print("Paper covers Rock! Player 2 wins!");
                }
            } else if (player1Move.equalsIgnoreCase("S")) {
                if (player2Move.equalsIgnoreCase("R")) {
                    System.out.print("Rock crushes Scissors! Player 2 wins!");
                } else if (player2Move.equalsIgnoreCase("S")) {
                    System.out.print("Scissors vs Scissors! It's a tie!");
                } else {
                    System.out.print("Scissors cuts Paper! Player 1 wins!");
                }
            } else {
                if (player2Move.equalsIgnoreCase("R")) {
                    System.out.print("Paper covers Rock! Player 1 wins!");
                } else if (player2Move.equalsIgnoreCase("S")) {
                    System.out.print("Scissors cuts Paper! Player 2 wins!");
                } else {
                    System.out.print("Paper vs Paper! It's a tie!");
                }
            }
            System.out.println(" Play Again? Y/N");
            Scanner in = new Scanner(System.in);
            playagain = in.nextLine();
        }while(playagain.equalsIgnoreCase("y"));
    }
}