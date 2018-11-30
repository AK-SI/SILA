/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Rahmat Subekti
 */
public class Pelanggan extends ModelBase{
    private String nama;
    private String noTelpon;
    private String alamat;

    public Pelanggan() {
        super();
    }

    public Pelanggan(String nama, String noTelpon, String alamat) {
        super();
        this.nama = nama;
        this.noTelpon = noTelpon;
        this.alamat = alamat;
    }

    public Pelanggan(Long id,String nama, String noTelpon, String alamat) {
        super(id);
        this.nama = nama;
        this.noTelpon = noTelpon;
        this.alamat = alamat;
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
