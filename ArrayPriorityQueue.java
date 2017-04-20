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
    public ArrayList _data = new ArrayList();
    
    //constructor
    public ArrayPriorityQueue(){
	_data = new ArrayList<Integer>();
    }

    public void add( int x){ //enqueue
	int i;
	for(i = 0; i < _data.size(); i++){
	    if( (int)(_data.get(i)) <= x)
		break;
	}
	_data.add(i,x);
    }
    
    public int removeMin() 
    {
	return (int)( _data.remove(_data.size()-1));
    }//O(1)
    
    public Integer peekMin() 
    {
	return (int)(_data.get(_data.size()-1));
    }//O(1)

    public boolean isEmpty() 
    {
	return (_data.size() == 0);
    }//O(1)
 
    public static void main( String[] args){
	ArrayPriorityQueue bob = new ArrayPriorityQueue();
	bob.add(1);
	bob.add(2);
	bob.add(3);
	System.out.println(bob.removeMin());
	System.out.println(bob.removeMin());
	System.out.println(bob.removeMin());
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
	System.out.println(bob.removeMin());
    }
}
