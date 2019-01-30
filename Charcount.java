/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Charcount {
    public  void charc(String s2)
    {
    char c[]=s2.toCharArray();
    for(int i=0;i<c.length;i++)
    {
        String a="";
    while(c.length>i &&c[i]!=' ')
    {
    a=a+c[i];
    i++;
    
    }
    if(a.length()>0)
            System.out.println(a+"->"+a.length());
    }
    
    }
    public static void main(String[] args) {
        Charcount c=new Charcount();
        String s1="hello world";
         c.charc(s1);
        
    }
    
}
