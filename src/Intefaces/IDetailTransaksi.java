/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intefaces;

import Models.DetailTransaksi;
import java.util.ArrayList;

/**
 *
 * @author Rahmat Subekti
 */
public interface IDetailTransaksi {
    public boolean save(DetailTransaksi detail);
    public ArrayList<DetailTransaksi> getAll();
    public ArrayList<DetailTransaksi> getDetail(String idTransaksi);
}
