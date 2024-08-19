//(1) (四則運算)= +-*/  
//    同一時間只能擇一計算(RadioButton)
import javax.swing.*;
import java.awt.event.*;

public class RadioButtonCalculator implements ActionListener {
	JTextField tf1, tf2, tf3;
	JButton b1, b2, b3, b4, calculate;
	JRadioButton plus, minus, multiply, divide;

	RadioButtonCalculator() {
		JFrame f = new JFrame();
		tf1 = new JTextField();
		tf1.setBounds(50, 50, 150, 40);
		tf2 = new JTextField();
		tf2.setBounds(50, 100, 150, 40);
		tf3 = new JTextField();
		tf3.setBounds(350, 50, 150, 20);
		tf3.setEditable(false);
		
		plus = new JRadioButton("PLUS");
		plus.setBounds(230, 30, 70, 50);
		minus = new JRadioButton("MINUS");
		minus.setBounds(230, 70, 70, 50);
		multiply = new JRadioButton("MULTIPLY");
		multiply.setBounds(230, 110, 90, 50);
		divide = new JRadioButton("DEVIDE");
		divide.setBounds(230, 150, 70, 50);
		calculate = new JButton("calculate");
		calculate.setBounds(230, 200, 90, 50);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(plus);
		bg.add(minus);
		bg.add(multiply);
		bg.add(divide);
		
		calculate.addActionListener(this);
//		plus.addActionListener(this);
//		minus.addActionListener(this);
//		multiply.addActionListener(this);
//		divide.addActionListener(this);

		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(plus);
		f.add(minus);
		f.add(multiply);
		f.add(divide);
		f.add(calculate);
		f.setSize(550, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String s1 = tf1.getText();
		String s2 = tf2.getText();
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		//int remainder = 0;
		double c = 0;
		
		if (plus.isSelected()) {
			c = a + b;
		} else if (minus.isSelected()) {
			c = a - b;
		} else if (multiply.isSelected()) {
			c = a * b;
		}else if (divide.isSelected()) {
			c = (double) a / b;
		}
		//String result = String.valueOf(c);
		tf3.setText(String.valueOf(c));
		
//		if (e.getSource() == plus) {
//			c = a + b;
//		} else if (e.getSource() == minus) {
//			c = a - b;
//		} else if (e.getSource() == multiply) {
//			c = a * b;
//		} else if (e.getSource() == divide) {
//			c = a / b;
//			remainder = a % b;
//		}
//		String result = String.valueOf(c);
//
//		if (remainder == 0) {
//			tf3.setText(result);
//		} else {
//			String string_remainder = String.valueOf(remainder);
//
//			tf3.setText("商:" + result + "  餘數:" + string_remainder);
//		}
	}

	public static void main(String[] args) {
		new RadioButtonCalculator();
	}
}