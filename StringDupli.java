
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
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
public class StringDupli 
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a String");
        String s=sc.nextLine();
        Map<Character,Integer> mp=new HashMap<>();
        char []c=s.toCharArray();
        for(char i:c)
        {
        if(!mp.containsKey(i))
        {
        mp.put(i, 1);
        }
        else
        {
        mp.put(i, mp.get(i)+1);
        }
        }
        
        Set<Map.Entry<Character,Integer>> enset=mp.entrySet();
        for(Map.Entry<Character,Integer> en:enset)
        {
        if(e)
        }
         
        
        }
        
    }
  
        
        

        
                
        
    
    
        
