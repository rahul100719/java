/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class print10withoutloop {
    public static void main(String[] args) {
        loop(1);
    }
    public static  void loop(int i)
    {
        
    if(i<=10)
            System.out.println(i);
        loop(i+1);
        
    }
            
    
}
