
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class PrimeorNot {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        n=sc.nextInt();
                
        for(int i=2;i<n;i++)
        {    int f=0;
            for(int j=2;j<i;j++)
            {
            if(i%j==0)
            f=1;
          }
            if(f==0)
                    System.out.println(i);
           }
        }
    }
    

