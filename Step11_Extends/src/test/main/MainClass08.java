package test.main;

import test.auto.Car;
import test.auto.Sedan;
import test.mypac.CellPhone;
import test.mypac.SmartPhone;

public class MainClass08 {
	public static void main(String[] args) {
		System.out.println("-------Sedan ���� Car �� drive �޼ҵ� ������-------");
		
		Sedan car1= new Sedan();
		// �������̵� �� �޼ҵ� ȣ���� ����
		car1.drive();
		// Sedan ��ü�� useCar() �޼ҵ��� ���ڷ� ������ ����
		useCar(car1);
		
		
		System.out.println("-------SmartPhone ���� CellPhone �� takePicture �޼ҵ� ������-------");
		
		SmartPhone p1= new SmartPhone();
		p1.takePicture();
		
		System.out.println("-------CellPhone type �����ϸ� �������(������ �ϱ� ��)-------");
		
		//CellPhone p2= new CellPhone();
		//p2.takePicture();
		new CellPhone().takePicture();   //�� ���ɵ� �����ϳߤ��� ��� ��ȸ�� ����� ���� �����ϰڵ�
	}
	
	public static void useCar(Car car) {
		car.startEngine();
		car.drive();
	}
}
