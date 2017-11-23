package test.armory;
/*
 * 	[ ���� ������ ]
 * 		���� �����ڸ� ���� �� �ִ� ���� 4 �� : class, ������, �ʵ� , �޼ҵ�
 * 
 *  class ���� ������	(import �� ������ ��ħ)
 *  
 *  	1. public	: ��ü ����
 *  	2. default	: ���� ��Ű�� �������� ���� ����	//�� ������ �ڵ����� default ��
 *  
 *  ������, �ʵ�, �޼ҵ��� ���� ������
 *  
 * 		1. public	: ��ü ����
 *  	2. protected: ���� ��Ű�� | ��� ������ �ڽ�(�ٸ� ��Ű���� ����)���� ���� ���� 
 *  	3. default	: ���� ��Ű�� �������� ���� ����
 *  	4. private	: ���� Ŭ���� | ���� ��ü �������� ���� ����
 */
public class Gun {
	// ��� �ʵ�
		//������ �� ������ null ����
		//�������� ���ڷ� �����ؼ� � ���� �־���� null �� �ƴ�
	protected Bullet bullet;
	
	// ������
		//�����ڸ� �ϳ��� �����ϴ� ���� �⺻ (default) ������ (public Gun(){})�����
		//(c.f. ��, default ������ ��������� �������ָ� ����)
		//=> new Gun(); �ȵ�! 
		//(���� ���¿��� �������� ���ڷ� Bullet type ��ü �־����)
	public Gun(Bullet bullet) {
		this.bullet= bullet;
	}
	
	// �޼ҵ�
	public void fire() {
		if(bullet==null) {
			System.out.println("�Ѿ� ��ü�� ��� ���Ұ�");
			return;  // �޼ҵ� ����
		}
			//syse + ctrl + space	(���� �۾�)
		System.err.println("��~");
	}
}
