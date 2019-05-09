

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class checkpoint {


public static void main(String[] args) {
	
	
	String color =JOptionPane.showInputDialog("What is your favorite color?"); 
		
	JOptionPane.showMessageDialog(null, "Your favorite color is "+color );
	
	
	Robot danielisabot = new Robot();
	danielisabot.miniaturize();
	danielisabot.setSpeed(35);
	danielisabot.penDown();
	danielisabot.setPenWidth(40);
	for(int triangle = 0; triangle < 3; triangle++) {
		danielisabot.turn(120);
		danielisabot.move(150);
	}
}}