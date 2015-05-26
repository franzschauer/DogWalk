import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.Timer;


import javax.swing.JPanel;



public class level extends JPanel{

	private int levelNum;
	Dog d;
	boolean leadingLevel;
	public level(int num){
		levelNum=num;
		leadingLevel=false;
		d=new Dog();
	}
	public void makeLeader()
	{
		leadingLevel=true;
	}
	public boolean isLeader()
	{
		return leadingLevel;
	}
	public int getLevelHeight()
	{
		return getHeight()/6;
	}
	public Dog getDog()
	{
		return d;
	}
}
