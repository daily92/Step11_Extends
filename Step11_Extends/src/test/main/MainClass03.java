package test.main;

import test.mypac.CellPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass03 {
	public static void main(String[] args) {
		// SmartPhone ��ü�� �����ؼ� �������� SmartPhone type ���� �ޱ�
		SmartPhone p1= new SmartPhone();
		
		// p1 �� ��� �ִ� �������� CellPhone type ������ ���
		CellPhone p2= p1;
		
		// p1 �� ��� �ִ� �������� Phone type ������ ���
		Phone p3= p1;
		
		// p1 �� ��� �ִ� �������� Object type ������ ���
		Object p4= p1;

			//Heap ������ ��ü�� �� �� ��������°�? 1 �� (new �� �� �������)
			//��ü �ϳ��� key ���� �� ���� ������ �� ��
			//���� ������ type �� �پ��� ��!
			//�� �� ��ü�� ���ǵ� type �� ���� ����� �� �ִ� ��� ������
			//p4. �ϸ� Object �� ���ǵ� ��ɸ� ����
		
		// p1, p2, p3, p4 �� ��� �ִ� �������� ��� ����.
		if(p1==p2) {
			System.out.println("���ƿ�!");
		}
		
		// p4 �� ��� �ִ� �������� Phone type ���� casting(����ȯ) !
			//Phone p5= p4;	���� �ϸ� �� ���(p4 �� object)
			//(�θ� type �� �׳��� �ڽ� type �� �� ���) => casting ������ �̿�
		Phone p5= (Phone)p4;	
			//p4 �� object type ������, (Phone) type ���� ���� ���� => Phone p5 �� ���� �� ����
		p5.call();
		
		// p4 �� ��� �ִ� �������� CellPhone type ���� casting !
		CellPhone p6= (CellPhone)p4;
		
		// p4 �� ��� �ִ� �������� SmartPhone type ���� casting !
		SmartPhone p7= (SmartPhone)p4;
	}
}
