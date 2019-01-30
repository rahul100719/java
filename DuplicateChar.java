
import static java.lang.reflect.Array.set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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
public class DuplicateChar {
    
    public void DupliChar(String str)
    {
    Map<Character,Integer> mp=new HashMap<>();
    char c[]=str.toCharArray();
    for(char i:c )
    {
    if(!mp.containsKey(i))
    {
    mp.put(i, 1);
        }
    else
    {
    mp.put(i,mp.get(i)+1);
    }
    }
    Set<Map.Entry<Character,Integer>> s=mp.entrySet();
    for(Map.Entry<Character,Integer> en:s)
    {
    if(en.getValue()>1)
    {
        System.out.println(en.getKey()+":"+en.getValue());
    }
    
    }
    }
    
    public static void main(String[] args) {
        String str="rahulr";
        DuplicateChar c=new DuplicateChar();
        c.DupliChar("rahulr");
    }
    
}
