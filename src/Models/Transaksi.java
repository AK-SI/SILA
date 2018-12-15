/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Date;

/**
 *
 * @author Rahmat Subekti
 */
public class Transaksi extends ModelBase{
    private Long idPelanggan;
    private double totalHarga;
    private Date tanggal;

    public Transaksi(Long idPelanggan, String idPaket, double totalHarga) {
        this.idPelanggan=idPelanggan;
        this.totalHarga=totalHarga;
        this.tanggal  = new Date();
    }

    /**
     * Memanggil super constructor untuk membuat id secara otomatis
     */
    public Transaksi() {
        super();
    }

    public Long getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(Long idPelanggan) {
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
