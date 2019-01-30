
import java.util.HashMap;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class StringOccure {
    
    public void CheckStringAvaliable(String str)
    {
    String s[]=str.split(" ");
        HashMap<String,Integer> hm=new HashMap<>();
    for(String sr:s)
    {
    if(hm.get(sr)!=null)
    {
    hm.put(sr, hm.get(sr)+1);
    }
    else
    {
    hm.put(sr, 1);
    }
    }
    Iterator <String>i=hm.keySet().iterator();
    while(i.hasNext())
    {
    String temp=i.next();
    if(hm.get(temp)>1)
    {
        System.out.println("the " + temp+" ouccre "+hm.get(temp)+" times");
        
    }
    
    }
    }
    public void CharValue(String str)
    {
    HashMap<String,Integer> hm=new HashMap<>();
    for(int i=0;i<str.length();i++)
    {
    
    char c=str.charAt(i);
    if(hm.get(c)!=null)
    {
    hm.put(str, hm.get(c)+1);
    
    }
    else
    {
    hm.put(str, 1);
    }
    
    }
    Iterator i=hm.keySet().iterator();
    while(i.hasNext())
    {
    char s=(char)i.next();
        System.out.println("chart "+s+" occure"+hm.get(s));
    
    }
    
    
    }
    
    public static void main(String[] args) {
        StringOccure s=new StringOccure();
        s.CheckStringAvaliable("Hello i Amm Amm Rahul rathore rathore");
        s.CharValue("rahulrathore");
    }
    
}
