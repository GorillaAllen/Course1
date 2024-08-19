
public class SampleRandom {
	double i;
	
	
	void getRandom()
	{
		
		i=Math.random();
		System.out.println("亂數"+ i);
	}
	
	void random_multi10()
	{
		
		i=i*10;
	}
	
	void random_multi1to99()
	{
		do {	
		i = Math.random();
		i=i*100;
		}
		while((int)i == 0);
		System.out.println("亂數"+ (int) i);
	}
	
	SampleRandom()
	{
		
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SampleRandom a = new SampleRandom();
		a.getRandom();
//		a.random_multi10();
		a.random_multi1to99();
		
//		System.out.println("***** a.i 的值為 *****  "+a.i);
		
		
		
	}

}
