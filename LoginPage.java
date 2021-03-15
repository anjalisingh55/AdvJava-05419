import java.awt.*;
class FDemo extends Frame
{ FDemo()
	{
	setTitle("Login Page");	
	setLayout(null);
	Font f=new Font("Arial Black",Font.ITALIC,30);
	setFont(f);
	Label un=new Label("Enter Name");
	un.setSize(200,50);
	un.setLocation(100,150);
	add(un);
	TextField tx1=new TextField();
	tx1.setSize(150,40);
	tx1.setLocation(300,150);
	add(tx1);
	Label up=new Label("Enter Pass");
	up.setSize(200,50);
	up.setLocation(100,220);
	add(up);
	TextField tx2=new TextField();
	tx2.setSize(150,40);
	tx2.setLocation(300,220);
	tx2.setEchoChar('*');
	add(tx2);
	Button b1=new Button("Login");
	b1.setSize(100,50);
	b1.setLocation(200,300);
	add(b1);
	setResizable(false);
	}
}
class LoginPage
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
	   f.setVisible(true);
       f.setSize(500,500);
	}
}