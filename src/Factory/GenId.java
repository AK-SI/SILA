/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Rahmat Subekti
 */
public class GenId {
    public static String GenId() {
        Date date = new Date();
        int max = date.getSeconds(), 
            min =1,
            rand =(int)(Math.random()*((max-min)+1))+min;
        SimpleDateFormat ft = new SimpleDateFormat ("yyDDDSSSSkkmmss");
        return ft.format(date)+(rand<10?rand*10:rand);
    }
}
