import java.awt.*;
import java.awt.Graphics;
import java.awt.Color;

class FDemo extends Frame
{
	FDemo()
	{
		Font f=new Font("Arial Black",Font.ITALIC,60);
		setFont(f);
		
	}
	public void paint(Graphics g)
	{
       g.fillOval(100,100,300,300); 
	   Color c1=new Color(0,0,0);
	   g.setColor(c1);
	   g.fillOval(180,170,25,25);
	   g.fillOval(290,170,25,25);
	   Color c2=new Color(64,0,0);
	   g.setColor(c2);
	   g.fillOval(235,235,28,28);
	   Color c3=new Color(255,0,0);
	   g.setColor(Color.red);
	   g.fillArc(200,280,100,90,150,240);
	   Color c4=new Color(0,0,128);
	   g.setColor(c4);
	   g.drawString("Keep Smiling",50,500);
		
	}
}

class Emoji
{
  public static void main(String ar[])
{
 
 FDemo f=new FDemo();
 f.setVisible(true);
 f.setSize(500,600);
 f.setLocation(400,100);
 f.setBackground(Color.green);
 f.setForeground(Color.yellow);
}

}