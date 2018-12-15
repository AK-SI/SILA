/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;


/**
 * class ini akan mewarisi class ModelBase 
 */
public class PaketLaundry extends ModelBase{
    private String namaPaket;
    private int tarif;
    private String satuan;
    
    
    /**
     * Memanggil super constructor untuk membuat id secara otomatis
     */
    public PaketLaundry() {
        super();
    }

    /**
     * Memanggil super constructor untuk membuat id secara otomatis
     */
    public PaketLaundry(String namaPaket, int tarif, String satuan) {
        super();
        this.namaPaket = namaPaket;
        this.tarif = tarif;
        this.satuan = satuan;
    }

    public PaketLaundry(Long id,String namaPaket, int tarif, String satuan) {
        super(id);
        this.namaPaket = namaPaket;
        this.tarif = tarif;
        this.satuan = satuan;
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
