package kh.java.inherit.shape;

public class Run {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.draw();
		System.out.println("원의 넓이 : "+c1.getArea());
		
		Point center = new Point(10,10);
		Circle c2 = new Circle(5,center);
		c2.draw();
		System.out.println("원의 넓이 : "+c2.getArea());
		
		/*
		 * 실습문제 : shape를  상속받은 Rectangle클래스를 작성하세요
		 */
		Rectangle rect = new Rectangle(new Point(100,100), 200, 100);
		rect.draw();
		System.out.println("사각형의 너비는 "+rect.getArea()+"입니다.");
		
		//toString
		System.out.println(new Circle().toString());
		System.out.println(new Point().toString());
	}

}
