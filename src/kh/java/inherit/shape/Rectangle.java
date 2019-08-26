package kh.java.inherit.shape;

import java.util.Arrays;

public class Rectangle extends Shape{
	//field
	private static final int MAX_ANGLE = 4;
	private Point[] points = new Point[MAX_ANGLE];
	private int width;
	private int height;
	
	//constructor
	public Rectangle() {
		this(new Point(0,0),10,10);
	}
	public Rectangle(Point leftTop, int width, int height) {
		for(int i=0;i<MAX_ANGLE;i++) {
			this.points[i] = new Point(0,0);
		}

		this.width = width;
		this.height = height;
				
		points[0] = leftTop;
		
		points[1].setX(points[0].getX()+width);
		points[1].setY(points[0].getY());
		
		points[2].setX(points[0].getX());
		points[2].setY(points[0].getY()+height);

		points[3].setX(points[0].getX()+width);
		points[3].setY(points[0].getY()+height);
		
//		points[1] = new Point(points[0].getX()+width,0);
//		points[2] = new Point(0,height);
//		points[3] = new Point(width,height);
	}
	
	//getter & setter
	public Point[] getPoints() {
		return points;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public void setPoints(Point[] points) {
		this.points = points;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}	
	
	@Override
	public void draw() {
		String angle_array="";
		for(int i=0;i<MAX_ANGLE;i++) {
			angle_array += "("+points[i].getX() + ", "+ points[i].getY()+")";
		}
		System.out.println("네 꼭지점이 "+angle_array+"이고, 너비가 "+width+", 높이가 "+height+"인 사각형을 그린다.");

		System.out.println(Arrays.toString(points));
		System.out.println(points[1].toString());
	}
	
	@Override
	public double getArea() {
		return height*width;
	}
	
}
