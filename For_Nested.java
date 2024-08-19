public class For_Nested{
	public static void main(String[] args){
		for(int x=1; x<10; x++){
			for(int y=1; y<10; y++)	
				System.out.print("  ("+x+"*"+y+")"+"="+ x*y);

		System.out.println();		
		}
	}
}