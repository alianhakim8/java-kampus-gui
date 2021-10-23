/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.alian.gui.pertemuan6;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author alian
 */
public class DemoEksepsi3 {
    public static void main(String[] args) {
        try{
               File myFile = new File("test.txt");
               myFile.createNewFile();
               System.out.println("File berhasil dibuat");
        }catch(IOException e){
            System.out.println("File gagal dibuat");
        }
    }
}
