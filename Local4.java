
import java.util.Locale;
import java.util.ResourceBundle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Local4 {
    public static void main(String[] args) {
        String lang="English";
        String country="US";
        Locale l=new Locale(lang, country);
        ResourceBundle r=ResourceBundle.getBundle("Bundle", l);
        String str=r.getString("wish");
        System.out.println(str);
    }
    
}
