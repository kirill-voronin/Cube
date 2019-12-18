package com.company;

public class Main {

    public static void main(String[] args) {
	    R3Vector a = new R3Vector(10,0,0);
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
		Cube c = new Cube();
		c.scaleCube(100);
		c.translateCube(-50,-50,-50);
		c.rotateCube(100,45,20);
//		c.scaleCube(5);
//		c.translateCube(5,5,5);
//		c.showCube();
		Viewer v = new Viewer(c);

    }



}
