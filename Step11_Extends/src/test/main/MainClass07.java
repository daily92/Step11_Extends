package test.main;

import test.auto.Car;
import test.auto.Taxi;
import test.auto.Truck;

public class MainClass07 {
	public static void main(String[] args) {
		Taxi car1= new Taxi();
		Truck car2= new Truck();
		
		car1.startEngine();	//Car ���
		car1.drive();	//Car ���
		car1.takePassenger();	//Taxi ���
		
		System.out.println("----------------");
		
		car2.startEngine();	//Car ���
		car2.drive();	//Car ���
		car2.loadObject();	//Truck ���
		
		System.out.println("----------------");
		
			//static ��� �޼ҵ�ϱ� => Ŭ������.�޼ҵ��(); �� ȣ��
			//���� Ŭ���� ���ϱ� => Ŭ������. ���� ����
		// (�Ʒ��� ���� t ����)Taxi ��ü�� �������� �����߱� ������ Exception �߻� X
		MainClass07.useCar(car1);
		
		// (�Ʒ��� ���� t ����)Truck ��ü�� �������� �����߱� ������ Exception �߻�
		useCar(car2);
			//�Ʒ��� (Car car/�θ�) ���� car1(Taxi/�ڽ�) car2(Truck/�ڽ�) 
			//�� �� ���� ����!
			//�ֳĸ� car1(Taxi), car2(Truck) ��� Car ��� �޾����Ƿ�, Car type ��
	}
	
	public static void useCar(Car car) {
		car.startEngine();
		car.drive();
		
		Taxi t= (Taxi)car;	//car �� Car type �̹Ƿ� Taxi type ���� �� �޾�
							//������ casting
		t.takePassenger();	
		//takePassenger() �� Taxi type �� �޼ҵ��̹Ƿ�
		//1) car1(Taxi type) �����ϸ� ���� �ȳ�
		//			<= ���� MainClass07.useCar(car1);
		//2) car2(Truck type) �����ϸ� ������// ���������δ� ������, Exception �߻�!
		//			<= ���� useCar(car2);
	}
}
