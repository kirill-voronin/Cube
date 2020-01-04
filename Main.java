package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;

public class Main extends JFrame{

    public Main(){
        this.setTitle("MVC");
        this.setSize(1000, 1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container pane = this.getContentPane();
        pane.setLayout(new GridBagLayout());
        GridBagConstraints grid = new GridBagConstraints();
        Cube cube = new Cube();
        Viewer panel = new Viewer(cube);
        MyButton button = new MyButton(cube, panel);
        MyButton button1 = new MyButton(cube, panel);
        MyScroll verScroll = new MyScroll(Scrollbar.VERTICAL,0,-360,360, cube, panel);
        MyScroll horScroll = new MyScroll(Scrollbar.HORIZONTAL,0,-360,360,cube,panel);


        cube.addObserver(button);

        grid.fill = GridBagConstraints.BOTH;
        grid.anchor = GridBagConstraints.CENTER;
        grid.weightx = 0.5;
        grid.weighty = 0.07;
        grid.gridx = 0;
        grid.gridy = 0;
        add(button,grid);
        grid.weightx = 0.5;
        grid.gridx = 1;
        grid.gridy = 0;
        add(button1,grid);
        grid.weighty = 1;
        grid.weightx = 1;
        grid.gridwidth = 2;
        grid.gridx = 0;
        grid.gridy = 1;
        add(panel,grid);
        grid.gridx = 0;
        grid.gridy = 2;
        grid.weighty = 0.01;
        grid.weightx = 0.01;
        add(horScroll,grid);
        grid.gridx = 2;
        grid.gridy = 1;
        grid.weighty = 0.01;
        grid.weightx = 0.01;
        add(verScroll,grid);



        this.setVisible(true);
    }



    public static void main(String[] args) {
//	    R3Vector a = new R3Vector(10,0,0);
//	    a.out();
//	    a.sum(a).sum(a).out();
//	    R3Vector.sum(a,a).out();
//		a.scale(5);
//		a.translate(5,5,5);
//		R3Vector.scalarProduct(a,a);
//		R3Vector.vectorProduct(a,a).out();
//		a.turnZ(90).out();
//		a.turn(15,90,11).out();
//		Fcet f = new Fcet(new R3Vector(0,0,0),
//						new R3Vector(0,1,0),
//						new R3Vector(1,1,0),
//						new R3Vector(1,0,0));
//		f.show();
//		f.rotate(0,0,90);
//		f.show();
//		f.scaleFacet(5);
//		f.show();
//		f.translateFacet(5,5,5);
//		f.show();

//		c.scaleCube(5);
//		c.translateCube(5,5,5);
//		c.showCube();

//        Cube c = new Cube();
//      c.scaleCube(100);
//       c.translateCube(-50,-50,-50);
//        c.rotateCube(125,0,40);
//		Viewer v = new Viewer(c);
    new Main();
    }



}
