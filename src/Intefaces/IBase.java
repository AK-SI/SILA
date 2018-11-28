/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intefaces;

import java.util.ArrayList;

/**
 *
 * @author su
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
