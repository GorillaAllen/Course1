public class Loop_Continue{
	public static void main(String[] args){

		for(int i=1; i<=7; i++){
			if( i%2 != 1 ){
				System.out.println("休息日");
				continue;
			}
			System.out.println("健身日");
		}
	}
}