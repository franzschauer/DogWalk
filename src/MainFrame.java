import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.Timer;
import javax.swing.Timer;
import javax.swing.Timer;
public class MainFrame
{
	private static DogePanel tabby = new DogePanel();


public MainFrame()
{
	
}

public static void main(String[] args)
{
	
	
//	JPanel panny = new JPanel(new BorderLayout());
	/////
	JFrame frame = new JFrame("DogWalk!");
	frame.add(tabby);
	frame.setResizable(false);
	frame.setSize(600,641);
	tabby.setBackground(Color.black);
	frame.setVisible(true);
	//JTextArea textPanel = new JTextArea("I'm a dog");
	//will put the tex for the position of leading dog here
	//tabby.add(textPanel);
	//textPanel.setEditable(false);
	//////////////////////////////////////

	
	
}


}