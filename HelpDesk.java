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
    
    public static void clear(){
	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }



    public static void main (String[] args) {
	Scanner scanner = new Scanner(System.in);
	int inputInt = -1;
	int inputID = -1;
	String inputStr;
	String message = "";
	while (inputInt == -1){
	    clear();
	    System.out.println("\nHeLlO aNd WeLcOmE tO tHe HeLp DeSk!\n\n");
	    System.out.println( message );
	    System.out.println("Please choose an option:\n");
	    System.out.print("1:\tI have a Ticket ID\n");
	    System.out.print("2:\tI have a problem\n");
	    System.out.print("3:\tProblem solved\n");
	    
	    inputStr =  scanner.nextLine();
	    try {
		inputInt = Integer.parseInt( inputStr );
	    }
	    catch (Exception e){
		message = "Selection not understood; please enter a number.";
		inputInt = -1;
	    }
	    if( inputInt != -1 && inputInt != 1 
		&& inputInt != 2 && inputInt != 3){
		message = "Please select 1, 2, or 3.";
		inputInt = -1;}
		
	}

	if (inputInt == 1) {
	    while( inputID == -1){
		System.out.println("Please enter your Ticket ID number: ");
		inputStr =  scanner.nextLine();
		try {
		    inputID = Integer.parseInt( inputStr );
		}
		catch (Exception e){
		    inputID = -1;
		}
	    }
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
