
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class CollectionJava {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add(5);
        c.add(4.2);
        c.add("Rahul rathore");
        c.add(4.555666);
        for(Object a:c)
        {
            System.out.println(a);
        }
        c.remove("Rahul rathore");
        System.out.println("After removal\n");
        for(Object a:c)
        {
            System.out.println(a);
        }
        
    }
    
}
