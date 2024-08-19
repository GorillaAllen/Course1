public class ThrowTest { // 主程式
	public static void main(String[] args) { // 例外處理程式敘述
		try { // 取得參數字串
			int value = Integer.parseInt(args[0]);
			if (value == 0)
				// 丟出ArithmeticException例外
				throw new ArithmeticException("值為0");
		}

		catch (ArithmeticException e) { // 處理ArithmeticException例外
			System.out.println("例外說明: " + e.getMessage());
			System.out.print("例外原因: ");
			e.printStackTrace();
		} finally {
			System.out.println("錯誤處理結束");
		}

		System.out.println("main");
	}
}
