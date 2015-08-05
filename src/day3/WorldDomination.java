package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String answer = JOptionPane
				.showInputDialog("Do you know how to program?");
		// 2. If they say "yes", tell them they will rule the world.
		if (answer.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Then you will rule the world");
		} else {
			JOptionPane.showMessageDialog(null, "good luck washing dishes");
		}
	}
	// 3. Otherwise, wish them good luck washing dishes.

}
