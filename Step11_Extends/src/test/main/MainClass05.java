package test.main;

import test.mypac.CellPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass05 {
	public static void main(String[] args) {
		// 1. usePhone() �޼ҵ带 ���� ���� ȣ���� ������
		Phone p1= new Phone();
		usePhone(p1);	
			//main Ŭ������ usePhone Ŭ������ ���� Ŭ���� �� => ���� ����
		//MainClass05.usePhone(p1);
		
		// 2. useCellPhone() �޼ҵ� ȣ��
		CellPhone p2= new CellPhone();
		useCellPhone(p2);
		
		// 3. useSmartPhone() �޼ҵ� ȣ��
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
