package test.auto;

//��� �޾����� �θ��� Ư�� �޼ҵ带 ������ �ϰ� ���� ��
public class Sedan extends Car{
	// �θ��� �޼ҵ� ������(Override) �ϱ�
		//���� Ŀ�� �ΰ� ctrl + space => drive �޼ҵ�, enter => todo �� ����
		//�θ��� �޼ҵ� �߿��� ������ �ϰ� ���� �� (���ο� �޼ҵ� �̸� ������ �ȵ�! ����)
	@Override
	public void drive() {
		System.out.println("������ �ε巴�� �޷���~!");
	}
}
