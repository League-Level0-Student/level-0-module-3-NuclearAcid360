
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "May 24th";
		String dadsBirthday = "November 13th";
		String myBirthday = "November 15th";

		// 2. Find out which birthday the user wants and and store their response in a
		// variable
		String Person = JOptionPane.showInputDialog("Whose birthday do you want to know?");
		// 3. Print out what the user typed
		System.out.println(Person);
		// 4. if user asked for "mom"
		// print mom's birthday
		if (Person.equalsIgnoreCase("Mom")) {
			System.out.println(momsBirthday);
		}

		// 5. if user asked for "dad"
		// print dad's birthday
		else if (Person.equalsIgnoreCase("Dad")) {
			System.out.println(dadsBirthday);
		}
		// 6. if user asked for your name
		// print myBirthday
		else if (Person.equalsIgnoreCase("Mine")) {
			System.out.println(myBirthday);
		}
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
		}
	}
}
