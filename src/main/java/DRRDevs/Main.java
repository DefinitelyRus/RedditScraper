package DRRDevs;

/*
	Create a program that simulates a game of Rock-Paper-Scissors between two players. The game should have the following features:
	- The program should prompt the user to enter the name of the player.
	- The program should allow the player to input their choice of Rock, Paper, or Scissors.
	- The program should output the winner of the game, or a tie if both players choose the same option.

	Here are the steps to complete the challenge:
	- Ask the user to enter the names of the two players.
	- Prompt the player to enter their choice of Rock, Paper, or Scissors.
	- Compare the choices of the two players (AI and user) and determine the winner or a tie.

	To compare the choices, you can use the following approach:
	- If both players choose the same option, it's a tie.
	- If player 1 chooses Rock and player 2 chooses Scissors, player 1 wins.
	  Similarly, if player 1 chooses Scissors and player 2 chooses Paper, or if player 1 chooses Paper and player 2 chooses Rock, player 1 wins.
	- Otherwise, player 2 wins.
 */

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Do you want to start? ");
		String prompt = input.next();
<<<<<<< HEAD
		// if start, ask for name. else do nothing
		if (prompt.equalsIgnoreCase("yes")) {
			System.out.print("Enter name: ");
			String player1Name = input.next();
			System.out.print("Enter name: ");
			String player2Name = input.next();
			System.out.println(player1Name);
			System.out.println(player2Name);
		} else {
			System.out.println("Do nothing");
		}

=======
>>>>>>> dc434db5745084750e006e2b6ccfb09f62bfd32f
	}
}