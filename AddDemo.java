import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
  TextField tx1,tx2,tx3;
  FDemo()
  {
	  setLayout(new FlowLayout());
	  Font f=new Font("Arial Black",Font.ITALIC,30);
	  setFont(f);
	  tx1=new TextField(20);
	  add(tx1);
	  tx2=new TextField(20);
	  add(tx2);
	  Button b1=new Button("Sum");
	  add(b1);
	  tx3=new TextField(20);
	  add(tx3);
	  b1.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e)
  {
	  String s1=tx1.getText();
	  String s2=tx2.getText();
	  int x=Integer.parseInt(s1);
	  int y=Integer.parseInt(s2);
	  int z=x+y;
	  tx3.setText(""+z);
  }
}
class AddDemo
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(450,500);
		f.setLocation(400,100);
	}
}
	  