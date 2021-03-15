import java.awt.Graphics;
import java.awt.Frame;
import java.awt.*;
class FDemo extends Frame 
{
	FDemo()
	{
	 Font f=new Font("Arial Black",Font.ITALIC,30);
     setFont(f);	 
	}
	public void paint(Graphics g)
	{
		g.drawString("hello!!!",100,100);
		g.drawString("I'm Anjali Thakur",100,200);
		g.drawString("I am from Indore",100,300);
		g.drawString("I am in 2nd year",100,400);
	}
	
}
class Introduction
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(500,500);
		f.setLocation(400,100);
	}
}
	