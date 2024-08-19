import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Frame_icon{
Frame_icon(){
JFrame f=new JFrame("Button Example");
ImageIcon image1 = new ImageIcon("C:\\Users\\USER\\Pictures\\eldenR.png");
JLabel l1= new JLabel(image1);
l1.setBounds(0,0,300, 270);
f.add(l1);
f.setSize(316,309);
f.setLayout(null);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
public static void main(String[] args) {
    new Frame_icon();
}
}