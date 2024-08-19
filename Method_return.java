public class Method_return {

	static float myMethod3(int x, float y) {
		x *= 10;
		y += 10;
		return y;
		// return i,j;
	}
	
	static float myMethod4(int x, float y) {
		x -= y;
		return x+y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int z = 50;

		float j = myMethod3(i, z) + myMethod4(i, z);
		System.out.println("The return value: " + j);

	}
}
