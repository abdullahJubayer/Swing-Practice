/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author abdullah
 */
public class J_Fram_Icon extends JFrame{
        private ImageIcon img;
        private Container c;
    public J_Fram_Icon(){
        c=this.getContentPane();
        c.setBackground(Color.RED);
                       img=new ImageIcon(getClass().getResource("pp.png"));
                this.setIconImage(img.getImage());
    }
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        //frame.setSize(500,400);
        //frame.setLocation(200,100);
        //frame.setLocationRelativeTo(null);
        frame.setBounds(200,100,400,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
 
}
