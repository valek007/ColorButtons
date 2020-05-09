package com.colorbuttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ColorButtons{

    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
    }

    static class MyFrame extends JFrame{

        public MyFrame() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(500, 200, 400, 300);
            setResizable(false);
            setVisible(true);

            MyPanel panel = new MyPanel();
            add(panel);
        }

    }

    static class MyPanel extends JPanel{

        public MyPanel(){

            JButton buttonRed = new JButton("Red");
            JButton buttonYellow = new JButton("Yellow");
            JButton buttonBlue = new JButton("Blue");

        }

    }
}