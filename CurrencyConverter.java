package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class CurrencyConverter implements ActionListener {

    ImageIcon ron,eur,yen,usd, frameIcon;
    JTextArea input;
    JButton convert;
    JLabel convertFrom,convertTo, result;
    JComboBox transform, transformTo;



    CurrencyConverter(){
        frameIcon = new ImageIcon("currencyIcons/frame.png");
        ron = new ImageIcon("currencyIcons/ron.png");
        eur = new ImageIcon("currencyIcons/eur.png");
        yen = new ImageIcon("currencyIcons/yen.png");
        usd = new ImageIcon("currencyIcons/usd.png");
        ImageIcon[] icons = {eur, ron, yen, usd};



        input = new JTextArea();
        input.setBackground(Color.BLACK);
        input.setForeground(Color.WHITE);
        input.setBounds(130,100,150,35);
        input.setBorder(BorderFactory.createLineBorder(Color.white,1));
        input.setFont(new Font("Cambria", Font.PLAIN,16));

        convert = new JButton("Convert");
        convert.addActionListener(this);
        convert.setBounds(215,200,200,55);
        convert.setBackground(Color.black);
        convert.setForeground(Color.white);
        convert.setFocusable(false);
        convert.setFont(new Font("Cambria", Font.PLAIN,28));

        result = new JLabel();
        result.setBounds(345,100,150,35);
        result.setBorder(BorderFactory.createLineBorder(Color.white,1));
        result.setFont(new Font("Cambria", Font.PLAIN,16));
        result.setForeground(Color.white);

        convertFrom = new JLabel();
        convertFrom.setText("Convert from : ");
        convertFrom.setBounds(50,50,250,50);
        convertFrom.setFont(new Font("Cambria", Font.PLAIN,28));
        convertFrom.setForeground(Color.white);

        convertTo = new JLabel();
        convertTo.setText("Convert to : ");
        convertTo.setBounds(430,50,250,50);
        convertTo.setFont(new Font("Cambria", Font.PLAIN,28));
        convertTo.setForeground(Color.white);

        transform = new JComboBox( icons);
        transform.setBounds(50,100,75,35);
        styleDrop(transform);

        transformTo = new JComboBox(icons);
        transformTo.setBounds(500,100,75,35);
        styleDrop(transformTo);

        Frame frame = new Frame("Currency Converter",650,350);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setIconImage(frameIcon.getImage());
        frame.add(input);
        frame.add(result);
        frame.add(convert);
        frame.add(convertTo);
        frame.add(convertFrom);
        frame.add(transform);
        frame.add(transformTo);


    }

    public void styleDrop(JComboBox combo){ //Used for styling both JComboBoxes to avoid repeating code
        combo.setBackground(Color.black);
        combo.setForeground(Color.white);
        combo.setFocusable(false);
        combo.setBorder(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==convert){
            //RON
            if(transform.getSelectedItem() == ron && transformTo.getSelectedItem()== eur){
                Float resultF = Float.parseFloat(input.getText()) * 0.20f; // 0.20 is the euro value as of february 2022
                result.setText(resultF.toString());
            }
            if(transform.getSelectedItem() == eur && transformTo.getSelectedItem()== ron){
                Float resultF = Float.parseFloat(input.getText()) * 4.95f;
                result.setText(resultF.toString());
            }
            if(transform.getSelectedItem() == ron && transformTo.getSelectedItem()== usd){
                Float resultF = Float.parseFloat(input.getText()) * 0.23f;
                result.setText(resultF.toString());
            }
            if(transform.getSelectedItem() == usd && transformTo.getSelectedItem()== ron){
                Float resultF = Float.parseFloat(input.getText()) * 4.31f;
                result.setText(resultF.toString());
            }
            if(transform.getSelectedItem() == ron && transformTo.getSelectedItem()== yen){
                Float resultF = Float.parseFloat(input.getText()) * 26.89f;
                result.setText(resultF.toString());
            }
            if(transform.getSelectedItem() == yen && transformTo.getSelectedItem()== ron){
                Float resultF = Float.parseFloat(input.getText()) * 0.037f;
                result.setText(resultF.toString());
            }
            //EUR
            if(transform.getSelectedItem() == eur && transformTo.getSelectedItem()== usd){
                Float resultF = Float.parseFloat(input.getText()) * 1.15f;
                result.setText(resultF.toString());
            }
            if(transform.getSelectedItem() == usd && transformTo.getSelectedItem()== eur){
                Float resultF = Float.parseFloat(input.getText()) * 0.87f;
                result.setText(resultF.toString());
            }
            if(transform.getSelectedItem() == eur && transformTo.getSelectedItem()== yen){
                Float resultF = Float.parseFloat(input.getText()) * 132.98f;
                result.setText(resultF.toString());
            }
            if(transform.getSelectedItem() == yen && transformTo.getSelectedItem()== eur){
                Float resultF = Float.parseFloat(input.getText()) * 0.00757586f;
                result.setText(resultF.toString());
            }
            //USD
            if(transform.getSelectedItem() == usd && transformTo.getSelectedItem()== yen){
                Float resultF = Float.parseFloat(input.getText()) * 115.95f;
                result.setText(resultF.toString());
            }
            if(transform.getSelectedItem() == yen && transformTo.getSelectedItem()== usd){
                Float resultF = Float.parseFloat(input.getText()) * 0.0086f;
                result.setText(resultF.toString());
            }

            //Both same value
            if(transform.getSelectedItem() == yen && transformTo.getSelectedItem()== yen){
                result.setText(input.getText());
            }
            if(transform.getSelectedItem() == usd && transformTo.getSelectedItem()== usd){
                result.setText(input.getText());
            }
            if(transform.getSelectedItem() == ron && transformTo.getSelectedItem()== ron){
                result.setText(input.getText());
            }
            if(transform.getSelectedItem() == eur && transformTo.getSelectedItem()== eur){
                result.setText(input.getText());
            }

        }

    }

}
