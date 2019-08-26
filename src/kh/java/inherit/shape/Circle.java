package kh.java.inherit.shape;
/**
 * has a 포함관계
 *   - Circle has a Point
 * is a 상속관계
 *  - Circle is a Shape
 */
public class Circle extends Shape{
	//field
	private int r;//반지름
	private Point center;
	
	//constructor
	public Circle() {
		this(100,new Point(0,0));
	}
	public Circle(int r, Point center) {
		this.r = r;
		this.center = center;
	}
	
	//getter & setter
	public int getR() {
		return r;
	}
	public Point getCenter() {
		return center;
	}
	public void setR(int r) {
		this.r = r;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	
	/*   overriding : 자식 클래스에서 상속받은 부모의 메서드를 재작성하는 것
	 *   자식 클래스 입장에 맞게 고쳐쓰는 것을 의미한다.
	 *    - 메서드 이름, 파라미터 타입/개수, 리턴타입 모두 동일
	 *    - 부모메서드의 접근 제한자는 수정가능
	 *      부모보다 같거나 더 넓은 범위로만 수정 가능
	 *      protected -> public
	 *    - 부모메서드 예외 처리 클래스의 개수 수정가능
	 */  
	@Override
	public void draw() {
		System.out.println("원점이 ("+center.getX()+", "+center.getY()+")이고, 반지름이 "+r+"인 원을 그린다.");
	}
	
	/**
	 * 실습문제 : Shape.getArea() 넓이를 구하는 메서드를
	 * 오버라이딩해서 원의 넓이를 리턴하도록 하시오.
	 */
	@Override
	public double getArea() {
		return 3.14*r*r;
	}
}
