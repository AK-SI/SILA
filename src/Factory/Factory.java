/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Implements.DetailTransaksiImpl;
import Implements.ImLaundry;
import Implements.PaketLaundryImpl;
import Implements.PelangganImpl;
import Implements.TransaksiImpl;
import Models.Laundry;
import Intefaces.IDetailTransaksi;
import Intefaces.IPaketLaundry;
import Intefaces.IPelanggan;
import Intefaces.ITransaksi;
import Models.DetailTransaksi;
import Models.Transaksi;

/**
 *
 * @author Rahmat Subekti
 */
public class Factory{
    private IPaketLaundry paketDAO;
    private IPelanggan pelangganDAO;
    private ITransaksi transaksiDAO;
    private IDetailTransaksi detailDAO;

    public Factory() {
        this.paketDAO = new PaketLaundryImpl();
        this.pelangganDAO = new PelangganImpl();
        this.transaksiDAO = new TransaksiImpl();
        this.detailDAO = new DetailTransaksiImpl();
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
    public boolean isUsed(Long id){
        boolean dipake=false;
        for (Transaksi t:transaksiDAO.getAll()) {
            for (DetailTransaksi d:detailDAO.getAll())
                if (id.equals(d.getIdPaket())) dipake=true;
            if (id.equals(t.getIdPelanggan())) dipake=true;
        }
        return dipake;
    }
    
    public void Close(){
        
    }
}
