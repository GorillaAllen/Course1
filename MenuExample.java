import javax.swing.*;
import java.awt.event.*;

public class MenuExample implements ActionListener {
	JFrame f;
	JMenuBar mb;
	JMenu file, edit, help, complaint;
	JMenuItem cut, copy, paste, selectAll, call, email;
	JTextArea ta;

	MenuExample() {
		f = new JFrame();
		cut = new JMenuItem("cut");
		copy = new JMenuItem("copy");
		paste = new JMenuItem("paste");
		selectAll = new JMenuItem("selectAll");
		call = new JMenuItem("0912345678");
		email= new JMenuItem("a123@yahoo.com");
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		selectAll.addActionListener(this);
		mb = new JMenuBar();
		file = new JMenu("File");
		edit = new JMenu("Edit");
		help = new JMenu("Help");
		complaint = new JMenu("complaint");
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(selectAll);
		complaint.add(call);
		complaint.add(email);
		mb.add(file);
		mb.add(edit);
		mb.add(help);
		mb.add(complaint);
		ta = new JTextArea();
		ta.setBounds(5, 5, 360, 320);
		f.add(mb);
		f.add(ta);
		f.setJMenuBar(mb);
		f.setLayout(null);
		f.setSize(400, 400);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cut)
			ta.cut();
		if (e.getSource() == paste)
			ta.paste();
		if (e.getSource() == copy)
			ta.copy();
		if (e.getSource() == selectAll)
			ta.selectAll();
	}

	public static void main(String[] args) {
		new MenuExample();
	}
}