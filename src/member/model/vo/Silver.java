package member.model.vo;

public class Silver extends Member{
	//field
	
	//constructor(생성자)
	public Silver() {
		
	}
	public Silver(String name, String grade, int point) {
		super(name,grade,point);
	}
	
	//getter & setter

	//이자 계산 메서드
	@Override
	public double getInterestPoint() {
		return super.getPoint()*0.02;
	}
	
	/*
	 * this, super 테스트
	 */
	public void test() {
		//this : 현재 객체를 가리키는 참조
		System.out.println(this.getInterestPoint());
		//super
		System.out.println(super.getInterestPoint());
	}
}
