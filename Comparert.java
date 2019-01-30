
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
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
public class Comparert {
    public static void main(String[] args) {
        Map<String,String> m=new HashMap<>();
        m.put("name", "Rahul");
         m.put("Class", "B.tech"); 
         m.put("Year", "2020");
         Set<String> s;
        s = m.keySet();
       for(String s1:s)
       {
           System.out.println(s1+" "+m.get(s1));
       }
       
        
    }
    
}
