package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class MyButton extends JButton implements Observer{
    private Cube cube;
    private Viewer panel;
    private static int c = 0;
    private int q;

    public MyButton(Cube cube, Viewer panel){
//        this.setText("Add");


        c++;
        q = c;

        if (q == 1){
            this.setText("Norm");
            MyButtonListener listener = new MyButtonListener();
            this.addActionListener(listener);

        }
        if (q == 2){
            this.setText("Persp");
            MyButtonListener1 listener1 = new MyButtonListener1();
            this.addActionListener(listener1);

        }

        this.cube = cube;
        this.panel = panel;


    }

    public int getq(){return this.q;}

    @Override
    public void update(Observable o, Object arg) {

//        panel.setStr(counter.getCounter());

        panel.repaint();
    }

    private class MyButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            panel.setKof(1);
            panel.setVisible(false);
            panel.updateUI();
            panel.setVisible(true);
        }
    }

    private class MyButtonListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e){
            panel.setKof(2);
            panel.setVisible(false);
            panel.updateUI();
            panel.setVisible(true);
        }
    }
}
