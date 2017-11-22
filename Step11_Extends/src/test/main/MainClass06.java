package test.main;

import test.mypac.CellPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass06 {
	public static void main(String[] args) {
			//SmartPhone ��ü�� ����() �ؼ� SmartPhone type �� ���� p1 �� ���� ��
		SmartPhone p1= new SmartPhone();
			//�޼ҵ带 ȣ���ϰų�, �����ڸ� ȣ���� �� �� ���� type �� ��ü ������ �ʿ� X
			//�θ� type ���� �޾��ִ� ������/�޼ҵ忡 �ڽ� type �� ���� �� ��
			//p1 �� ����ִ� ���� SmartPhone/CellPhone/Phone/Object type �� => ������
		
		// usePhone() �޼ҵ� ȣ�� (�ڽ� ��ü(p1)�� �θ� ��ü�� ����)
		usePhone(p1);
		
		// useCellPhone() �޼ҵ� ȣ��
		useCellPhone(p1);
		
		// useSmartPhone() �޼ҵ� ȣ��
		useSmartPhone(p1);
	}
	
	public static void usePhone(Phone p) {
		p.call();
			//��� p1(SmartPhone ��ü)�� �������� ����,
			//�� �ȿ����� call() �ۿ� �ȵ� (mobileCall, doInternet �ȵ�)
			//�� Phone(�θ� type) �ƴϴ��� �ڽ� type(CellPhone, SmartPhone) ���� ����
			//�ڽ� type�� �θ�type���� �޾��� �� �ִٴ� ��!
	}
	
	public static void useCellPhone(CellPhone p) {
		p.mobileCall();
	}
	
	public static void useSmartPhone(SmartPhone p) {
		p.doInternet();
	}
}
