package member.model.vo;

public class Gold extends Member{
	//field
	
	//constructor(생성자)
	public Gold() {
		
	}
	public Gold(String name, String grade, int point) {
		super(name,grade,point);
	}
	
	//getter & setter

	//이자 계산 메서드
	@Override
	public double getInterestPoint() {
		return super.getPoint()*0.05;
	}
}
