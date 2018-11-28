/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

import Intefaces.IPelanggan;
import Models.Pelanggan;
import java.util.ArrayList;

/**
 *
 * @author Rahmat Subekti
 */
public class PelangganImpl extends BaseImpl<Pelanggan> implements IPelanggan  {

    public PelangganImpl() {
        rows.add(new Pelanggan("Fulan","081111111111","jl.satu"));
        rows.add(new Pelanggan("Dito","082222222222","jl.dua"));
        rows.add(new Pelanggan("Ratno","0833333333","jl.tiga"));
    }

    @Override
    public ArrayList<Pelanggan> getPelangganByName(String namaPelanggan) {
        ArrayList<Pelanggan> lPelanggan = new ArrayList<>();
        for (Pelanggan p:rows ) {
            if (p.getNama().toLowerCase().contains(namaPelanggan.toLowerCase())) {
                lPelanggan.add(p);
            }
        }
        return lPelanggan;
    }
    
}
