/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class PraymidPattren {
    public static void main(String[] args) {
      
        for(int i=1;i<=5;i++)
        { 
           
         for(int j=1;j<=5;j++)
         {int k=j;
         if(j<=6-i)
         {
             System.out.print("*");
             k++;
             
         }
         else
                 System.out.print(" ");
         }
            System.out.println();
        }
    }
    
}
