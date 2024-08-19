public class Loop_Break{
	public static void main(String[] args){
		
		for(int i=1; i<=8; i++){
			System.out.println("上課");
			if(i == 5){
				System.out.println("受傷");
				break;
			}
		}
	}
}