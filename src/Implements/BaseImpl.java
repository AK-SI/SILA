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
 *
 * @author su
 * @param <T>
 */
class BaseImpl<T> implements IBase<T>,Serializable{

    protected ArrayList<T> rows = new ArrayList<>();
    
    @Override
    public boolean save(T object) {
        return rows.add(object);
    }

    @Override
    public boolean delete(Long id) {
        int i=0,ketemu=-1;
        ArrayList<Integer> listIndex = new ArrayList<>();
        for(T object:rows){
            if (object.toString().equals(id.toString())) {
                listIndex.add(i);
                ketemu=i;
            }
            i++;
        }
        if (ketemu !=-1){
            for (Object index:listIndex) {
                this.rows.remove((int)index);
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean update(T object) {
        int index =0, i=0,ketemu=0;
        for (T o:rows) {
            if (o.toString().equals(object.toString())) {
                index=i;
                ketemu = 1;
            }
            i++;
        }
        if (ketemu !=0){
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
