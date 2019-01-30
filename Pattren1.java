/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Pattren1 {
    public static void main(String[] args) {
        int k=1;
        for(int i=1;i<=4;i++)
        { 
         for(int j=1;j<=4;j++)
         {
         if(j<=i)
         {
             System.out.print(k);
             k++;
         }
         else
                 System.out.print(" ");
         }
            System.out.println();
        }
    }
}
