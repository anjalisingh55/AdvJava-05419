import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener 
{
	TextField tx1,tx2,tx3,tx4;
	Checkbox cb1,cb2;
	CheckboxGroup cbg;
	Button b1,b2;
	List li;
	FDemo()
	{
		setTitle("Registration Form");
		setLayout(null);
		Font f=new Font("Arial Black",Font.ITALIC,30);
		setFont(f);
		
	  Label un=new Label("Enter Name"); //Name
	  un.setSize(170,100);
	  un.setLocation(100,100);
	  add(un);
	  
	  tx1=new TextField(20);
	  tx1.setSize(500,80);
	  tx1.setLocation(300,100);
	  add(tx1);
	  
	  Label ua=new Label("Enter Add.");  //Address
	  ua.setSize(170,100);
	  ua.setLocation(100,200);
	  add(ua);
	  
	  tx2=new TextField(20);
	  tx2.setSize(500,80);
	  tx2.setLocation(300,200);
	  add(tx2);
	  
	  Label ue=new Label("Enter Email");  //EMail
	  ue.setSize(170,100);
	  ue.setLocation(100,300);
	  add(ue);
	  
	  tx3=new TextField(20);
	  tx3.setSize(500,80);
	  tx3.setLocation(300,300);
	  add(tx3);
	  
	  Label ug=new Label("Enter Category:");  //Category
	  ug.setSize(250,100);
	  ug.setLocation(100,400);
	  add(ug);
	  cbg=new CheckboxGroup();
	  
	  cb1=new Checkbox("Male",false,cbg);
	  cb1.setSize(100,100);
	  cb1.setLocation(350,400);
	  add(cb1);
	  cb2=new Checkbox("FeMale",true,cbg);
	  cb2.setSize(150,100);
	  cb2.setLocation(500,400);
	  add(cb2);
	  
	 Label ul=new Label("Lang. known:");  //Language known
	 ul.setSize(200,100);
	 ul.setLocation(100,500);
	 add(ul);
	 
	 b1=new Button("Click");  //Click Button
	 b1.setSize(100,80);
	 b1.setLocation(520,500);
	 add(b1);
	 
	 tx4=new TextField(20);
	  tx4.setSize(500,50);
	  tx4.setLocation(200,620);
	  add(tx4);
	  
	  li=new List();
	 li.add("Java");
	 li.add("Python");
	 li.add("pHp");
	 li.add("HTML");
	 li.setSize(200,100);
	 li.setLocation(300,500);
	 add(li);
	 
	 b2=new Button("Submit"); //Submit Button
	 b2.setSize(100,50);
	 b2.setLocation(400,670);
	 add(b2);
	 
	 b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
	 String s1[]=li.getSelectedItems();
      String s="";	
     for(int i=0;i<s1.length;i++)
	 {
		 s=s+s1[i];
	 }
     tx4.setText(s);	 
	}	 
}
class RegistrationForm
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(900,900);
		f.setLocation(400,100);
	}
}
