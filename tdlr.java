import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class tdlr {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TestUI1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
        JPanel jpl = new JPanel(new GridLayout(1,3,10,10));
        jpl.add(new JButton("btn_1"));
        outerPanel.add(btn_1);  `
        frame.add(outerPanel);
        //frame
    }
}
