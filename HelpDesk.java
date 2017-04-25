/*Team ZeDoktor: Herman Lin, Jesse Sit, Noah Tang
  APCS2 - pd3
  LAB03 -- RUVIP?
  2017-4-21*/

import java.util.Scanner;
import java.util.ArrayList;

public class HelpDesk {

    //INSTANCE VARIABLES
    private static String nombre;
    private static String problema;
    private static int importante;
    private static int identificacion;
    
    public static void main (String[] args) {
	ArrayPriorityQueue helpQueue = new ArrayPriorityQueue();
	Ticket customer;
	int inputInt = -1;	
	String inputStr;
	Scanner scanner = new Scanner(System.in);
   
	System.out.println("\nHeLlO aNd WeLcOmE tO tHe HeLp DeSk!");
	System.out.println("Please state your name: ");
	inputStr = nombre = scanner.nextLine();
	System.out.println("Please state your problem: ");
	inputStr = problema = scanner.nextLine();
	System.out.println("Please state your priority level: ");
	importante = -1;
	while (importante == -1) {
	    inputInt = importante = scanner.nextInt();	    	    
	    if (inputInt < 0) {
		System.out.println("Please enter a priority >= 0");
		importante = -1;
	    }
	}
	System.out.println("Processing ticket...");
        identificacion = (int)(Math.random() * 100);
	customer = new Ticket (nombre, problema, importante, identificacion);
	helpQueue.add(customer);
	System.out.println("You have been added to the queue");

	System.out.println("Diagnosing problem...");

	int sol = -1;
	while (sol == -1) {
	    if (customer.getProb().equals("frozen")){
		System.out.println("Try rebooting your computer.");
	    }
	    else if (customer.getProb().equals("no internet connection")){
		System.out.println("Try restarting your modem.");
	    }
	    else {
		System.out.println("Sorry, your problem is unrecognized. Suggesting solutions...");
		int rand = (int)(Math.random() * 3);
		if (rand == 0)
		    System.out.println("Refresh screen");
		else if (rand == 1)
		    System.out.println("Force quit all programs");
		else if (rand == 2){
		    System.out.println("Consult a different HelpDesk");
		    break;
		}
	    }
	    inputStr = "";
	    System.out.println("Was your issue resolved? yes/no\n");
	    inputStr = scanner.nextLine();
	    if (inputStr.equals("yes")) {       
		System.out.println("Thank you for consulting ZeDoktor");
		helpQueue.removeMin();
		sol = 1;
	    }
	    else if (inputStr.equals("no")) {
		System.out.println("Dianosing problem...");
		sol = -1;
	    }	      
	}
    }
}
