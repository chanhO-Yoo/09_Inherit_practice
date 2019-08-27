package member.model.vo;

public class Vvip extends Member{
	//field
	
	//constructor
	public Vvip(){
		
	}
	public Vvip(String name, String grade, int point) {
		super(name,grade,point);
	}
	
	//getter & setter

	//이자 계산 메서드
	@Override
	public double getInterestPoint() {
		return super.getPoint()*0.15;
	}
}
