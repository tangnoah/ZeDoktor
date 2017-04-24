

public class Ticket implements Comparable {

    //INSTANCE VARIABLES
    private int ID;
    private String _user;
    private String _description;
    private boolean _status; 
    private int _priority; //0 is highest priority

    //CONSTRUCTOR
    public Ticket (String name, String problem, int VIP, int id) {
	_user = name;
	_description = problem;
	_priority = VIP;
	_status = false;
	ID = id;
    }
    
    //GET METHODS
    public int getID() {return ID;}
    public String getName() {return _user;}
    public String getProb() {return _description;}
    public boolean getStatus() {return _status;}
    public int getPriority() {return _priority;};
    
    //SET METHODS
    public void setStatus(boolean isSolved) {_status = isSolved;}

    //compareTo for priority
    public int compareTo(Object o) {
	Ticket t = (Ticket) o ;
	if (this.getPriority() > t.getPriority())
	    return 1;
	else if (this.getPriority() == t.getPriority())
	    return 0;
	else 
	    return -1;
    }

    public String toString() {
	return ID + "";
    }
}
