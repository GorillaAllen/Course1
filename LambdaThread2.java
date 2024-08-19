package InnerClassLambda;
public class LambdaThread2 {
	public static void main(String[] args) {

		Thread t2 = new Thread(new Runnable() {

			public void run() {

				for (int x = 1; x <= 5; x++) {
					System.out.println(Thread.currentThread().getName() + "; 執行次數為" + x);
				}
			}
		});

		Thread t3 = new Thread(new Runnable() {

			public void run() {

				for (int x = 1; x <= 5; x++) {
					System.out.println(Thread.currentThread().getName() + "; 執行次數為" + x);
				}
			}
		});

		t2.start();
		t3.start();
	}
}
