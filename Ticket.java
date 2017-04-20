

public class Ticket {

    //INSTANCE VARIABLES
    private int ID;
    private String _user;
    private String _description;
    private int _status;
    private int _priority; //0 is highest priority

    //CONSTRUCTOR
    public Ticket (String name, String problem, int VIP) {
	_user = name;
	_description = problem;
	_priority = VIP;
	//ID = ?
	//_status = ?
    }
    
}
