
package swing;

import javax.swing.JFrame;

/**
 *
 * @author abdullah
 */
public class JFrame_ {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        //frame.setSize(500,400);
        //frame.setLocation(200,100);
        //frame.setLocationRelativeTo(null);
        frame.setBounds(200,100,400,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("Topu");
    }
 
}
