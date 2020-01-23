package com.company;

import java.awt.*;
import java.awt.geom.Path2D;

public class Fcet {
    private R3Vector[] vertex;
    private Color color;
    public Fcet(R3Vector v1,
                R3Vector v2,
                R3Vector v3,
                R3Vector v4,
                Color color){
        vertex = new R3Vector[4];
        vertex[0] = v1;
        vertex[1] = v2;
        vertex[2] = v3;
        vertex[3] = v4;
        this.color = color;
    }

    public void show(){
        for (int i = 0;i < vertex.length;i++) {
            vertex[i].out();
        }
    }

    public void rotate(double ux,
                       double uy,
                       double uz){
        for (int i = 0; i < vertex.length; i++){
            vertex[i].turn(ux,uy,uz);

        }
    }

    public void translateFacet(double dx, double dy, double dz){
        for (int i = 0; i < vertex.length;i++){
            vertex[i].translate(dx,dy,dz);
        }
    }

    public  void scaleFacet(double k){
        for (int i = 0; i < vertex.length;i++){
            vertex[i].scale(k);
        }
    }

    public double normalFace(){
        R3Vector a = new R3Vector(vertex[1].getX() - vertex[0].getX(), vertex[1].getY()-vertex[0].getY(), vertex[1].getZ() - vertex[0].getZ());
        R3Vector b = new R3Vector(vertex[2].getX() - vertex[1].getX(), vertex[2].getY()-vertex[1].getY(), vertex[2].getZ() - vertex[1].getZ());
        return R3Vector.vectorProduct(a,b).getZ()*(-1);
    }

    public double normalFacePerp(){
        double c = 600;
        double t1 = -c/(vertex[0].getZ()-c);
        double t2= -c/(vertex[1].getZ()-c);
        double t3 = -c/(vertex[2].getZ()-c);
        double t4 = -c/(vertex[3].getZ()-c);
        R3Vector a = new R3Vector(vertex[1].getX()*t2 - vertex[0].getX()*t1, vertex[1].getY()*t2-vertex[0].getY()*t1, vertex[1].getZ()*t2 - vertex[0].getZ()*t1);
        R3Vector b = new R3Vector(vertex[2].getX()*t3 - vertex[1].getX()*t2, vertex[2].getY()*t3-vertex[1].getY()*t2, vertex[2].getZ()*t3 - vertex[1].getZ()*t2);
        return R3Vector.vectorProduct(a,b).getZ()*(-1);
    }



    public void draw(Graphics2D g){
        Path2D p = new Path2D.Double();
        g.setColor(color);
        p.moveTo(vertex[0].getX(),vertex[0].getY());
        p.lineTo(vertex[1].getX(),vertex[1].getY());
        p.lineTo(vertex[2].getX(),vertex[2].getY());
        p.lineTo(vertex[3].getX(),vertex[3].getY());
        p.lineTo(vertex[0].getX(),vertex[0].getY());
        p.closePath();

        g.fill(p);

    }

    public void perpdrawFcet(Graphics2D g){
        Path2D p = new Path2D.Double();
        g.setColor(color);
        double c = 600;
        double t1 = -c/(vertex[0].getZ()-c);
        double t2= -c/(vertex[1].getZ()-c);
        double t3 = -c/(vertex[2].getZ()-c);
        double t4 = -c/(vertex[3].getZ()-c);

        p.moveTo(vertex[0].getX()*t1,vertex[0].getY()*t1);
        p.lineTo(vertex[1].getX()*t2,vertex[1].getY()*t2);
        p.lineTo(vertex[2].getX()*t3,vertex[2].getY()*t3);
        p.lineTo(vertex[3].getX()*t4,vertex[3].getY()*t4);
        p.lineTo(vertex[0].getX()*t1,vertex[0].getY()*t1);

        p.closePath();

        g.fill(p);

    }
}
