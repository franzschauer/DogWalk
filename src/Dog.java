
public class Dog {

	private boolean walking;
	private boolean isLeader;

	public Dog(){
		walking=false;	
		isLeader=false;
	}
	public void switchState(){
		if(walking==false)
			walking=true;
		else
			walking=false;
	}
	public boolean isWalking(){
		return walking;
	}
	public void makeLeader()
	{
		isLeader=true;
	}
}
