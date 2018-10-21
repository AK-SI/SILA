/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Implements.ImDetailTransaksi;
import Implements.ImPaketLaundry;
import Implements.ImPelanggan;
import Implements.ImTransaksi;
import Intefaces.IDetailTransaksi;
import Intefaces.IPaketLaundry;
import Intefaces.IPelanggan;
import Intefaces.ITransaksi;
import Models.DetailTransaksi;
import Models.Transaksi;
import java.io.Serializable;

/**
 *
 * @author Rahmat Subekti
 */
public class Factory implements Serializable{
    private IPaketLaundry paketDAO;
    private IPelanggan pelangganDAO;
    private ITransaksi transaksiDAO;
    private IDetailTransaksi detailDAO;

    public Factory() {
        this.paketDAO = new ImPaketLaundry();
        this.pelangganDAO = new ImPelanggan();
        this.transaksiDAO = new ImTransaksi();
        this.detailDAO = new ImDetailTransaksi();
    }

    public IDetailTransaksi getDetailDAO() {
        return detailDAO;
    }
    
    public IPaketLaundry getPaketDAO() {
        return paketDAO;
    }

    public IPelanggan getPelangganDAO() {
        return pelangganDAO;
    }

    public ITransaksi getTransaksiDAO() {
        return transaksiDAO;
    }
    public boolean isUsed(String id){
        boolean dipake=false;
        for (Transaksi t:transaksiDAO.getAll()) {
            for (DetailTransaksi d:detailDAO.getAll())
                if (id.equals(d.getIdPaket())) dipake=true;
            if (id.equals(t.getIdPelanggan())) dipake=true;
        }
        return dipake;
    }
}
