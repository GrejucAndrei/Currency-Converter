package com.company;


import javax.swing.JFrame;
import java.awt.Dimension;

public class Frame extends JFrame {

    int width;
    int height;
    String title;

    Frame(){
        this.width = 0;
        this.height = 0;
        this.title = null;
    }

    Frame(String title,int width, int height){
        this.width = width;
        this.height = height;
        this.title = title;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(width,height));
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setTitle(title);
        this.setResizable(false);
        this.setVisible(true);
    }

}
