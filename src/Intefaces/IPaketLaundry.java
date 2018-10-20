/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intefaces;

import Models.PaketLaundry;
import java.util.ArrayList;

/**
 *
 * @author Rahmat Subekti
 */
public interface IPaketLaundry {
    public boolean save(PaketLaundry paket);
    public boolean delete(String idPaket);
    public boolean update(PaketLaundry paket);
    public PaketLaundry getPaketById(String idPaket);
    public ArrayList<PaketLaundry> getPaketByName(String namaPaket);
    public ArrayList<PaketLaundry> getAll();
}
