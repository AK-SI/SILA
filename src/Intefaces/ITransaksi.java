/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intefaces;

import Models.Transaksi;
import java.util.ArrayList;


/**
 * Mewarisi interface class IBase
 * Menggunakan parameter Transaksi sebagai tipe datanya atau
 * modelnya untuk menyesuaikan tipe data pada super class
 * 
 */
public interface ITransaksi extends IBase<Transaksi>{
    public ArrayList<Transaksi> getTransaksiByIDPelanggan(Long idPelanggan);
}
