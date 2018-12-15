/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intefaces;

import java.util.ArrayList;

/**
 * generic Base interface untuk logic aplikasi
 * interface class untuk mengabstaksi method (Logic aplikasi)
 * Mengunakan parameter untuk menyesuaikan dengan tipe data 
 * atau model yang digunakan 
 * 
 * Object
 * @param <T>
 */
public interface IBase<T> {
    public boolean save(T object);
    public boolean delete(Long id);
    public boolean update(T object);
    public ArrayList<T> getAll();
    public T getById(Long id);
    
}
