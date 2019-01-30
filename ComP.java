
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
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

public class ComP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<100;i++)
        {
        ls.add(r.nextInt(1000));
        
        }
        Comparator c=new NumComp();
        Collections.sort(ls, c);
    
    for(Integer o: ls)
    {
        System.out.println(o);
    }
    }
}
    
class NumComp implements Comparator<Integer>
{


    
    @Override
    public int compare(Integer o1, Integer o2) {
        int name = o1%10>o2%10?1:o1%10<o2%10?-1:0;
        return name;
      
    }

}
