import javax.swing.*;
public class Button_icon{
Button_icon(){
JFrame f=new JFrame("Button Example");
JButton b=new JButton(new ImageIcon("C:\\Users\\USER\\Pictures\\eldenR.png"));
b.setBounds(0,0,300, 270);
f.add(b);
f.setSize(316,309);
f.setLayout(null);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
public static void main(String[] args) {
    new Button_icon();
}
}