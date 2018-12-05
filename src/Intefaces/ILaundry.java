/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intefaces;

import Models.Laundry;

/**
 *
 * @author su
 */
public interface ILaundry {
    
    public void Save();
    public Laundry Read();
    public boolean isLaundry();
}
