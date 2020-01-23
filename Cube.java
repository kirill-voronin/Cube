package com.company;

import java.awt.*;
import java.util.Observable;

public class Cube  extends Observable {
    private Fcet[] facets;
    public Cube(){
        facets = new Fcet[6];
//        facets[0] = new Fcet(new R3Vector(0,0,0),
//                new R3Vector(1,0,0),
//                new R3Vector(1,1,0),
//                new R3Vector(0,1,0),
//                Color.red);
//        facets[1] = new Fcet(new R3Vector(1,0,1),
//                new R3Vector(1,1,1),
//                new R3Vector(1,1,0),
//                new R3Vector(1,0,0),
//                Color.blue);
//        facets[2] = new Fcet(new R3Vector(0,0,1),
//                new R3Vector(0,1,1),
//                new R3Vector(1,1,1),
//                new R3Vector(1,0,1),
//                Color.green);
//        facets[3] = new Fcet(new R3Vector(0,0,0),
//                new R3Vector(0,1,0),
//                new R3Vector(0,1,1),
//                new R3Vector(0,0,1),
//                Color.yellow);
//        facets[4] = new Fcet(new R3Vector(0,1,1),
//                new R3Vector(0,1,0),
//                new R3Vector(1,1,0),
//                new R3Vector(1,1,1),
//                Color.gray);
//
//        facets[5] = new Fcet(new R3Vector(0,0,1),
//                new R3Vector(0,0,0),
//                new R3Vector(1,0,0),
//                new R3Vector(1,0,1),
//                Color.magenta);
        facets[0]= new Fcet( new R3Vector(0,0,0), new R3Vector(1,0,0),new R3Vector(1,1,0),new R3Vector(0,1,0), Color.RED);
//правая
        facets[1]= new Fcet( new R3Vector(1,0,0), new R3Vector(1,0,1),new R3Vector(1,1,1),new R3Vector(1,1,0), Color.BLUE);
//нижняя
        facets[2]= new Fcet( new R3Vector(1,0,1), new R3Vector(1,0,0),new R3Vector(0,0,0),new R3Vector(0,0,1), Color.BLACK);
//левая
        facets[3]= new Fcet( new R3Vector(0,0,0), new R3Vector(0,1,0),new R3Vector(0,1,1),new R3Vector(0,0,1), Color.GREEN);
//сверху
        facets[4]= new Fcet( new R3Vector(0,1,0), new R3Vector(1,1,0),new R3Vector(1,1,1),new R3Vector(0,1,1), Color.YELLOW);
//передняя
        facets[5]= new Fcet( new R3Vector(0,1,1), new R3Vector(1,1,1),new R3Vector(1,0,1),new R3Vector(0,0,1), Color.ORANGE);
    }



    public void showCube(){
        for (int i = 0;i < facets.length;i++) {
            facets[i].show();
        }
    }

    public void translateCube(double dx, double dy, double dz){
        for (int i = 0; i < facets.length;i++){
            facets[i].translateFacet(dx,dy,dz);
        }
    }

    public  void scaleCube(double k) {
        for (int i = 0; i < facets.length; i++) {
            facets[i].scaleFacet(k);

        }
    }

    public void rotateCube(double ux,
                           double uy,
                           double uz){
        for (int i = 0; i < facets.length; i++){
            facets[i].rotate(ux,uy,uz);

        }

    }

    public void draw(Graphics2D g){
        for (int i = 0; i < facets.length;i++){
            if (facets[i].normalFace() > 0){
                facets[i].draw(g);
            }
        }

    }

    public void perpdraw(Graphics2D g){

        for (int i = 0; i < facets.length;i++){
            if (facets[i].normalFacePerp() > 0){
                facets[i].perpdrawFcet(g);
            }
        }

    }


}


