import javax.swing.JOptionPane;

public class ConfirmDialog1 {

	public static void main(String[] args) {

// method 1
		Object[] options = { "Yes, please", "No way!" };
		int n = JOptionPane.showOptionDialog(null, "Would you like green eggs and ham?", "A Silly Question",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, // do not use a custom Icon
				options, // the titles of buttons
				options[0]); // default button title
		System.out.println(n);

//// method 2		

//			int input = JOptionPane.showConfirmDialog(null, "Would you like green eggs and ham?", "An Inane Question",
//					JOptionPane.YES_NO_CANCEL_OPTION);
//			System.out.println(input); 

		// showConfirmDialog
//		int input = JOptionPane.showConfirmDialog(null, "要吃午餐嗎?");
//		// JOptionPane.sh
//		// 0=yes, 1=no, 2=cancel
//		System.out.println(input);

	}

}