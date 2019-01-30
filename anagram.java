
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class anagram {
    public static void main(String[] args) {
        System.out.println(  ana("java","avaj"));
    }
    public static  boolean ana(String s1,String s2)
    {
        char []str1=s1.toCharArray();
        char []str2=s2.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        
        
        
        
    return Arrays.equals(str1, str2);
    }
            
}
