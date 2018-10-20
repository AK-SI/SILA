/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intefaces;

import Models.Pelanggan;
import java.util.ArrayList;

/**
 *
 * @author Rahmat Subekti
 */
public interface IPelanggan {
    public boolean save(Pelanggan pelanggan);
    public boolean delete(String idPelanggan);
    public boolean update(Pelanggan pelanggan);
    public Pelanggan getPelangganById(String idPelanggan);
    public ArrayList<Pelanggan> getPelangganByName(String namaPelanggan);
    public ArrayList<Pelanggan> getAll();
}
