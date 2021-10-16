/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.alian.gui.pertemuan5;

import javax.swing.JFrame;

/**
 *
 * @author ASUS
 */
public class FrameBeraksi2 extends JFrame {
    public FrameBeraksi2(){
        super("Frame Beraksi 2");
        setSize(300, 100);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        FrameBeraksi2 frame = new FrameBeraksi2();
    }
}
