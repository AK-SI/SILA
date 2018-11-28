/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

import Intefaces.ITransaksi;
import Models.Transaksi;
import java.util.ArrayList;

/**
 *
 * @author Rahmat Subekti
 */
public class TransaksiImpl extends BaseImpl<Transaksi> implements ITransaksi{

    public TransaksiImpl() {
    }
    
    @Override
    public ArrayList<Transaksi> getTransaksiByIDPelanggan(Long idPelanggan) {
        ArrayList<Transaksi> lTransaksi = new ArrayList<>();
        for (Transaksi t:rows) {
            if (t.getIdPelanggan().equals(idPelanggan)) {
                lTransaksi.add(t);
            }
        }
        return lTransaksi;
    }
    
}
