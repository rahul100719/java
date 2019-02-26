/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.*;
public class IntegerToRoman {
    public static String Rom(int n)
    {
        String s[]=new String[]{"I","II","III","IV","V","VI","VII","VIII","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int a[]=new int[]{1,2,3,4,5,6,7,8,9,10,40,50,90,100,400,500,900,1000};
        if(n<1 ||n>1000)
            return "NO is not Vliad";
        StringBuilder sb=new StringBuilder();
        int i=a.length-1;
        System.out.println(s.length+" "+a.length);
        while(n>0)
        {
        if(n-a[i]>=0)
        {
        sb=sb.append(s[i]);
        n=n-a[i];
        }
        else if(i>=0)
            i--;
        }
        
    return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entert the number ");
        int n=sc.nextInt();
        System.out.println(IntegerToRoman.Rom(n));
    }
    
}
