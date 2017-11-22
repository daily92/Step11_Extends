package test.main;

import test.mypac.CellPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass02 {
	public static void main(String[] args) {
		// SmartPhone 객체의 참조값을 다양한 type 변수에 담을 수 있다
		// 다형성 polymorphism
		Object p1= new SmartPhone();	//증손자 객체는 증조부모 type 으로 받아져  
		Phone p2= new SmartPhone();	//손자 객체는 조부모 type 으로 받아져
		CellPhone p3= new SmartPhone();	//자식 객체는 부모 type 으로 받아져
		SmartPhone p4= new SmartPhone();
		//ex. 자식이 집에 들어가는 것으로 생각
		//자식이 본인 집에 들어갈 수 ㅇ
		//자식이 부모님 집 가면 받아줘(들어갈 수 있어)
		//손주가 할아버지 집 가면 받아줘(들어갈 수 있어)
		
		//변수의 type 선언은 ....??????? 
		//그러나 기능에 제한있어..... p1. => call() 안됨
	}
}
