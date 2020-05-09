package com.colorbuttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorButtons {

    public static void main(String[] args) {

        new MyFrame();
    }

    static class MyFrame extends JFrame{

        public MyFrame() throws HeadlessException {

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(600,200,500,300);
            setResizable(false);
            setVisible(true);

            MyPanel panel = new MyPanel();
            add(panel);
        }

    }
    static class MyPanel extends JPanel implements ActionListener{

        JButton buttonRed = new JButton("Red");
        JButton buttonYellow = new JButton("Yellow");
        JButton buttonGreen= new JButton("Green");


        public MyPanel() {
            add(buttonRed);
            add(buttonYellow);
            add(buttonGreen);

            buttonRed.addActionListener(this);
            buttonYellow.addActionListener(this);
            buttonGreen.addActionListener(this);


        }
        @Override
        public void actionPerformed(ActionEvent e) {

            Object obj = e.getSource();

            if(obj.equals(buttonRed)) setBackground(Color.red);
            else if (obj.equals(buttonYellow)) setBackground(Color.yellow);
            else if (obj.equals(buttonGreen)) setBackground(Color.green);

        }

    }
}
