import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class MyApp1 extends Applet implements ActionListener
{
/*<applet code="MyApp1" height="500",width="400"></applet>*/
Label l1,l2,l3;
TextField t1,t2;
Button b1,b2,b3,b4;
public void actionPerformed(ActionEvent e)
{
Object o=e.getSource();
if(o==b2)
setBackground(Color.RED);
if(o==b3)
setBackground(Color.GREEN);
if(o==b4)
setBackground(Color.YELLOW);
}
public void init()
{
l1=new Label("First Number");
l2=new Label("Second Number");
t1=new TextField();
t2=new TextField();
b1=new Button("Add");
l3=new Label("");
b2=new Button("Red");
b3=new Button("Green");
b4=new Button("Yellow");
setLayout(null);
l1.setBounds(30,50,100,20);
t1.setBounds(150,50,100,30);
l2.setBounds(30,100,100,20);
t2.setBounds(150,100,100,30);
b1.setBounds(80,150,50,20);
l3.setBounds(50,200,200,30);
b2.setBounds(50,300,50,20);
b3.setBounds(100,300,50,20);
b4.setBounds(150,300,50,20);

add(l1);
add(l2);
add(t1);
add(t2);
add(b1);
add(l3);
add(b2);
add(b3);
add(b4);
b1.addActionListener(new MyHand());
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);

}
public class MyHand implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
int a,b,s;
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
s=a+b;

l3.setText("Sum is="+s);
}
}
}