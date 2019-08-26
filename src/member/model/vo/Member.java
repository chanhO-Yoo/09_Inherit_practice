package member.model.vo;

public class Member {

	//field
	private String name;
	private String grade;
	private int point;
	
	//constructor(생성자)
	public Member() {
		
	}
	public Member(String name, String grade, int point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	
	//getter & setter
	//set 메서드
	public void setName(String name) {
		this.name = name;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	//get 메서드
	public String getName() {
		return name;
	}
	public String getGrade() {
		return grade;
	}
	public int getPoint() {
		return point;
	}
	public double getInterestPoint() {
		return point;
	}
}
