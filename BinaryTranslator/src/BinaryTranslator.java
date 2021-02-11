import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BinaryTranslator {

	private Object[] array;


	public BinaryTranslator() {
		System.out.println("Please enter \"file\" to enter a file and \"input\" to use the console");
		Scanner scanner = new Scanner(System.in);
		//console scanner
		String input = scanner.nextLine();
		//read input
		String numberInput = "";
		//number from file or console
		if (input.equals("file")) {
			//input from file
			try {
				System.out.println("Enter your file name");
				input = scanner.nextLine();
				Scanner fileScanner = new Scanner(new File(input));
				//file scanner
				numberInput = fileScanner.nextLine();
			} catch (IOException ex) {
				System.out.println("File not found");
				scanner.close();
				System.exit(1);
			}
		}
		//console
		else {
			System.out.println("Enter number");
			numberInput = scanner.nextLine();
		}
		System.out.println("If you are translating from decimal to binary, enter \"dtb\".");
		System.out.println("If you are translating from binary to decimal, enter \"btd\".");
		input = scanner.nextLine();
		if (input.equals("dtb")) { //decimal to binary
			int number = Integer.parseInt(numberInput);
			int[] remainders = new int[50];
			int rindex = 0;
			while (number > 0) {//loop until number = 0
				remainders[rindex] = number % 2; //remainder stored in array
				number = number / 2; //quotient
				rindex++;
			}
			for (int i = rindex-1; i >= 0; i--) {
				System.out.print(remainders[i]);	
				
			}	
		}
				
		else { //binary to decimal
			int answer = 0; 
			for (int i=0; i<numberInput.length();i++) { //runs through all the digits 
				if(numberInput.charAt(i)=='1') {
					answer += Math.pow(2, numberInput.length()-1-i);
				}
			}
			System.out.println(answer);
			
		}
		scanner.close();

	}

	
	public static void main(String[] args) {
		new BinaryTranslator();

	}

}
