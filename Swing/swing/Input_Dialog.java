/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import javax.swing.JOptionPane;

/**
 *
 * @author abdullah
 */
public class Input_Dialog {
    public static void main(String[] args) {
        //showInput method  return a String
        JOptionPane.showInputDialog("1_parameter :");
                JOptionPane.showInputDialog("2_parameter :","Name");
                JOptionPane.showInputDialog(null,"3_parameter :","Input");
        JOptionPane.showInputDialog(null,"4_parameter :","Box",JOptionPane.INFORMATION_MESSAGE);
    }
}
