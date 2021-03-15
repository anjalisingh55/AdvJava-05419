import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	Button b1,b2,b3;
	Boolean m=false;
	Boolean n=false;
	Boolean p=false;
	FDemo()
	{
		setLayout(null);
		Font f=new Font("Arial Black",Font.ITALIC,30);
		setFont(f);
		b1=new Button("Button1");
		b1.setSize(200,100);
		b1.setLocation(100,100);
		b1.addActionListener(this);
		add(b1);
		
		b2=new Button("Button2");
		b2.setSize(200,100);
		b2.setLocation(400,100);
		b2.addActionListener(this);
		add(b2);
		
		b3=new Button("Button3");
		b3.setSize(200,100);
		b3.setLocation(650,100);
		b3.addActionListener(this);
		add(b3);
	}
	public void paint(Graphics g)
	{
		if(m)
		{
			g.setColor(Color.red);
			g.fillArc(150,300,100,100,0,270);	
		}	
         if(n)
		{
			g.setColor(Color.cyan);
			g.fillRect(450,300,100,100);	
		}	
         if(p)
		{
			g.setColor(Color.green);
			g.fillOval(650,300,200,100);	
		}			
	}
	public void actionPerformed(ActionEvent e)
	{ 
		if(e.getSource()==b1)
		{ m=true;
		repaint();
		}
		if(e.getSource()==b2)
		{ n=true;
		repaint();
		}
		if(e.getSource()==b3)
		{p=true;
		repaint();
		}
	}
}
class ShapeDemo
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(900,900);
		f.setLocation(400,100);
		f.setBackground(Color.black);
	}
}