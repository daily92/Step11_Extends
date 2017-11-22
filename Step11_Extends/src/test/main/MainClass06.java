package test.main;

import test.mypac.CellPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass06 {
	public static void main(String[] args) {
			//SmartPhone 객체를 생성() 해서 SmartPhone type 의 변수 p1 에 담은 것
		SmartPhone p1= new SmartPhone();
			//메소드를 호출하거나, 생성자를 호출할 때 꼭 같은 type 의 객체 전달할 필요 X
			//부모 type 으로 받아주는 생성자/메소드에 자식 type 을 넣을 수 ㅇ
			//p1 에 들어있는 값은 SmartPhone/CellPhone/Phone/Object type 임 => 다형성
		
		// usePhone() 메소드 호출 (자식 객체(p1)를 부모 객체에 전달)
		usePhone(p1);
		
		// useCellPhone() 메소드 호출
		useCellPhone(p1);
		
		// useSmartPhone() 메소드 호출
		useSmartPhone(p1);
	}
	
	public static void usePhone(Phone p) {
		p.call();
			//비록 p1(SmartPhone 객체)을 전달할지 언정,
			//이 안에서는 call() 밖에 안돼 (mobileCall, doInternet 안돼)
			//꼭 Phone(부모 type) 아니더라도 자식 type(CellPhone, SmartPhone) 전달 가능
			//자식 type을 부모type으로 받아줄 수 있다는 거!
	}
	
	public static void useCellPhone(CellPhone p) {
		p.mobileCall();
	}
	
	public static void useSmartPhone(SmartPhone p) {
		p.doInternet();
	}
}
