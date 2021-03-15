import java.awt.*;
import java.awt.Graphics;
import java.awt.Color;
class FDemo extends Frame
{ FDemo()
{
}
public void paint(Graphics g)
{
Color c1=new Color(255,147,0);   //orange
g.setColor(c1);
g.fillRect(100,100,300,60);
Color c2=new Color(255,255,255);  //white
g.setColor(c2);
g.fillRect(100,160,300,60);
Color c3=new Color(0,125,63);    //green
g.setColor(c3);
g.fillRect(100,220,300,60);
Color c4=new Color(128,0,0);  //brown
g.setColor(c4);
g.fillRect(80,100,20,400);
g.fillRect(40,500,100,40);  //first ladder
g.fillRect(20,540,150,40);  //second ladder
Color c5=new Color(0,0,128);  //blue
g.setColor(c5);
g.drawOval(204,160,60,60);
int sa=0;
int ma=5;
for(int i=1;i<=24;i++)
{
g.fillArc(204,160,60,60,sa,ma);
sa=sa+15;
}
Color c6=new Color(128,0,64);
g.setColor(c6);
g.fillOval(78,78,28,28);
}
}
class Flag1
{
public static void main(String ar[])
{
FDemo f=new FDemo();
f.setVisible(true);
f.setSize(500,600);
f.setLocation(40,100);
f.setBackground(Color.cyan);
f.setForeground(Color.black);
}
}