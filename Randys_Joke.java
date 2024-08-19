import javax.swing.JOptionPane;

class Popup{
	Object[] options = { "Blueberry", "Mint" };
	int n = JOptionPane.showOptionDialog(null, "Name me a blue food", "A Silly Joke",
			JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, // do not use a custom Icon
			options, // the titles of buttons
			options[0]); // default button title
	if (n==0) {
		
	}

}

public class Randys_Joke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Popup joke1 = new Popup();
	}

}
