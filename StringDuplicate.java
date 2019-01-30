
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class StringDuplicate {
    public void StringDupRemove(String str)
    {
    Set<Character> s=new HashSet<>();
    StringBuffer sf=new StringBuffer();
    for(int i=0;i<str.length();i++)
    {
    Character c=str.charAt(i);
    if(!s.contains(c))
    {
    s.add(c);
    sf.append(c);
    }
    
    }
        System.out.println( sf.toString());
    }
    public static void main(String[] args) {
        String str="rahlrathore";
        StringDuplicate s=new StringDuplicate();
        s.StringDupRemove(str);
        
        
    }
    
}
