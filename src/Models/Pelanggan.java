/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.UUID;

/**
 *
 * @author Rahmat Subekti
 */
public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private String noTelpon;
    private String alamat;

    public Pelanggan(String idPelanggan, String nama, String noTelpon, String alamat) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.noTelpon = noTelpon;
        this.alamat = alamat;
    }

    public Pelanggan(String nama, String noTelpon, String alamat) {
        this.idPelanggan = UUID.randomUUID().toString();
        this.nama = nama;
        this.noTelpon = noTelpon;
        this.alamat = alamat;
    }

    public Pelanggan() {
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoTelpon() {
        return noTelpon;
    }

    public void setNoTelpon(String noTelpon) {
        this.noTelpon = noTelpon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    
}
