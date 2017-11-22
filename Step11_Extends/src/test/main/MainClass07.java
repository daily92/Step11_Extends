package test.main;

import test.auto.Car;
import test.auto.Taxi;
import test.auto.Truck;

public class MainClass07 {
	public static void main(String[] args) {
		Taxi car1= new Taxi();
		Truck car2= new Truck();
		
		car1.startEngine();	//Car 기능
		car1.drive();	//Car 기능
		car1.takePassenger();	//Taxi 기능
		
		System.out.println("----------------");
		
		car2.startEngine();	//Car 기능
		car2.drive();	//Car 기능
		car2.loadObject();	//Truck 기능
		
		System.out.println("----------------");
		
			//static 멤버 메소드니까 => 클래스명.메소드명(); 찍어서 호출
			//같은 클래스 내니까 => 클래스명. 생략 가능
		// (아래의 변수 t 에서)Taxi 객체의 참조값을 전달했기 때문에 Exception 발생 X
		MainClass07.useCar(car1);
		
		// (아래의 변수 t 에서)Truck 객체의 참조값을 전달했기 때문에 Exception 발생
		useCar(car2);
			//아래의 (Car car/부모) 에는 car1(Taxi/자식) car2(Truck/자식) 
			//둘 다 전달 가능!
			//왜냐면 car1(Taxi), car2(Truck) 모두 Car 상속 받았으므로, Car type 임
	}
	
	public static void useCar(Car car) {
		car.startEngine();
		car.drive();
		
		Taxi t= (Taxi)car;	//car 는 Car type 이므로 Taxi type 으로 못 받아
							//강제로 casting
		t.takePassenger();	
		//takePassenger() 는 Taxi type 의 메소드이므로
		//1) car1(Taxi type) 전달하면 오류 안나
		//			<= 위의 MainClass07.useCar(car1);
		//2) car2(Truck type) 전달하면 오류나// 문법적으로는 맞지만, Exception 발생!
		//			<= 위의 useCar(car2);
	}
}
