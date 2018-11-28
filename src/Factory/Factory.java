/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Implements.ImLaundry;
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
    private Laundry data;
    private IPaketLaundry paketDAO;
    private IPelanggan pelangganDAO;
    private ITransaksi transaksiDAO;
    private IDetailTransaksi detailDAO;

    public Factory() {
        this.data= new ImLaundry().Read();
        this.paketDAO = data.getPaket();
        this.pelangganDAO = data.getPelanggan();
        this.transaksiDAO = data.getTransaksi();
        this.detailDAO = data.getDetail();
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
        new ImLaundry().Save(data);
    }
}
