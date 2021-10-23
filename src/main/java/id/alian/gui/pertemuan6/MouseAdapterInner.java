/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.alian.gui.pertemuan6;

import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/**
 *
 * @author alian
 */
public class MouseAdapterInner extends JFrame{
    
    Label label;
    
    MouseAdapterInner(String title){
        super(title);
        label = new Label("Mouse adapter example");
        this.addMouseListener(new MouseAdapterListener());
    }
    
    class MouseAdapterListener extends MouseAdapter{
         public void mouseClick(MouseEvent e){
             label.setText("Mouse clicked");
         }
    }
    
    void launchFrame()
    {
        setSize(300, 300);
        setVisible(true);
    }    
    
    public static void main(String[] args) {
        MouseAdapterInner mai = new MouseAdapterInner("Mouse adapter app");
        mai.launchFrame();
    }
}
