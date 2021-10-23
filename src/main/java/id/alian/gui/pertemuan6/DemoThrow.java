/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.alian.gui.pertemuan6;

import java.lang.Exception;

/**
 *
 * @author alian
 */
public class DemoThrow {
       public static void main(String[] args) {
           RuntimeException r = new RuntimeException();
           
           System.out.println("Sebelum Throw");
           throw(r);
    }
}
