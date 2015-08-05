package day3;

import javax.swing.JOptionPane;

public class EverythingIsAwesome {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("Type in what you think is awesome");
	JOptionPane.showMessageDialog(null, answer+" Is Awesome");
}
}
