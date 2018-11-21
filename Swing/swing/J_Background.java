/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author abdullah
 */
public class J_Background extends JFrame {
    private  Container c;
    public J_Background() {
        c=this.getContentPane();
        c.setBackground(Color.red);
    } 
    public static void main(String[] args) {
        JFrame j=new JFrame();
        j.setVisible(true);
        j.setBounds(100, 50, 400,500);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
