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
    private static ArrayList<Integer> uniqueIDs;
    

    public static void main (String[] args) {
	ArrayPriorityQueue helpQueue = new ArrayPriorityQueue();
	Ticket customer;
	uniqueIDs = new ArrayList<Integer>(10);
	Scanner scanner = new Scanner(System.in);
	int inputInt = -1;
	int inputID = -1;
	String inputStr;
	String message = "";
	
	while (true){
	    System.out.println("\n\n\n\n");
	    
	    //Startup and choice selection
	    System.out.println("\nHeLlO aNd WeLcOmE tO tHe HeLp DeSk!");
	    System.out.println( message );
	    System.out.println("Please choose an option:\n");
	    System.out.print("1:\tI have a Ticket ID\n");
	    System.out.print("2:\tI have a problem\n");
	    
	    inputStr =  scanner.nextLine();
	    try {
		inputInt = Integer.parseInt( inputStr );
	    }
	    catch (Exception e){
		message = "Selection not understood; please enter a number.";
		//inputInt = -1;
	    }
	    if( inputInt != -1 && inputInt != 1 
		&& inputInt != 2){
		message = "Please select 1 or 2";
		//inputInt = -1;
	    }		

	    //if input == 1, check for their Ticket ID
	    if (inputInt == 1) {
		System.out.println("Please enter your Ticket ID number: ");
		while( inputID == -1){
		    inputStr =  scanner.nextLine();
		    try {
			inputID = Integer.parseInt( inputStr );
		    }
		    catch (Exception e){
			inputID = -1;
		    }
		}

		if (helpQueue.isEmpty())
		    System.out.println("There are no Tickets being processed. Please create a new Ticket");	       
		else if (uniqueIDs.indexOf(inputID) == -1)
		    System.out.println("Your Ticket ID has not been registered in the queue");
		else {
		    System.out.println("Loading Ticket...");
		    if (inputID == helpQueue.peekMin().getID()) {
			int rand = (int)(Math.random() * 4); //random chance that the issue is resolved
			if (rand == 0) {			    
			    System.out.println("Your issue has been resolved. Thank you for coming to ZeDoktor");
			    uniqueIDs.remove(uniqueIDs.indexOf(inputID));
			    helpQueue.removeMin();			    
			}
			else {
			    System.out.println("Your issue is being processed. Please come back again");
			}
		    }
		    else {
			System.out.println("Sorry, we are busy with another customer. Please try again later.");
		    }
		}
		
		//reset choice selection
		inputInt = inputID = -1;
	    }
	
	    //if input == 2, create new Ticket
	    else if (inputInt == 2) {
		//Store name
		System.out.print("Please state your name: ");
		inputStr = nombre = scanner.nextLine();
		//Store problem
		System.out.print("Please state your problem:\n");
		inputStr = problema = scanner.nextLine();

		//Check for priority here
		System.out.println("Please state your priority level");
		int priority = -1;
		while( priority == -1){
		    inputStr =  scanner.nextLine();
		    try {
			priority = Integer.parseInt( inputStr );
		    }
		    catch (Exception e){
			priority = -1;
		    }
		}
	    
		System.out.println("Processing ticket and generating ID...");
		//Create and print new ID here
		int ID = -1;
		while ( ID == -1){
		    ID = (int)(Math.random() * 100);
		    for( Integer i: uniqueIDs){
			if (ID == i){
			    ID = -1;
			    break;
			}
		    }
		}
		uniqueIDs.add(ID);
		customer = new Ticket(nombre, problema, priority, ID);
		System.out.println("Done! Your ticket ID is " + ID);
		helpQueue.add(customer);
		
		//reset choice selection
		inputInt = inputID = -1;		
	    }
	}    
    }
}
