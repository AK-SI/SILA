/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 * class ini akan mewarisi class ModelBase 
 */
public class DetailTransaksi extends ModelBase {
    Long idTransaksi;
    Long idPaket;
    Double jumlah;
    Double jumlahHarga;

    public DetailTransaksi(Long idPaket, Double jumlah, Double jumlahHarga) {
        this.idPaket = idPaket;
        this.jumlah = jumlah;
        this.jumlahHarga = jumlahHarga;
    }

    public Long getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(Long idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public Long getIdPaket() {
        return idPaket;
    }

    public void setIdPaket(Long idPaket) {
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
