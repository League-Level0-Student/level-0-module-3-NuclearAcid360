package elseif;

import javax.swing.JOptionPane;

public class Horoscope {

	public static void main(String[] args) {

		String starsign = JOptionPane.showInputDialog("What is your star sign?");
		
		if (starsign.equalsIgnoreCase("Aries")) {
			JOptionPane.showMessageDialog(null, "Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action");
		}
		
		else if (starsign.equalsIgnoreCase("Taurus")) {
			JOptionPane.showMessageDialog(null, "Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature");
		}
		
		else if (starsign.equalsIgnoreCase("Gemeni")) {
			JOptionPane.showMessageDialog(null, "Cerebral, chatty, loves learning and education, charming, and adventurous");
		}
		
		else if (starsign.equalsIgnoreCase("Cancer")) {
			JOptionPane.showMessageDialog(null, "Emotional, group oriented, seeks security, family");
		}
		
		else if (starsign.equalsIgnoreCase("Leo")) {
			JOptionPane.showMessageDialog(null, "Generous, organized, protective, beautiful");
		}
		
		else if (starsign.equalsIgnoreCase("Virgo")) {
			JOptionPane.showMessageDialog(null, "Particular, logical, practical, sense of duty, critical");
		}
		
		else if (starsign.equalsIgnoreCase("Libra")) {
			JOptionPane.showMessageDialog(null, "Balanced, seeks beauty, sense of justice");
		}
		
		else if (starsign.equalsIgnoreCase("Scorpio")) {
			JOptionPane.showMessageDialog(null, "Passionate, exacting, loves extremes, combative, reflective");
		}
		
		else if (starsign.equalsIgnoreCase("Sagittarius")) {
			JOptionPane.showMessageDialog(null, "Happy, absent minded, creative, adventurous");
		}
		
		else if (starsign.equalsIgnoreCase("Capricorn")) {
			JOptionPane.showMessageDialog(null, "Timeless, driven, calculating, ambitious");
		}
		
		else if (starsign.equalsIgnoreCase("Aquarius")) {
			JOptionPane.showMessageDialog(null, "Forward thinking, communicative, people oriented, stubborn, generous, and dedicated");
		}
		
		else if (starsign.equalsIgnoreCase("Pisces")) {
			JOptionPane.showMessageDialog(null, "Likeable, energetic, passionate, sensitive");
		}
		
		else {
			JOptionPane.showMessageDialog(null,"That's not a Star Sign!");
		}
	}
	
}
