/*
Author : Joshua Akangah
Version : 0.0.1
Date : 15/04/20 2:12 AM
*/

import javax.swing.*;

public class Todo {
	public static void main(String args[]){
		JFrame f = new JFrame();

		JButton b = new JButton("Add Todo");

		b.setBounds(130, 100, 100, 40);

		f.add(b);

		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
}
