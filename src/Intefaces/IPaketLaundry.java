/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intefaces;

import Models.PaketLaundry;
import java.util.ArrayList;


/**
 * Mewarisi interface class IBase
 * Menggunakan parameter PaketLaundry sebagai tipe datanya atau
 * modelnya untuk menyesuaikan tipe data pada super class
 * 
 */
public interface IPaketLaundry extends IBase<PaketLaundry>{
    public ArrayList<PaketLaundry> getPaketByName(String namaPaket);
}
