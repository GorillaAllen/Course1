import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.Font;
//溫度轉換,BMI計算, 飲料點單
public class All_In_One extends JFrame {
	private JTextField textField_2;
	private JTextField textField_3;
	public All_In_One() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 521, 90);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("`C");
		lblNewLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblNewLabel.setBounds(145, 26, 25, 33);
		panel.add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setText("輸入攝氏溫度");
		textField_2.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		textField_2.setBounds(10, 26, 125, 35);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("=>");
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(193, 26, 34, 25);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("'F");
		lblNewLabel_4.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(364, 28, 34, 29);
		panel.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		textField_3.setBounds(223, 26, 125, 35);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("轉換");
		btnNewButton.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		btnNewButton.setBounds(402, 26, 87, 35);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 91, 259, 292);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(34, 5, 100, 30);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(34, 37, 100, 30);
		panel_1.add(lblNewLabel_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(262, 91, 259, 292);
		getContentPane().add(panel_2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame;
		JTextField textField;
		JTextField textField_1;
		JButton btnNewButton_4,btnNewButton_3;
		JLabel lblNewLabel_2, lblNewLabel_3;
	}
}
