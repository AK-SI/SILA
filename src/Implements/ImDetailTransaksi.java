/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

import Intefaces.IDetailTransaksi;
import Models.DetailTransaksi;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Rahmat Subekti
 */
public class ImDetailTransaksi implements IDetailTransaksi, Serializable{

    private ArrayList<DetailTransaksi> listDetail = new ArrayList<>();
    public ImDetailTransaksi() {
    }
    

    @Override
    public boolean save(DetailTransaksi detail) {
        if (listDetail.add(detail)) return true;
        return false;
    }

    @Override
    public ArrayList<DetailTransaksi> getDetail(String idTransaksi) {
        ArrayList<DetailTransaksi> lDetail= new ArrayList<>();
        for (DetailTransaksi d:listDetail) {
            if (d.getIdTransaksi().equals(idTransaksi)) {
                lDetail.add(d);
            }
        }
        return lDetail;
    }

    @Override
    public ArrayList<DetailTransaksi> getAll() {
        return listDetail;
    }
    
}
