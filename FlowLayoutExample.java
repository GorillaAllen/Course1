
// import statement  
import java.awt.*;
import javax.swing.*;

public class FlowLayoutExample {
	JFrame frameObj;

// constructor    
	FlowLayoutExample() {
		// creating a frame object
		frameObj = new JFrame();

		// creating the buttons
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		b1.setBounds(0,0,50,50);
		b2.setBounds(0,0,50,50);
		b3.setBounds(0,0,50,50);
		b4.setBounds(0,0,50,50);
		b5.setBounds(0,0,50,50);
		b6.setBounds(0,0,50,50);
		b7.setBounds(0,0,50,50);
		b8.setBounds(0,0,50,50);
		b8.setBounds(0,0,50,50);
		
		// adding the buttons to frame
		frameObj.add(b1);
		frameObj.add(b2);
		frameObj.add(b3);
		frameObj.add(b4);
		frameObj.add(b5);
		frameObj.add(b6);
		frameObj.add(b7);
		frameObj.add(b8);
		frameObj.add(b9);

		// parameterized constructor is used
		// where alignment is left
		// horizontal gap is 20 units and vertical gap is 25 units.
		frameObj.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		frameObj.setSize(300, 300);
		frameObj.setVisible(true);
	}

// main method  
	public static void main(String argvs[]) {
		new FlowLayoutExample();
	}
}