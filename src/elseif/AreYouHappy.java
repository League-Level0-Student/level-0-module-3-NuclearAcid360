package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {

		String answer = JOptionPane.showInputDialog("Are you happy?");

		if (answer.equals("Yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		}

		else if (answer.equals("No")) {
			answer = JOptionPane.showInputDialog("Do you want to be happy?");

			if (answer.equals("No")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
			}
			else if (answer.equals("Yes")) {
				JOptionPane.showMessageDialog(null, "Change Something");
			}
		}
	}

}
