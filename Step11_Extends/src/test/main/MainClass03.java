package test.main;

import test.mypac.CellPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass03 {
	public static void main(String[] args) {
		// SmartPhone 객체를 생성해서 참조값을 SmartPhone type 으로 받기
		SmartPhone p1= new SmartPhone();
		
		// p1 에 들어 있는 참조값을 CellPhone type 변수에 담기
		CellPhone p2= p1;
		
		// p1 에 들어 있는 참조값을 Phone type 변수에 담기
		Phone p3= p1;
		
		// p1 에 들어 있는 참조값을 Object type 변수에 담기
		Object p4= p1;

			//Heap 영역에 객체는 몇 개 만들어졌는가? 1 개 (new 할 때 만들어져)
			//객체 하나의 key 값이 네 개의 변수에 들어간 것
			//단지 변수의 type 만 다양할 뿐!
			//단 그 객체에 정의된 type 에 따라 사용할 수 있는 기능 정해져
			//p4. 하면 Object 에 정의된 기능만 가능
		
		// p1, p2, p3, p4 에 들어 있는 참조값은 모두 같다.
		if(p1==p2) {
			System.out.println("같아요!");
		}
		
		// p4 에 들어 있는 참조값을 Phone type 으로 casting(형변환) !
			//Phone p5= p4;	일케 하면 안 담겨(p4 는 object)
			//(부모 type 은 그냥은 자식 type 에 안 담겨) => casting 연산자 이용
		Phone p5= (Phone)p4;	
			//p4 는 object type 이지만, (Phone) type 으로 간주 해줘 => Phone p5 에 담을 수 있음
		p5.call();
		
		// p4 에 들어 있는 참조값을 CellPhone type 으로 casting !
		CellPhone p6= (CellPhone)p4;
		
		// p4 에 들어 있는 참조값을 SmartPhone type 으로 casting !
		SmartPhone p7= (SmartPhone)p4;
	}
}
