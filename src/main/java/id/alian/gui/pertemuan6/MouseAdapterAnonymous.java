/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.alian.gui.pertemuan6;

import java.awt.Label;
import javax.swing.JFrame;

/**
 *
 * @author alian
 */
public class MouseAdapterAnonymous extends JFrame{
    Label label;
    
    MouseAdapterAnonymous(String title){
        super(title);
        label = new Label("Mouse Adapter Anonymouse");
        
    }
    
    void launchFrame(){
        setSize(300, 300);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        MouseAdapterAnonymous maa = new MouseAdapterAnonymous("Mouse adapter anonym app");
        maa.launchFrame();
    }
    
}
