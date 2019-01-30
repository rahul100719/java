
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
public class Substringlast {
    public static void main(String[] args) {
        String r="rahul";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no up to which");
        int k=sc.nextInt();
        System.out.println(r.substring(0,k+1));
        System.out.println("string from last");
        System.out.println(r.substring(-1,-k ));
    }
    
}
