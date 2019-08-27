package kh.java.inherit.shape;

public class Point {
	//field
	private int x;
	private int y;
	
	//constructor
	public Point() {
		
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//getter & setter
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * Object메서드의 toString() 오버라이드
	 * 
	 * 명시적으로 호출 / 객체가 문자열로 표현될 때 사용
	 * 보통 필드 값을 표현하도록 override한다.
	 */
	@Override
	public String toString() {
		return "("+x+", "+y+")";
	}
	
}
