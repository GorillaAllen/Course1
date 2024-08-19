import java.awt.event.*;  
import javax.swing.*;    
public class Button2 {  
public static void main(String[] args) {
    JFrame f=new JFrame("Button Example");  
    final JTextField tf=new JTextField();  //輸入欄位,也可顯示資料
    tf.setBounds(50,50, 150,20);   //輸入欄位大小
    
    JButton b1=new JButton("Coffee"); //按鈕1號
    b1.setBounds(50,100,95,30);  
    b1.addActionListener(
    		new ActionListener(){ //有匿名類別來引用該介面. 目的是節省資源
    			public void actionPerformed(ActionEvent e){
    				tf.setText("is good");  
    			}
    		}
    );
    
    JButton b2=new JButton("Milk Tea");  
    b2.setBounds(200,100,95,30);  
    b2.addActionListener(
    		new ActionListener(){ //有匿名類別來引用該介面. 目的是節省資源
    			public void actionPerformed(ActionEvent e){
    				tf.setText("is too sweet");  
    			}
    		}
    );
    
    
    
    
    
    f.add(b1); f.add(b2);
    f.add(tf);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
}
}