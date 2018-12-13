package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {

public static void main(String[] args) {

String answer=JOptionPane.showInputDialog("Are you happy?");

if (answer.equals("Yes")) {
JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
}

if (answer.equals("No")) {
JOptionPane.showMessageDialog(null,"Do you want to be happy?");
}


}
}

