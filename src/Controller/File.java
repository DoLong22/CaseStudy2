/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.*;
import java.io.*;
public class File {
    public void WriteFile(List list, String path){
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for(Object o: list){
                oos.writeObject(o);
            }
            oos.close();
            fos.close();
        } catch (Exception e) {
        }
    }
    public List ReadFile(String path){
        List list = new ArrayList<>();
        FileInputStream fis;
        try {
            fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            boolean check = true;
            while(check){
                Object o = ois.readObject();
                if(o == null){
                    check = false;
                }
                else{
                    list.add(o);
                }
            }
            fis.close();
            ois.close();
        } catch (Exception e) {
        }
        return list;
    }
            
}
