package InnerClassLambda;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class LambdaJFrame2 extends JFrame {
	private JPanel contentPane;

	public LambdaJFrame2() {

		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton button = new JButton("Lambda測試按鈕");

//		button.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				// 顯示對話方塊
//				JOptionPane.showMessageDialog(null, "showMessageDialog");
//			}
//		});
//		

		// ActionListener物件的actionPerformed()方法
		button.addActionListener((e) -> JOptionPane.showMessageDialog(null, "showMessageDialog"));

		button.setBounds(50, 40, 150, 25);
		contentPane.add(button);
		setTitle("LambdaJFrame2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 270, 150);
		setVisible(true);
	}
}

public class LambdaSwing2 {
	public static void main(String[] args) {
		LambdaJFrame2 f = new LambdaJFrame2();
	}
}
