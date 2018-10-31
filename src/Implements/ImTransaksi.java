/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

import Intefaces.ITransaksi;
import Models.Transaksi;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Rahmat Subekti
 */
public class ImTransaksi implements ITransaksi, Serializable{
    ArrayList<Transaksi> listTransaksi = new ArrayList<>();

    public ImTransaksi() {
    }
    
    @Override
    public boolean save(Transaksi transaksi) {
        if(this.listTransaksi.add(transaksi)) return true;
        return false;
    }

    @Override
    public ArrayList<Transaksi> getAll() {
        return this.listTransaksi;
    }

    @Override
    public ArrayList<Transaksi> getTransaksiByIDPelanggan(String idPelanggan) {
        ArrayList<Transaksi> lTransaksi = new ArrayList<>();
        for (Transaksi t:listTransaksi) {
            if (t.getIdPelanggan().equals(idPelanggan)) {
                lTransaksi.add(t);
            }
        }
        return lTransaksi;
    }

    @Override
    public boolean delete(String idTransaksi) {
        int index=-1,i=0,ketemu=0;
        for(Transaksi p:listTransaksi){
            if (p.getIdTransaksi().equals(idTransaksi)) {
                index=i;
                ketemu=i;
            }
            i++;
        }
        if (ketemu !=-1){
            this.listTransaksi.remove(index);
            return true;
        }
        return false;
    }

    @Override
    public Transaksi getTransaksiByID(String idTransaksi) {
        for(Transaksi p:listTransaksi){
            if (p.getIdTransaksi().equals(idTransaksi)) {
                return p;
            }
        }
        return null;
    }

    
}
