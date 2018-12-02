/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author su
 */
public class Laundry extends ModelBase{
    private HashMap<String, ArrayList<Object>> data = new HashMap<>();

    public Laundry(){
        ArrayList<Object> pelanggan = new ArrayList<>();
        Collections.addAll(pelanggan, 
            new Pelanggan("Fulan","081111111111","jl.satu"),
            new Pelanggan("Dito","082222222222","jl.dua"),
            new Pelanggan("Ratno","0833333333","jl.tiga")
        );
        
        ArrayList<Object> paket = new ArrayList<>();
        Collections.addAll(paket, 
            new PaketLaundry("Rapi",5000,"kg"),
            new PaketLaundry("Rapi dan Wangi",7000,"kg"),
            new PaketLaundry("Cuci Kering",4000,"kg"),
            new PaketLaundry("Setrika",2000,"kg")
        );
        
        data.put(pelanggan.get(0).getClass().getSimpleName(), pelanggan);
        data.put(paket.get(0).getClass().getSimpleName(), paket);
    }
    
    public ArrayList<Object> getData(String type) {
        return data.get(type);
    }

    public void setData(String type , ArrayList<Object> o) {
        data.put(type,o);
    }
}
