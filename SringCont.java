/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class SringCont {
    public void StringCon(String str)
    {
    char []c=str.toCharArray();
    for(int i=0;i<c.length;i++)
    {
    String s="";
    while(i<c.length && c[i]!=' ')
    {
    s=s+c[i];
    i++;
    
    }
    if(s.length()>0)
    {
        System.out.println(s+"->"+s.length());
    
    }
    
    
    }
    
    }
    
    
    public static void main(String[] args) {
        SringCont s=new SringCont();
        s.StringCon("rahul rathore");
    }
    
}
