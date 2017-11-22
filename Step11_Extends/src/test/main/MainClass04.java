package test.main;

import test.mypac.CellPhone;
import test.mypac.SmartPhone;

public class MainClass04 {
	public static void main(String[] args) {
			//heap 영역에 생성된 객체에는 Phone, CellPhone 기능 뿐!
		CellPhone p1= new CellPhone();
		
		// 원래 CellPhone 객체의 참조값 이기 때문에
		// SmartPhone 으로 casting 은 실행 시에 오류가 발생한다.
		SmartPhone p2= (SmartPhone)p1;
		p2.doInternet();	//오류
			//문법적으로는 맞으나(compile 은 되나), 런타임(실행)시 오류
			//설명서만 SmartPhone 갖다 준다고 해서 (casting)
			//원래 CellPhone 인 핸드폰(p1)이  SmartPhone 기능을 할 수는 없어
	}
}
