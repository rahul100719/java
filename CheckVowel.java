
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
public class CheckVowel {
    public static void main(String[] args) {
        System.out.println("enter the String ");
        Scanner Sc=new Scanner(System.in);
        String str=Sc.next();
       char c[]=str.toCharArray();
       int cout=0;
       for(char x:c)
       {
       switch(x)
       {
           case 'a':
               case 'i':
                   case 'o':
                       case 'u':
                           case 'e':
                               cout++;
                               break;
                               
                                   
                
       
       }
       
       }
        System.out.println("no of vowel="+cout);
    }
    
}
