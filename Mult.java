package thread;
class Multi2 extends Thread {

	public void run() {
		// String str = getName();

		// System.out.println(str + "thread is running...");

		// System.out.println(str + "thread is running...");

		// method 1
		String str = Thread.currentThread().getName();

		// method 2
		// String str = getName();

		System.out.println(str + "Multi2");

	}
}

class Mult extends Thread {
//	static String str1;

	public void run() {
		// String str = getName();
		// System.out.println(str);

		// System.out.println(str + "thread is running...");

		// System.out.println(str + "thread is running...");

		// method 1
		String str = Thread.currentThread().getName();

		// method 2
		// String str = getName();

		System.out.println(str + "Mult");

	}

	public static void main(String args[]) {
		Multi2 t3 = new Multi2();
		t3.start();

		Mult t1 = new Mult();
		t1.start();
		Mult t2 = new Mult();
		t2.start();

		// String str = Thread.getName();

		String str1 = Thread.currentThread().getName();
		System.out.println("now thread is " + str1);

		// System.out.println("main is running...");

	}
}