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
public interface IPelanggan extends IBase<Pelanggan>{
    public ArrayList<Pelanggan> getPelangganByName(String namaPelanggan);
}
