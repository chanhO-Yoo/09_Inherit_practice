package member.controller;

import member.model.vo.Gold;
import member.model.vo.Silver;
import member.model.vo.Vip;
import member.model.vo.Vvip;

public class MemberManager {
	private static final int MAX_MEMBER = 10;
	private int countSilver=0;
	private int countGold=0;
	private int countVip=0;
	private int countVvip=0;
	
	Silver[] silverMember = new Silver[MAX_MEMBER];
	Gold[] goldMember = new Gold[MAX_MEMBER];
	Vip[] vipMember = new Vip[MAX_MEMBER];
	Vvip[] vvipMember = new Vvip[MAX_MEMBER];
	
	public MemberManager() {
	}

	public void silverInsert(Silver s) {
		silverMember[countSilver] = s;
		countSilver++;
	}
	public void goldInsert(Gold g) {
		goldMember[countGold] = g;
		countGold++;
	}
	public void vipInsert(Vip v) {
		vipMember[countVip] = v;
		countVip++;
	}
	public void vvipInsert(Vvip vv) {
		vvipMember[countVvip] = vv;
		countVvip++;
	}
	
	public void printData() {
		System.out.println("------------<<회원정보>>------------");
		System.out.println("이름\t등급\t포인트\t이자포인트");
		System.out.println("----------------------------------");
		
		for(int i=0;i<countSilver;i++) {
			System.out.println(silverMember[i].getName()+"\t"+silverMember[i].getGrade()+"\t"+silverMember[i].getPoint()+"\t"+silverMember[i].getInterestPoint());
		}
		for(int i=0;i<countGold;i++) {
			System.out.println(goldMember[i].getName()+"\t"+goldMember[i].getGrade()+"\t"+goldMember[i].getPoint()+"\t"+goldMember[i].getInterestPoint());
		}
		for(int i=0;i<countVip;i++) {
			System.out.println(vipMember[i].getName()+"\t"+vipMember[i].getGrade()+"\t"+vipMember[i].getPoint()+"\t"+vipMember[i].getInterestPoint());
		}
		for(int i=0;i<countVvip;i++) {
			System.out.println(vvipMember[i].getName()+"\t"+vvipMember[i].getGrade()+"\t"+vvipMember[i].getPoint()+"\t"+vvipMember[i].getInterestPoint());
		}
		System.out.println("---------------------------------------------------");
		silverMember[1].test();
	}
}
