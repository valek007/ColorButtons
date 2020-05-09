package com.colorbuttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorButtons {

    private JPanel panel;

    public static void main(String[] args) {

        new ColorButtons().go();
    }

    public void go(){

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500,200,400,300);
        frame.setResizable(false);
        frame.setVisible(true);

        panel = new JPanel();

        JButton redButton = new JButton("Red");
        JButton yellowButton = new JButton("Yellow");
        JButton greenButton = new JButton("Green");

        redButton.addActionListener(new FontColor(Color.red));
        yellowButton.addActionListener(new FontColor(Color.yellow));
        greenButton.addActionListener(new FontColor(Color.green));

        panel.add(redButton);
        panel.add(yellowButton);
        panel.add(greenButton);

        frame.add(panel);



    }

    class FontColor implements ActionListener{

        private Color fontColor;

        public FontColor(Color c){

            fontColor = c;
        }
        public void actionPerformed(ActionEvent e){

            panel.setBackground(fontColor);
        }
    }
}
