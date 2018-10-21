/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author Rahmat Subekti
 */
public class PaketLaundry implements Serializable{
    private String idPaket;
    private String namaPaket;
    private int tarif;
    private String satuan;

    public PaketLaundry(String idPaket, String namaPaket, int tarif, String satuan) {
        this.idPaket = idPaket;
        this.namaPaket = namaPaket;
        this.tarif = tarif;
        this.satuan = satuan;
    }

    public PaketLaundry(String namaPaket, int tarif, String satuan) {
        this.idPaket = UUID.randomUUID().toString();
        this.namaPaket = namaPaket;
        this.tarif = tarif;
        this.satuan = satuan;
    }

    public PaketLaundry() {
    }
    
    public String getIdPaket() {
        return idPaket;
    }

    public String getNamaPaket() {
        return namaPaket;
    }

    public void setNamaPaket(String namaPaket) {
        this.namaPaket = namaPaket;
    }

    public int getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }
    
    
}
