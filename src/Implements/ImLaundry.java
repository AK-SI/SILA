/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

import Models.Laundry;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author su
 */
public class ImLaundry<T>{
    private Laundry data = new Laundry();
    public ArrayList<T> Get(){
        data = Read();
        T g = (T) new Object();
        return (ArrayList<T>) data.getData(g.getClass().getSimpleName());
    }
    
    public void Set(ArrayList<T> l){
        T s = (T) new Object();
        data.setData(s.getClass().getSimpleName(), (ArrayList<Object>) l);
        Write(data);
    }
    
    public boolean isEmpty() {
        return new File("data.laundry").isFile();
    }

    private void Write(Laundry l) {
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
    
    private Laundry Read() {
        if (!isEmpty()) {
            try {
                // read object from file
                FileInputStream fis = new FileInputStream("data.laundry");
                ObjectInputStream ois = new ObjectInputStream(fis);
                data = (Laundry) ois.readObject();
                ois.close();
                return data;
            } catch (FileNotFoundException e) {
                Write(data);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return new Laundry();
    }
    
}
