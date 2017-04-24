/* Noah Tang
   APCS Pd3
   HW32
   04-19-17
*/
import java.util.ArrayList;

//Array Priority Queue with integers
//higher int -> lower priority
public class ArrayPriorityQueue{
    //container
    public ArrayList<Ticket> _data;
    
    //constructor
    public ArrayPriorityQueue(){
	_data = new ArrayList<Ticket>();
    }

    public void add( Ticket x){ //enqueue
	int i;
	for(i = 0; i < _data.size(); i++){
	    if( ( _data.get(i)).compareTo(x) <= 0 )
		break;
	}
	_data.add(i,x);
    }
    
    public Ticket removeMin() 
    {
	return  (Ticket)(_data.remove(_data.size()-1));
    }//O(1)
    
    public Ticket peekMin() 
    {
	return _data.get(_data.size()-1);
    }//O(1)

    public boolean isEmpty() 
    {
	return (_data.size() == 0);
    }//O(1)

    public static void main( String[] args){
	/*ArrayPriorityQueue bob = new ArrayPriorityQueue();
	bob.add( new Ticket("","",1 ));
	bob.add( new Ticket("","",2 ));
	bob.add( new Ticket("","",3 ));
	System.out.println(bob.removeMin());
	System.out.println(bob.removeMin());
	System.out.println(bob.removeMin());
	bob.add( new Ticket("","",3 ));
	bob.add( new Ticket("","",2 ));
	bob.add( new Ticket("","",1 ));
	System.out.println(bob.removeMin());
	System.out.println(bob.removeMin());
	System.out.println(bob.removeMin());
	bob.add( new Ticket("","",2 ));
	bob.add( new Ticket("","",5 ));
	bob.add( new Ticket("","",2 ));
	System.out.println(bob.removeMin());
	System.out.println(bob.removeMin());
	System.out.println(bob.removeMin());
	*/
	/*
	bob.add(2);
	bob.add(3);
	bob.add(2);
	bob.add(3);
	bob.add(1);
	System.out.println(bob.removeMin());
	System.out.println(bob.removeMin());
	System.out.println(bob.removeMin());
	bob.add(2);
	bob.add(5);
	bob.add(2);
	System.out.println(bob.removeMin());
	System.out.println(bob.removeMin());
	System.out.println(bob.removeMin());*/
    }
}
