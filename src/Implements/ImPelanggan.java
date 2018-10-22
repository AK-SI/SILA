/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

import Intefaces.IPelanggan;
import Models.Pelanggan;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Rahmat Subekti
 */
public class ImPelanggan implements IPelanggan, Serializable {
    ArrayList<Pelanggan> listPelanggan = new ArrayList<>();

    public ImPelanggan() {
        listPelanggan.add(new Pelanggan("Fulan","081111111111","jl.satu"));
        listPelanggan.add(new Pelanggan("Dito","082222222222","jl.dua"));
        listPelanggan.add(new Pelanggan("Ratno","0833333333","jl.tiga"));
    }

    @Override
    public boolean save(Pelanggan pelanggan) {
        if (this.listPelanggan.add(pelanggan)) return true;
        return false;
    }

    @Override
    public boolean delete(String idPelanggan) {
        int index=0, i=0,ketemu=0;
        for(Pelanggan p:listPelanggan){
            if (p.getIdPelanggan().equals(idPelanggan)) {
                index=i;
                ketemu=1;
            }
            i++;
        }
        if (ketemu !=0){
            this.listPelanggan.remove(index);
            return true;
        }
        return false;
    }

    @Override
    public boolean update(Pelanggan pelanggan) {
        int index =0, i=0,ketemu=0;
        for (Pelanggan data:listPelanggan) {
            if (data.getIdPelanggan().equals(pelanggan.getIdPelanggan())) {
                index=i;
                ketemu = 1;
            }
            i++;
        }
        if (ketemu !=0){
            this.listPelanggan.set(index, pelanggan);
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<Pelanggan> getAll() {
        return this.listPelanggan;
    }

    @Override
    public Pelanggan getPelangganById(String idPelanggan) {
        Pelanggan pelanggan =new Pelanggan();
        for (Pelanggan p:listPelanggan ) {
            if (idPelanggan.equals(p.getIdPelanggan())) {
                pelanggan=p;
            }
        }
        return pelanggan;
    }

    @Override
    public ArrayList<Pelanggan> getPelangganByName(String namaPelanggan) {
        ArrayList<Pelanggan> lPelanggan = new ArrayList<>();
        for (Pelanggan p:listPelanggan ) {
            if (p.getNama().toLowerCase().contains(namaPelanggan.toLowerCase())) {
                lPelanggan.add(p);
            }
        }
        return lPelanggan;
    }
    
}
