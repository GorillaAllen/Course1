import java.util.*;
public class SubSetEx{
	public static void main(String[] args){
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int i=1; i<10; i+=2)
			ts.add(i);
		TreeSet<Integer> subSet = 
			(TreeSet<Integer>)ts.subSet(1, true, 3, true);		
		System.out.println(ts + " " + subSet);		
		ts.add(2);
		System.out.println(ts + " " + subSet);
		//subSet.add(4);
	}
}