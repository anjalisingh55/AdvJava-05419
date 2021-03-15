import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	TextField tx1,tx2,tx3;
	Button b1,b2,b3,b4;
	FDemo()
	{
		setLayout(null);
		Font f=new Font("Arial Black",Font.ITALIC,30);
		setFont(f);
		Label l1=new Label("Enter No.1");
		l1.setSize(150,40);
		l1.setLocation(100,80);
		add(l1);
		tx1=new TextField(30);
		tx1.setSize(100,40);
		tx1.setLocation(300,80);
		add(tx1);
		Label l2=new Label("Enter No.2");
		l2.setSize(150,30);
		l2.setLocation(100,150);
		add(l2);
		tx2=new TextField(30);
		tx2.setSize(100,40);
		tx2.setLocation(300,150);
		add(tx2);
		b1=new Button("+");
		b1.setSize(50,50);
		b1.setLocation(100,200);
		add(b1);
		b2=new Button("-");
		b2.setSize(50,50);
		b2.setLocation(150,200);
		add(b2);
		b3=new Button("*");
		b3.setSize(50,50);
		b3.setLocation(200,200);
		add(b3);
		b4=new Button("/");
		b4.setSize(50,50);
		b4.setLocation(250,200);
		add(b4);
		Label l3=new Label("Output");
		l3.setSize(150,30);
		l3.setLocation(100,270);
		add(l3);
		tx3=new TextField(30);
		tx3.setSize(300,80);
		tx3.setLocation(180,300);
		add(tx3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1=tx1.getText();
		String s2=tx2.getText();
		int x=Integer.parseInt(s1);
		int y=Integer.parseInt(s2);
		if(e.getSource()==b1)
		{
			int z=x+y;
			tx3.setText(""+z);
		}
		if(e.getSource()==b2)
		{
			int z=x-y;
			tx3.setText(""+z);
		}
		if(e.getSource()==b3)
		{
			int z=x*y;
			tx3.setText(""+z);
		}
		if(e.getSource()==b4)
		{
			int z=x/y;
			tx3.setText(""+z);
		}	
	}
}
class Calculator
{
    public static void main(String ar[])
	{
		
	    FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(500,500);
		f.setLocation(300,100);
	}
}
			
		
	
	
	
	
