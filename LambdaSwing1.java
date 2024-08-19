package InnerClassLambda;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class LambdaJFrame extends JFrame {
	private JPanel contentPane;

	public LambdaJFrame() {

		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton button = new JButton("Lambda測試按鈕");

		// 註冊button事件傾聽者
		// 並實作ActionListener傾聽者物件的actionPerformed()方法
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 顯示對話方塊
				JOptionPane.showMessageDialog(null, "showMessageDialog");
			}
		});

		button.setBounds(50, 40, 150, 25);
		contentPane.add(button);
		setTitle("LambdaJFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 270, 150);

		setVisible(true);
	}
}

public class LambdaSwing1 {
	public static void main(String[] args) {
		LambdaJFrame f = new LambdaJFrame();
	}
}
