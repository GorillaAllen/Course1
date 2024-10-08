//(2) 請設計一訂飲料系統
//    2.1 紅茶、綠茶、菁茶 ....
//    2.2 糖份
//    2.3 冰量
//    2.4 是否加其他的食材 ( ex 珍珠、寒天、椰果..)
//        加食材要加價
//    最後秀出其所選的飲料及其金額。
import javax.swing.*;
import java.awt.event.*;

public class Beverage_Menu {
	JFrame f;

	Beverage_Menu() {
		f = new JFrame("喝飲料瞜~");
		final JLabel label = new JLabel();
		label.setBounds(200, 100, 100, 20);
		label.setSize(400, 100);
		JButton b = new JButton("計算總額");
		JButton b_1 = new JButton("加入購物車");
		b.setBounds(200, 150, 100, 20);
		b_1.setBounds(200, 100, 100, 20);
		
		JCheckBox cb1,cb2,cb3;
		String tea[] = { "綠茶", "青茶", "烏龍茶", "紅茶" };
		String sweetness[] = { "無糖", "微糖", "半糖", "台南無糖" };
		String ice_amount[] = { "去冰", "微冰", "正常冰", "多冰" };
		//String topping[] = { "珍珠+10元", "紅豆+10元", "芋圓+15元", "小強+40元" };

		final JComboBox tea_box = new JComboBox(tea);
		tea_box.setBounds(30, 30, 90, 20);
		final JComboBox sweetness_box = new JComboBox(sweetness);
		sweetness_box.setBounds(30, 80, 90, 20);
		final JComboBox ice_amount_box = new JComboBox(ice_amount);
		ice_amount_box.setBounds(30, 130, 90, 20);
		//final JComboBox topping_box = new JComboBox(topping);
		//topping_box.setBounds(30, 180, 90, 20);
		
        cb1=new JCheckBox("加珍珠+10元");  
        cb1.setBounds(30,150,150,20);  
        cb2=new JCheckBox("加紅豆+10元");  
        cb2.setBounds(30,170,150,20);  
        cb3=new JCheckBox("加芋圓+15元");  
        cb3.setBounds(30,190,150,20); 

		f.add(tea_box);
		f.add(sweetness_box);
		f.add(ice_amount_box);
		f.add(b_1);
		//f.add(topping_box);

		f.add(label);f.add(b);f.add(cb1);f.add(cb2);f.add(cb3);
		f.setLayout(null);
		f.setSize(550, 350);
		f.setVisible(true);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int amount=30;
				String data="";
			    if(cb1.isSelected()){  
		            amount+=10;  
		        }  
		        if(cb2.isSelected()){  
		            amount+=10;  
		        }  
		        if(cb3.isSelected()){  
		            amount+=15;  
		        } 
				data = "您點的飲料為: " + tea_box.getItemAt(tea_box.getSelectedIndex()) 
				+ sweetness_box.getItemAt(sweetness_box.getSelectedIndex())
				+ ice_amount_box.getItemAt(ice_amount_box.getSelectedIndex());
				label.setText(data + amount + "元");
			}
		});
	}

	public static void main(String[] args) {
		new Beverage_Menu();

	}
}