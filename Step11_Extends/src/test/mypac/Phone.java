package test.mypac;
//Class ���� �� �� extends Object �� ���� ����
//��, �� �ᵵ object �� ��ӵ�
//���� MainClass01 ���� p1. �ϸ� p1 �� �޼ҵ� �ܿ��� 
//object �κ��� ��ӹ��� method �� ���� �� ��
public class Phone extends Object{
//c.f.	http://nukestorm.tistory.com/87	 ������ ����
//		http://hunit.tistory.com/155
	// default �����ڸ� ��������� �����ϱ�
	public Phone() {
		System.out.println("Phone() ������ ȣ���");
	}
		//(1) �����ڸ� �ϳ��� ���� ���� �ʾ��� ���
		// : �ƹ��͵� ���� �ʾƵ� public Phone(){} �־� (default ������)
	
		//�׷��� (2) �����ڸ� �ϳ��� ������ ���
		// : ���� default ������ ����
		//public Phone(int num) {
		//	
		//}
	
	// ��� �޼ҵ�
	public void call() {
		System.out.println("��ȭ�� �ɾ��");
	}
}
