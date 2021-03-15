import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	
	FDemo()
	{
		setLayout(new FlowLayout());
		Font f=new Font("Arial Black",Font.ITALIC,30);
		setFont(f);
		Button b1=new Button("Button1");
		b1.addActionListener(this);
		add(b1);
	}
	public void actionPerformed(ActionEvent e)
	{ 
	 setBackground(Color.cyan);	
	}
}
class Demo8
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(500,500);
		f.setLocation(400,100);
	}
}