
public class Oww {

	public static void main(String[] args) {
		char a = 10000;
		
		while(a<15000) {
			System.out.print(a);
			a++;
			if( a % 100 ==0 ){
				System.out.println();
			}
		}
	}

}
