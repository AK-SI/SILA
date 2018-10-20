/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

import Intefaces.IPaketLaundry;
import Models.PaketLaundry;
import java.util.ArrayList;

/**
 *
 * @author Rahmat Subekti
 */
public class ImPaketLaundry implements IPaketLaundry {

    private ArrayList<PaketLaundry> listPaket = new ArrayList<>();

    public ImPaketLaundry() {
        listPaket.add(new PaketLaundry("Rapi",5000,"kg"));
        listPaket.add(new PaketLaundry("Rapi dan Wangi",7000,"kg"));
        listPaket.add(new PaketLaundry("Cuci Kering",4000,"kg"));
        listPaket.add(new PaketLaundry("Setrika",2000,"kg"));
    }
    
    @Override
    public boolean save(PaketLaundry paket) {
        if (this.listPaket.add(paket)) return true;
        return false;
    }

    @Override
    public boolean delete(String idPaket) {
        int index=0, i=0,ketemu=0;
        for(PaketLaundry p:listPaket){
            if (p.getIdPaket().equals(idPaket)) {
                index=i;
                ketemu=1;
            }
            i++;
        }
        if (ketemu !=0){
            this.listPaket.remove(index);
            return true;
        }
        return false;
    }

    @Override
    public boolean update(PaketLaundry paket) {
        int index=0, i=0,ketemu=0;
        for (PaketLaundry data:listPaket) {
            if (data.getIdPaket().equals(paket.getIdPaket())) {
                index=i;
                ketemu=1;
            }
            i++;
        }
        if (ketemu !=0) {
            this.listPaket.set(index, paket);
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<PaketLaundry> getAll() {
        return this.listPaket;
    }

    @Override
    public PaketLaundry getPaketById(String idPaket) {
        PaketLaundry paket = new PaketLaundry();
        for (PaketLaundry p:listPaket) {
            if (idPaket.equals(p.getIdPaket())) {
                paket=p;
            }
        }
        return paket;
    }

    @Override
    public ArrayList<PaketLaundry> getPaketByName(String namaPaket) {
        ArrayList<PaketLaundry> lPaket = new ArrayList<>();
            for (PaketLaundry p:listPaket ) {
                if (p.getNamaPaket().toLowerCase().contains(namaPaket.toLowerCase())) {
                    lPaket.add(p);
                }
            }
        return lPaket;
    }
    
}
