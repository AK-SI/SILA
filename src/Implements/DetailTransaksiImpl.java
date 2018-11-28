/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

import Intefaces.IDetailTransaksi;
import Models.DetailTransaksi;
import java.util.ArrayList;

/**
 *
 * @author Rahmat Subekti
 */
public class DetailTransaksiImpl extends BaseImpl<DetailTransaksi> implements IDetailTransaksi{

    public DetailTransaksiImpl() {
    }
    
    @Override
    public ArrayList<DetailTransaksi> getDetail(Long idTransaksi) {
        ArrayList<DetailTransaksi> lDetail= new ArrayList<>();
        for (DetailTransaksi d:rows) {
            if (d.getIdTransaksi().equals(idTransaksi)) {
                lDetail.add(d);
            }
        }
        return lDetail;
    }

    
}
