package test.mypac;

public class SmartPhone extends CellPhone{
	public SmartPhone() {
		System.out.println("SmartPhone() ������ ȣ���!");
	}
	
	public void doInternet() {
		System.out.println("���ͳ��� �ؿ�!");
	}
	
	// ���� ��� �޼ҵ� ������ �ϱ�
	@Override
	public void takePicture() {
		//super.takePicture();	//�θ� ��ü�� takePicture() �޼ҵ� ȣ��
								//�ʿ����� ������ ���ָ� ��
		System.out.println("1000 �� ȭ���� ������ ����! �Ϳ�!");
	}
}
