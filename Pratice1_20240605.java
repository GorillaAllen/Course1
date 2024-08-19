

public class Pratice1_20240605 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//99乘法表-巢狀迴圈
		System.out.println("[ 99乘法表 ]");
				for(int i=1;i<10;i++) {
					for(int j=1;j<10;j++)
						// 使用printf格式化輸出，每個值佔4個字元，右對齊
		                System.out.printf("%d * %d = %2d   ", j, i, i * j);
					// 換行
		            System.out.println();
				}
	}

}
