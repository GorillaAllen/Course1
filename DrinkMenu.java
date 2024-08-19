import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Drink {
	String name, sugar_amount, ice_amount;
	int price;
	Boolean tapioca, redbean, taro_ball;

	Drink(String name, String sugar_amount, String ice_amount, int price, Boolean tapioca, Boolean redbean,
			Boolean taro_ball) {
		this.name = name;
		this.sugar_amount = sugar_amount;
		this.ice_amount = ice_amount;
		this.price = price;
		this.tapioca = tapioca;
		this.redbean = redbean;
		this.taro_ball = taro_ball;
	}

}

public class DrinkMenu extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		
		ArrayList = 
		
		Drink[] drink_order = new Drink[i];
		
		JFrame f = new JFrame("喝飲料瞜~");
		JButton b = new JButton("計算總額");
		final JLabel label = new JLabel();
		JCheckBox cb1, cb2, cb3;
		String tea[] = { "綠茶", "青茶", "烏龍茶", "紅茶" };
		String sweetness[] = { "無糖", "微糖", "半糖", "台南無糖" };
		String ice_amount[] = { "去冰", "微冰", "正常冰", "多冰" };
		final JComboBox tea_box = new JComboBox(tea);
		final JComboBox sweetness_box = new JComboBox(sweetness);
		final JComboBox ice_amount_box = new JComboBox(ice_amount);

		f.setLayout(null);
		f.setSize(550, 350);
		f.setVisible(true);

		b.setBounds(200, 100, 100, 20);
		tea_box.setBounds(30, 30, 90, 20);
		sweetness_box.setBounds(30, 80, 90, 20);
		ice_amount_box.setBounds(30, 130, 90, 20);
		label.setBounds(200, 100, 100, 20);
		label.setSize(400, 100);

		cb1 = new JCheckBox("加珍珠+10元");
		cb1.setBounds(30, 150, 150, 20);
		cb2 = new JCheckBox("加紅豆+10元");
		cb2.setBounds(30, 170, 150, 20);
		cb3 = new JCheckBox("加芋圓+15元");
		cb3.setBounds(30, 190, 150, 20);
		
		f.add(tea_box);
		f.add(sweetness_box);
		f.add(ice_amount_box);
		f.add(label);f.add(b);f.add(cb1);f.add(cb2);f.add(cb3);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				int amount=30;
//				String data="";
//			    if(cb1.isSelected()){  
//		            amount+=10;  
//		        }  
//		        if(cb2.isSelected()){  
//		            amount+=10;  
//		        }  
//		        if(cb3.isSelected()){  
//		            amount+=15;  
//		        } 
//				data = "您點的飲料為: " + tea_box.getItemAt(tea_box.getSelectedIndex()) 
//				+ sweetness_box.getItemAt(sweetness_box.getSelectedIndex())
//				+ ice_amount_box.getItemAt(ice_amount_box.getSelectedIndex());
//				label.setText(data + amount + "元");
				
				
			}
		});

	}

}
