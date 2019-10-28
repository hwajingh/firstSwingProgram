package Triangle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TriangleTest extends JFrame implements ActionListener {

    JLabel head = new JLabel("Applet");
    Triangle applet = new Triangle(0);
    JPanel bottom = new JPanel();

    JLabel text = new JLabel("Enter an order: ");
    JTextField level = new JTextField("0");
    JButton start = new JButton("Start");

    public TriangleTest(){

        super("Applet Viewer");
        setSize(550, 550);
        setLayout(new BorderLayout());

        add(head,BorderLayout.NORTH);
        add(applet,BorderLayout.CENTER);
        add(bottom,BorderLayout.SOUTH);

        bottom.setLayout(new GridLayout(1,3));
        start.addActionListener(this);

        bottom.add(text);
        bottom.add(level);
        bottom.add(start);
    }


    public static void main(String[] args) {
        TriangleTest window = new TriangleTest();
        window.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch(e.getActionCommand()){
            case "Start":

                int newLevel = Integer.parseInt(level.getText());
                Triangle newTriangle = new Triangle(newLevel);
                add(newTriangle,BorderLayout.CENTER);
                repaint();
                break;
        }
    }
}

