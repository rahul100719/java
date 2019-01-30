
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
public class missingNumber {
    public static void main(String[] args) {
        int n,actual_length,total_length,mn;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        n=sc.nextInt();
        
        actual_length=n*(n+1)/2;
        System.out.println("actual length="+actual_length);
        
        int a[]=new int[n];
        for(int i=1;i<n;i++)
        {
        a[i]=sc.nextInt();
        }
        for(int i:a)
        {
        sum=sum+i;
        }
        total_length=sum;
        System.out.println("total length="+total_length);
        mn=actual_length-total_length;
        System.out.println("missinig no"+mn);
    }
    
}
