/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
/*class Rahul implements Runnable
{
public void run()
{
for(int i=0;i<=5;i++)
{
    System.out.println("Rahul");
    try{
    Thread.sleep(1000);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
}
}
class Rathore implements Runnable
{
public void run()
{    for(int i=0;i<=5;i++)
{
    System.out.println("Rathore");
    try{Thread.sleep(1000);
    
    }

catch(Exception e)
        {
            System.out.println(e);
        }
}        
}
}*/


public class Thread1  {
    
    
    
    
    public static void main(String[] args)throws Exception
            
    {
         Runnable r1=new Runnable()
         {
        public void run()
{
for(int i=0;i<=5;i++)
{
    System.out.println("Rahul"+Thread.currentThread().getName());
    try{
    Thread.sleep(1000);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
}
         };
                 
                
        Thread t1=new Thread(()->
        {
    
{
for(int i=0;i<=5;i++)
{
    System.out.println("Rthiore"+Thread.currentThread().getName());
    try{
    Thread.sleep(1000);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
}
        });
        
        Thread t2=new Thread(r1);
        
        System.out.println(t1.isAlive());
        try
        {
        Thread.sleep(500);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        t2.start();
        t1.start();
        t1.setName("t1");
        t2.setName("t2");
        t1.join();
        
        t2.join();
       
        System.out.println(t1.isAlive());
        System.out.println("Hello Everyonme "+Thread.currentThread().getName());
        
    }
    
}
