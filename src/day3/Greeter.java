package day3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog(null, "What is your name?");
	JOptionPane.showMessageDialog(null, "Hello There "+answer);
}
}
