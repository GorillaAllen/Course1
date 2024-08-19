import javax.swing.*;    
public class Button1 {  
public static void main(String[] args) {  
    JFrame f=new JFrame("Button Example");  
    JButton b1=new JButton("Click Here");  
    JButton b2=new JButton("Not Here"); 
    JButton b3=new JButton("Not Here"); 
    JButton b4=new JButton("Not Here"); 
    
    
    b1.setBounds(50,100,100,30);  
    b2.setBounds(200,100,100,30);
    b3.setBounds(200,100,100,30);
    b4.setBounds(200,100,100,30);
    
    f.add(b1);
    f.add(b2);
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
} 
}