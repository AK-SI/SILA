/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;

/**
 *
 * @author Rahmat Subekti
 */
public class DetailTransaksi implements Serializable {
    String idTransaksi;
    String idPaket;
    Double jumlah;
    Double jumlahHarga;

    public DetailTransaksi(String idPaket, Double jumlah, Double jumlahHarga) {
        this.idPaket = idPaket;
        this.jumlah = jumlah;
        this.jumlahHarga = jumlahHarga;
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public String getIdPaket() {
        return idPaket;
    }

    public void setIdPaket(String idPaket) {
        this.idPaket = idPaket;
    }

    public Double getJumlah() {
        return jumlah;
    }

    public void setJumlah(Double jumlah) {
        this.jumlah = jumlah;
    }

    public Double getJumlahHarga() {
        return jumlahHarga;
    }

    public void setJumlahHarga(Double jumlahHarga) {
        this.jumlahHarga = jumlahHarga;
    }
    
}
