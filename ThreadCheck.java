
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
public class ThreadCheck {
    public static void main(String[] args) {
    Runnable r=new Runnable() {
        @Override
        public void run() {
          for(int i=0;i<5;i++)
          {
              try {
                  System.out.println("In A");
                  Thread.sleep(1000);
              } catch (InterruptedException ex) {
                  Logger.getLogger(ThreadCheck.class.getName()).log(Level.SEVERE, null, ex);
              }
          
          }
        }
    };
      Thread t=new Thread(r);
      t.start();
      Runnable r1= new Runnable() {
        @Override
        public void run() {
            
            for(int i=0; i<5;i++)
            {
                try {
                    System.out.println("In B");
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadCheck.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            
            }
        }
            
        };
      Thread t2=new Thread(r1);
      t2.start();
                
    
        
    
      
    };
    
    
}


