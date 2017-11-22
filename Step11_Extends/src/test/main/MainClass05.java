package test.main;

import test.mypac.CellPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass05 {
	public static void main(String[] args) {
		// 1. usePhone() 메소드를 오류 없이 호출해 보세요
		Phone p1= new Phone();
		usePhone(p1);	
			//main 클래스와 usePhone 클래스는 같은 클래스 안 => 생략 가능
		//MainClass05.usePhone(p1);
		
		// 2. useCellPhone() 메소드 호출
		CellPhone p2= new CellPhone();
		useCellPhone(p2);
		
		// 3. useSmartPhone() 메소드 호출
		SmartPhone p3= new SmartPhone();
		useSmartPhone(p3);
	}
	
	public static void usePhone(Phone p) {
		p.call();
	}
	
	public static void useCellPhone(CellPhone p) {
		p.mobileCall();
	}
	
	public static void useSmartPhone(SmartPhone p) {
		p.doInternet();
	}
}
