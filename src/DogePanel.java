import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class DogePanel extends JPanel 
{
	private Deck deck;
	private boolean displayingCard=false;
	private Card displayCard;
	
	public CardTable()
	{
		deck = new Deck();
		deck.shuffle();
	}
	
	public Deck getDeck()
	{
		return deck;
	}
	
	public Card getCardFromDeck(int want)
	{
		return deck.getCard(want);
	}
	public void displayCard(Card card)
	{
		displayingCard=true;
		displayCard = deck.getCard(card);
	}
	public void paintComponent(Graphics g)
	{
		Image img = null,img2=null;
		try
		{
			img = ImageIO.read(new File("pokertable.jpg"));
			img2 = ImageIO.read(new File("Card_Back.png"));
			
	
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	    super.paintComponent(g);
	    g.drawImage(img, 0, 0, null);
	    g.drawImage(img2,500,100,null);
		if(displayingCard)
		{
			//System.out.println(displayingCard);
			g.setColor(Color.white);
			g.fillRect(200, 100, 220, 300);
			g.setColor(displayCard.getColor());
		    g.drawString(displayCard.toString(), 220, 140);
			
		}
	    
	    super.repaint();
	}

}
