package InnerClassLambda;
class Thread_ex implements Runnable {
	public void run() {

		for (int x = 1; x <= 5; x++) {
			System.out.println(Thread.currentThread().getName() + "; 執行次數為" + x);
		}
	}
}

public class LambdaThread1 {
	public static void main(String[] args) {

		Thread_ex thread_Run = new Thread_ex();

		Thread t1 = new Thread(thread_Run);

		Thread_ex thread_Run2 = new Thread_ex();

		Thread t2 = new Thread(thread_Run2);

		t1.start();
		t2.start();
	}
}
