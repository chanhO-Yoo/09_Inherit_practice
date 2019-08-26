package kh.java.inherit.shape;

public class Shape {
	
	//field
	private double area;//도형의 넓이
	
	//constructor
	public Shape() {
		
	}
	public Shape(double area) {
		this.area = area;
	}
	
	//getter & setter
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	public void draw() {
		System.out.println("도형을 그린다.");
	}
}
