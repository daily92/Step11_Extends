package test.mypac;
// �� Ŭ������ + extends + ��ӹް� ���� Ŭ������
public class CellPhone extends Phone{	//Phone Class �� ��� �ޱ�
	public CellPhone() {
		System.out.println("CellPhone() ������ ȣ���");
	}
	
	// �̵� �߿� ��ȭ�� �Ŵ� �޼ҵ�
	public void mobileCall() {
		System.out.println("�̵� �߿� ��ȭ�� �ɾ��");
	}
	
	// ���� ��� �޼ҵ�
	public void takePicture() {
		System.out.println("100 �� ȭ���� ������ ����");
	}
}
