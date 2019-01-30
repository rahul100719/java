
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
public class VowelCountt {
    public static void main(String[] args) {
        int count=0;
        System.out.println("Enter a String ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char c[]=str.toCharArray();
        for(int i=0;i<c.length;i++)
        {
        char r=c[i];
        switch(r)
        {
            case 'a':
                case 'i':
                    case 'e':
                        case 'o':
                            case 'u':
                              count++;
                              break;
             default:
                 count=0;
        
        }
        
        
        }
        System.out.println("no of vowel:"+count);  
    }
    
}
