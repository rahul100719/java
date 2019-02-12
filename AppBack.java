import java.applet.Applet;
import java.awt.*;
/*<applet code="AppBack" height="400" width=500></applet>*/
public class AppBack extends Applet 
{
Thread t,t1,t2;

public void start()
{
Runnable r=new Runnable()
{
public void run(){
            
            while(true)
            {
                try {
                    setBackground(Color.ORANGE);
                    Thread.sleep(500);
                } 
catch (Exception ex) {
                    
                }
                
            
            }
        }
};
            
       
Runnable r1=new Runnable()
{
public void run() {
            
            while(true)
            {
                try {
                    setBackground(Color.GREEN);
                    Thread.sleep(500);
                } catch (Exception ex) {
                    
                }
                
            
            }
}
};
Runnable r2=new Runnable()
{
public void run() {
            
            while(true)
            {
                try {
                    setBackground(Color.YELLOW);
                    Thread.sleep(500);
                } catch (Exception ex) {
                    
                }
                
            
            }
}
};
        
            
        
t=new Thread(r);
t2=new Thread(r1);
t1=new Thread(r2);

t.start();
t2.start();
t1.start();
}



public void paint(Graphics s)
{
s.drawString("Rahul Rathore",100,100);
}
}