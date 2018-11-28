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
public class PaketLaundryImpl extends BaseImpl<PaketLaundry> implements IPaketLaundry {

    public PaketLaundryImpl() {
        rows.add(new PaketLaundry("Rapi",5000,"kg"));
        rows.add(new PaketLaundry("Rapi dan Wangi",7000,"kg"));
        rows.add(new PaketLaundry("Cuci Kering",4000,"kg"));
        rows.add(new PaketLaundry("Setrika",2000,"kg"));
    }

    @Override
    public ArrayList<PaketLaundry> getPaketByName(String namaPaket) {
        ArrayList<PaketLaundry> lPaket = new ArrayList<>();
            for (PaketLaundry p:rows ) {
                if (p.getNamaPaket().toLowerCase().contains(namaPaket.toLowerCase())) {
                    lPaket.add(p);
                }
            }
        return lPaket;
    }
    
}
