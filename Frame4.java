import java.awt.Graphics;
import java.awt.Frame;
class FDemo extends Frame 
{
	FDemo()
	{
		
	}
	public void paint(Graphics g)
	{
		g.drawString("ram",250,250);
	}
	
}
class Frame4
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(500,500);
		f.setLocation(400,100);
	}
}
	