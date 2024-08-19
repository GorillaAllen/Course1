package InnerClassLambda;
public class LambdaThread3 {
	public static void main(String[] args) {
		// MyThread obR = new MyThread();
		Thread t3 = new Thread(() -> {

			for (int x = 1; x <= 5; x++) {
				System.out.println(Thread.currentThread().getName() + "; 執行次數為" + x);
			}
		});

		Thread t4 = new Thread(() -> {

			for (int x = 1; x <= 5; x++) {
				System.out.println(Thread.currentThread().getName() + "; 執行次數為" + x);
			}
		});
		t3.start();
		t4.start();
	}
}
