import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.Timer;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Box.Filler;

public class DogePanel extends JPanel implements ActionListener{
	Dog d;
	boolean doAJig=false;
	Timer t=new Timer(10000,this);
	public DogePanel(){
		super();
		t.start();

	}
	public void paintComponent(Graphics g){	

		
		super.paintComponent(g);
		int num=600/6;
		for(int i=0;i<6;i++){
			int repeatCounter=0;
			level l = new level(i);
			int height=l.getLevelHeight();
			g.setColor(Color.RED);
			g.fillRect(0, num,getWidth(), height+3);
			num+=600/6;
			////////////////////////////////
			d=l.getDog();
			if(d.isWalking())
			{
				l.makeLeader();
				g.setColor(Color.yellow);
				g.fillRect(0, num,getWidth(), height+3);
			}
			if(doAJig)
			{
				//if(repeatCounter==)
				//set a random dog to leader
				doAJig=false;
			}

		}

		
		super.repaint();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("ding dong");
		doAJig=true;
	}

}
