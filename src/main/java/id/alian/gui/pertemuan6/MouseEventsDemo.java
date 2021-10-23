package id.alian.gui.pertemuan6;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.*;

/**
 *
 * @author alian
 */
public class MouseEventsDemo extends Frame implements MouseListener, MouseMotionListener{
    
    TextField tf;
    
    public MouseEventsDemo(String title){
        super(title);
        tf = new TextField(60);
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       String msg = "Mouse clicked";
       tf.setText(msg);
    }

    @Override
    public void mousePressed(MouseEvent e) {
       String msg = "Mouse clicked";
       tf.setText(msg);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       String msg = "Mouse released";
       tf.setText(msg);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        String msg = "Mouse entered component";
        tf.setText(msg);
    }

    @Override
    public void mouseExited(MouseEvent e) {
       String msg = "Mouse exited component";
       tf.setText(msg);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        String msg = "Mouse dragged at " + e.getX() + "," + e.getY();
        tf.setText(msg);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        String msg = "Mouse moved at " + e.getX() + "," + e.getY();
        tf.setText(msg);
    }
    
    public void launchFrame(){
        add(tf, BorderLayout.SOUTH);
        setSize(300, 300);
        setVisible(true);
    }
    
    
}
