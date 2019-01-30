
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class LambdaPrac 
{    public void show(String s)
{
    System.out.println(s);
}

    public static void main(String[] args)
    {
       new Thread(()->
       {
               for(int i=0;i<5;i++)
               {
               
                  new LambdaPrac().show("hi");
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException ex) {
                       Logger.getLogger(LambdaPrac.class.getName()).log(Level.SEVERE, null, ex);
                   }
               
               }
            }).start();
          new Thread(()->
       {
               for(int i=0;i<5;i++)
               {
               
                  new LambdaPrac().show("hello");
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException ex) {
                       Logger.getLogger(LambdaPrac.class.getName()).log(Level.SEVERE, null, ex);
                   }
               
               }
            }).start();
          
               
    }
}
