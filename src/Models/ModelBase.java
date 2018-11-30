/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author su
 */
class ModelBase implements Serializable{
    private Long id;

    public ModelBase() {
        this.id = GenId();
    }

    public ModelBase(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    private Long GenId() {
        Date date = new Date();
        int max = date.getSeconds(), 
            min =1,
            rand =(int)(Math.random()*((max-min)+1))+min;
        SimpleDateFormat ft = new SimpleDateFormat ("yyDDDSSSSkkmmss");
        return Long.parseLong(ft.format(date)+(rand<10?rand*10:rand));
    }

    @Override
    public String toString() {
        return this.id.toString();
    }
}
