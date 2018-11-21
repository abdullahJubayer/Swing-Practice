/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author abdullah
 */
public class MessageDialog {
    public static void main(String[] args) {
        //showMessage return a void 
        JOptionPane.showMessageDialog(null, "4parameter Dialog", "warning", 2);
        ImageIcon img=new ImageIcon("25694.png");
        JOptionPane.showMessageDialog(null, "5_parameter Dialog", "hah", 0, img);
    }
}
