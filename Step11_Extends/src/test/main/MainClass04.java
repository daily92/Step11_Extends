package test.main;

import test.mypac.CellPhone;
import test.mypac.SmartPhone;

public class MainClass04 {
	public static void main(String[] args) {
			//heap ������ ������ ��ü���� Phone, CellPhone ��� ��!
		CellPhone p1= new CellPhone();
		
		// ���� CellPhone ��ü�� ������ �̱� ������
		// SmartPhone ���� casting �� ���� �ÿ� ������ �߻��Ѵ�.
		SmartPhone p2= (SmartPhone)p1;
		p2.doInternet();	//����
			//���������δ� ������(compile �� �ǳ�), ��Ÿ��(����)�� ����
			//������ SmartPhone ���� �شٰ� �ؼ� (casting)
			//���� CellPhone �� �ڵ���(p1)��  SmartPhone ����� �� ���� ����
	}
}
