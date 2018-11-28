/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intefaces;

import Models.Transaksi;
import java.util.ArrayList;

/**
 *
 * @author Rahmat Subekti
 */
public interface ITransaksi extends IBase<Transaksi>{
    public ArrayList<Transaksi> getTransaksiByIDPelanggan(Long idPelanggan);
}
