package test.main;

import test.mypac.CellPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass02 {
	public static void main(String[] args) {
		// SmartPhone ��ü�� �������� �پ��� type ������ ���� �� �ִ�
		// ������ polymorphism
		Object p1= new SmartPhone();	//������ ��ü�� �����θ� type ���� �޾���  
		Phone p2= new SmartPhone();	//���� ��ü�� ���θ� type ���� �޾���
		CellPhone p3= new SmartPhone();	//�ڽ� ��ü�� �θ� type ���� �޾���
		SmartPhone p4= new SmartPhone();
		//ex. �ڽ��� ���� ���� ������ ����
		//�ڽ��� ���� ���� �� �� ��
		//�ڽ��� �θ�� �� ���� �޾���(�� �� �־�)
		//���ְ� �Ҿƹ��� �� ���� �޾���(�� �� �־�)
		
		//������ type ������ ....??????? 
		//�׷��� ��ɿ� �����־�..... p1. => call() �ȵ�
	}
}
