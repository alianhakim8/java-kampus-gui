/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.alian.gui.pertemuan6;

import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author alian
 */
public class CloseFrameAnonymous extends JFrame {
    Label label;
    
    CloseFrameAnonymous(String title){
        super(title);
        label = new Label("Close the frame");
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e ){
                dispose();
                System.exit(1);
            }
        });
    }
    
    void launchFrame(){
        setSize(300, 300);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        CloseFrameAnonymous cfa = new CloseFrameAnonymous("Close Frame Example");
        cfa.launchFrame();
    }
}
