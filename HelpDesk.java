/*Team ZeDoktor: Herman Lin, Jesse Sit, Noah Tang
  APCS2 - pd3
  LAB03 -- RUVIP?
  2017-4-21*/

import java.util.Scanner;

public class HelpDesk {

    //INSTANCE VARIABLES
    private static String nombre;
    private static String problema;
    private static int importante;
    private static int[] uniqueIDs;
    
    public static void main (String[] args) {
	Scanner scanner = new Scanner(System.in);
	int inputInt;
	int inputID;
	String inputStr;
	
	System.out.println("\nHeLlO aNd WeLcOmE tO tHe HeLp DeSk!\n\n");
	System.out.println("Please choose an option:\n");
	System.out.print("1:\tI have a Ticket ID\n");
	System.out.print("2:\tI have a problem\n");
	System.out.print("3:\tProblem solved\n");
	inputInt = scanner.nextInt();

	if (inputInt == 1) {
	    System.out.println("Please enter your Ticket ID number: ");
	    inputID = scanner.nextInt();
	}
	else if (inputInt == 2) {
	    //Store name
	    System.out.print("Please state your name: ");
	    inputStr = nombre = scanner.nextLine();
	    //Store problem
	    System.out.print("Please state your problem:\n");
	    inputStr = problema = scanner.nextLine();

	    //Check for priority here
	    
	    System.out.println("Please wait for your ticket to process...");
	    //Create and print new ID here
	}
	else if (inputInt == 3) {
	    System.exit(0);
	}
    }    
}
