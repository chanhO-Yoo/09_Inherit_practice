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
		return getPoint()*0.02;
	}
}
