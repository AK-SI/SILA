/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import static Factory.GenId.GenId;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Rahmat Subekti
 */
public class Transaksi implements Serializable{
    private String idTransaksi;
    private String idPelanggan;
    private double totalHarga;
    private Date tanggal;

    public Transaksi(String idPelanggan, String idPaket, double totalHarga) {
        this.idTransaksi = "TL"+ GenId();
        this.idPelanggan=idPelanggan;
        this.totalHarga=totalHarga;
        this.tanggal  = new Date();
    }

    public Transaksi() {
        this.idTransaksi = "TL"+ GenId();
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal() {
        this.tanggal = new Date();
    }

}
