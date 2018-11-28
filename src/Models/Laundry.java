/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Implements.*;
import Intefaces.IDetailTransaksi;
import Intefaces.IPaketLaundry;
import Intefaces.IPelanggan;
import Intefaces.ITransaksi;

/**
 *
 * @author su
 */
public class Laundry extends ModelBase{
    
    private IPaketLaundry paket;
    private IPelanggan pelanggan;
    private ITransaksi transaksi;
    private IDetailTransaksi detail;

    public Laundry() {
        this.paket = new PaketLaundryImpl();
        this.pelanggan = new PelangganImpl();
        this.transaksi = new TransaksiImpl();
        this.detail = new DetailTransaksiImpl();
    }

    public IPaketLaundry getPaket() {
        return paket;
    }

    public void setPaket(IPaketLaundry paket) {
        this.paket = paket;
    }

    public IPelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(IPelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public ITransaksi getTransaksi() {
        return transaksi;
    }

    public void setTransaksi(ITransaksi transaksi) {
        this.transaksi = transaksi;
    }

    public IDetailTransaksi getDetail() {
        return detail;
    }

    public void setDetail(IDetailTransaksi detail) {
        this.detail = detail;
    }
    
}
