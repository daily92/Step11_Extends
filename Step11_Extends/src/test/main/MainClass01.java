package test.main;

import test.mypac.CellPhone;
import test.mypac.Phone;
/*
 *  [ extends ��� ]
 *  
 *  1. Ŭ������ ��� �޴� ���� �н�
 *  2. ��� ���� Ŭ������ �̿��ؼ� ��ü �������� ��, 
 *     �������� �޾��� �� �ִ� �پ��� type �н�	
 *  3. ����ȯ(casting) �������� Ȱ��
 *  4. �ڽ� �����ڿ��� �θ� �����ڿ� ���� �����ϴ� ���
 *  5. �޼ҵ� �������̵�(������) �ϴ� ���
 *  6. �������̵� �� �޼ҵ忡�� �θ� ��ü�� �޼ҵ带 ȣ���ϴ� ���
 */
public class MainClass01 {
	public static void main(String[] args) {
		Phone p1= new Phone();
		p1.call();
		
		System.out.println("--------------------");
		
		//��? ���� �и� CellPhone�� ������ ȣ���ߴµ�,
		//�� Phone �� �����ڵ� ȣ�� ����? (�ֿܼ�, Phone() ������ ȣ��� ��)
		//=> �ڽ� Ŭ������ �����ڸ� ȣ���ϸ�, 
		//	 �θ� Ŭ���� ������ ȣ�� -> �ڽ� Ŭ���� ������ ȣ�� ������ ȣ�� ��
		//��ü�� heap ������ �����Ǵµ�, �׷� ��� �޾��� �� heap ������ ���� �ɱ�?
		CellPhone p2= new CellPhone();
		
		//.call() �޼ҵ�� CellPhone Ŭ������ ���ǵ��� �ʾ�����,
		//Phone Ŭ������ ��� �޾����Ƿ�,
		//�θ�Ŭ����(Phone)�� ���ǵ� ����̶� �� �� �־�!
		p2.call();
		p2.mobileCall();
		p2.takePicture();
	}
}
