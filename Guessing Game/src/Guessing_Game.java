import java.util.Scanner;

public class Guessing_Game {

	public Guessing_Game() {
		boolean stillPlaying = true;
		
		while (stillPlaying == true) {
			
			int randomNum = (int)(Math.random() * 51);
			//stores random number between 1-50
			//System.out.println("This is a random number: " + randomNum);
			System.out.println("Enter a number between 1 and 50");
			Scanner scanner = new Scanner(System.in);
			//used to read input from console
			int guess = -1;
			int count = 1;
			//variable t hold number of guesses
			while (guess != randomNum) {
				String input = scanner.nextLine();
				//input
				System.out.println("You typed: " + input);
				guess = Integer.parseInt(input);
				//converting string to integer
				//System.out.println(guess);
				if (guess < randomNum) {
					System.out.println("Guess is less than random number");
					System.out.println("Guess another number");
					//checks if guess is less than random number
					count ++;
					//adds one to count 
				}
				else if (guess > randomNum) {
					System.out.println("Guess is greater than random number");
					System.out.println("Guess another number");
					//checks if guess is greater than random number
					count ++;
					//adds one to count
				}
				else {
					System.out.println("The guess is correct! Congratulations");
					System.out.println("Number of guesses: " + count);
					//checks if guess is the random number
				}
			}
			System.out.println("Would you like to play again?");
			System.out.println("Enter yes or no");
			String yesno = scanner.nextLine();
			if (yesno.equals("yes") || yesno.equals("y")) {
				stillPlaying = true;
				//starts another game
			}
			else {
				stillPlaying = false;
				System.out.println("Thank you for playing!");
				//ends game
			}
		}
	}

	public static void main(String[] args) {
		new Guessing_Game();
	}

}
