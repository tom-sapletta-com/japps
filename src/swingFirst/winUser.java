package swingFirst;

import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

import javax.swing.JOptionPane;

class MyActionListener implements ActionListener  {
	public void actionPerformed( ActionEvent e) {
		JButton source = ( JButton ) e.getSource();
		String buttonText = source.getText();
		JOptionPane.showMessageDialog(null, "You clicked " + buttonText);
	}
}




public class winUser {
	
	public static void getWindow() 
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame jFrame = new JFrame(" Register User ");
		
		jFrame.setLayout( new FlowLayout() );
		jFrame.setSize(250, 120);		
		jFrame.setLayout( new GridLayout(3,2) );
		
		
		jFrame.add( new JLabel("Name: ") );
		jFrame.add( new JTextField() );
		
		jFrame.add( new JLabel("E-mail: ") );
		
		jFrame.add( new JTextField() );
		
		jFrame.add( new JCheckBox("newsletter") );
		
		
		JButton button = new JButton("Register");
		button.addActionListener( new MyActionListener() );
		jFrame.getContentPane().add( button );
		
		jFrame.pack();
		jFrame.setVisible(true);
//		return JFrame; 
	}
}
