import java.applet.Applet;
import java.awt.*;
/* <applet code="MyApp" height="400" width="500"></applet> */ 
public class MyApp extends Applet
{
public void start()
{
System.out.println("start");
}
 public void init()
{
System.out.println("inti");
}
public void paint(Graphics g)
{
g.drawString("rahul rathore",100,100);
}
public void stop()
{
System.out.println("Stop");
}
public void  destroy()
{
System.out.println("Destroy");
}
}