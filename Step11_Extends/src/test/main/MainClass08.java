package test.main;

import test.auto.Car;
import test.auto.Sedan;
import test.mypac.CellPhone;
import test.mypac.SmartPhone;

public class MainClass08 {
	public static void main(String[] args) {
		System.out.println("-------Sedan 에서 Car 의 drive 메소드 재정의-------");
		
		Sedan car1= new Sedan();
		// 오버라이딩 된 메소드 호출해 보기
		car1.drive();
		// Sedan 객체를 useCar() 메소드의 인자로 전달해 보기
		useCar(car1);
		
		
		System.out.println("-------SmartPhone 에서 CellPhone 의 takePicture 메소드 재정의-------");
		
		SmartPhone p1= new SmartPhone();
		p1.takePicture();
		
		System.out.println("-------CellPhone type 전달하면 원래대로(재정의 하기 전)-------");
		
		//CellPhone p2= new CellPhone();
		//p2.takePicture();
		new CellPhone().takePicture();   //오 일케도 가능하넹ㅋㅋ 대신 일회성 사용일 때만 가능하겠따
	}
	
	public static void useCar(Car car) {
		car.startEngine();
		car.drive();
	}
}
