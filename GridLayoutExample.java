
// import statements  
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class XOButton extends JButton{
	public XOButton(String string) {
		// TODO Auto-generated constructor stub
	}
	int score;
}

public class GridLayoutExample {

	JFrame frameObj;

// constructor  
	GridLayoutExample() {
		frameObj = new JFrame();

// creating 9 buttons  
		XOButton btn1 = new XOButton("1");
		XOButton btn2 = new XOButton("2");
		XOButton btn3 = new XOButton("3");
		XOButton btn4 = new XOButton("4");
		XOButton btn5 = new XOButton("5");
		XOButton btn6 = new XOButton("6");
		XOButton btn7 = new XOButton("7");
		XOButton btn8 = new XOButton("8");
		XOButton btn9 = new XOButton("9");

// adding buttons to the frame  
// since, we are using the parameterless constructor, therefore;   
// the number of columns is equal to the number of buttons we   
// are adding to the frame. The row count remains one.  
		frameObj.add(btn1);
		frameObj.add(btn2);
		frameObj.add(btn3);
		frameObj.add(btn4);
		frameObj.add(btn5);
		frameObj.add(btn6);
		frameObj.add(btn7);
		frameObj.add(btn8);
		frameObj.add(btn9);
// setting the grid layout   
// a 3 * 3 grid is created with the horizontal gap 20   
// and vertical gap 25  
		frameObj.setLayout(new GridLayout(3, 3));
		frameObj.setSize(300, 300);
		frameObj.setVisible(true);
		
		int calculator_for_a=0;
		int calculator_for_b=0;
		int point;
		
		
	}

// main method  
	public static void main(String argvs[]) {
		new GridLayoutExample();
	}
}