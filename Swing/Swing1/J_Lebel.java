
package Swing1;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;

public class J_Lebel extends JFrame {
    private Container c;
    public J_Lebel() {
      getm();
    }
    public void getm(){
     c=this.getContentPane();
     c.setBackground(Color.red);
    }
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 600);
    }
}
