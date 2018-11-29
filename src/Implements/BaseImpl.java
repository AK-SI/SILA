/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

import Intefaces.IBase;
import Models.Laundry;
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
        int i=0,index=-1;
        ArrayList<Integer> listIndex = new ArrayList<>();
        for(T object:rows){
            if (object.toString().equals(id.toString())) {
                listIndex.add(i);
                index=i;
            }
            i++;
        }
        if (index !=-1){
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
        if (index !=-1){
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
