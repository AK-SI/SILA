/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

import Intefaces.IBase;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Generic Base class untuk mengimplementasikan logic dari setiap method
 * yang umum atau sering digunakan sehingga tidak perlu menulis method yang
 * sama berulang ulang untuk setiap tipe data yang berbeda
 * 
 * class ini mengimplementasikan generic interface IBase<T>
 * 
 * disini juga mengimplementasikan class Serializable karena kita tidak menggunakan 
 * database. Jadi nantinya setiap class turunan dapat di proses melalui i/o stream
 * 
 * parameter sesuai tipe data atau entity atau model 
 * yang akan buat logic-nya
 * 
 * @author su
 * @param <T>
 */
class BaseImpl<T> implements IBase<T>,Serializable{
    /**
     * menggunakan arraylist sesuai tipe atau model (T)
     * untuk menyimpan data list data object tertentu
     * 
     * list ini dapat di ekspose ke class turunan dan class lain di 
     * dalam paackage yang sama
     */
    protected ArrayList<T> rows = new ArrayList<>();
    
    @Override
    public boolean save(T object) {
        return rows.add(object);
    }

    /**
     * Menghapus object T dari list
     * 
     * @param id
     * @return 
     */
    @Override
    public boolean delete(Long id) {
        int i=0,index=-1;
        ArrayList<Integer> listIndex = new ArrayList<>();
        for(T object:rows){
            if (object.toString().equals(id.toString())) {
                listIndex.add(i);
                index=i;
            }
            i++;
        }
        if (index >-1){
            for (Object item:listIndex) {
                this.rows.remove((int)item);
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean update(T object) {
        int index =-1, i=0;
        for (T o:rows) {
            if (o.toString().equals(object.toString())) {
                index=i;
                break;
            }
            i++;
        }
        if (index >-1){
            this.rows.set(index, object);
            
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<T> getAll() {
        return this.rows;
    }

    @Override
    public T getById(Long id) {
        for (T object:rows ) {
            if (object.toString().equals(id.toString())) {
                return object;
            }
        }
        return null;
    }
    
}
