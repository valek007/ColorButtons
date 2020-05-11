package com.colorbuttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorButtons {

    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
        frame.setVisible(true);

    }

    static class MyFrame extends JFrame{

        MyPanel panel = new MyPanel();

        public MyFrame() {
            setBounds(500, 200, 400, 300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setResizable(false);
            add(panel);
        }
    }

    static class MyPanel extends JPanel {

        JButton buttonRed = new JButton("Red");
        JButton buttonYellow = new JButton("Yellow");
        JButton buttonGreen = new JButton("Green");

        FontColor redColor = new FontColor(Color.red);
        FontColor yellowColor = new FontColor(Color.yellow);
        FontColor greenColor = new FontColor(Color.green);

        public MyPanel() {

            buttonRed.addActionListener(redColor);
            buttonYellow.addActionListener(yellowColor);
            buttonGreen.addActionListener(greenColor);

            add(buttonRed);
            add(buttonYellow);
            add(buttonGreen);

        }

        class FontColor implements ActionListener {

            private Color fontColor;

            public FontColor(Color c) {

                fontColor = c;
            }

            @Override
            public void actionPerformed(ActionEvent e) {

                setBackground(fontColor);
            }
        }
    }
}
