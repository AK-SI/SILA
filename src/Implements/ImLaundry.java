/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

import Intefaces.ILaundry;
import Models.Laundry;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author su
 */
public class ImLaundry implements ILaundry{
    private Laundry l;

    public ImLaundry() {
        this.l = Open();
    }
    
    @Override
    public void Save() {
        try {
            // write object to file
            FileOutputStream fos = new FileOutputStream("data.laundry");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(l);
            oos.close();
	} catch (FileNotFoundException e) {
            e.printStackTrace();
	} catch (IOException e) {
            e.printStackTrace();
	}
    }


    @Override
    public boolean isLaundry() {
        return new File("data.laundry").isFile();
    }

    @Override
    public Laundry Read() {
        return this.l;
    }
    
    private Laundry Open() {
        Laundry data=new Laundry();
        if (isLaundry()) {
            try {
                // read object from file
                FileInputStream fis = new FileInputStream("data.laundry");
                ObjectInputStream ois = new ObjectInputStream(fis);
                data = (Laundry) ois.readObject();
                ois.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return data;
    }
}
