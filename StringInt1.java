
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
public class StringInt1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first nmae n last name");
        String Fn=sc.nextLine();
        String Ln=sc.nextLine();
        System.out.println("enter a six digit integer");
        int sixd=sc.nextInt();
        int a=sc.nextInt();
        String s="";
        char r;
        if(Fn.length()>Ln.length())
        {
        r=Ln.charAt(0);
        s=s+Fn+r;
        }
        else
        {
        r=Fn.charAt(0);
        s=s+Ln+r;
                }
       String ins=String.valueOf(sixd);
       String m="";
       char c[]=s.toCharArray();
       for(int i=0;i<c.length;i++)
       {
       if(Character.isUpperCase(c[i]))
       {
       m=m+Character.toLowerCase(c[i]);
       }
       else
       {
           m=m+Character.toUpperCase(c[i]);
           
        }
       }
       char insl=ins.charAt(a-1);
       char insr=ins.charAt(ins.length()-a);
       m=m+insl+insr;
        char cr[]=m.toCharArray();
       String srt="";
        for(int i=cr.length;i>0;i--)
            srt=srt+cr[i-1];
        System.out.println(srt);
                
        
    }
    
}
