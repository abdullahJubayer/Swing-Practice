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
public class ShowOptionDialog {
    public static void main(String[] args) {
        //showConfirmDialog return a int value
        JOptionPane.showConfirmDialog(null, "2_parameter");
        JOptionPane.showConfirmDialog(null, "4_parameter", "title",JOptionPane.YES_OPTION);
        JOptionPane.showConfirmDialog(null,"5_parameter","title",JOptionPane.YES_NO_OPTION,-1);
    }
}
