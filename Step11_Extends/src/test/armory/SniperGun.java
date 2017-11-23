package test.armory;

public class SniperGun extends Gun {
	// ������
		//extends Gun �߰��ϸ� ���� ��, 
		//�� ���� SniperGun �� mouseon �ϸ� �ߴ� �˸�â���� add Ŭ��
	public SniperGun(Bullet bullet) {
		super(bullet);	//super();	�θ� ������ ȣ��
	}
	// fire() �޼ҵ� �������ϱ�
	@Override	//annotation(�ּ�) //����� ����, override �ߴٴ� �� �˰� �ϴ� �ּ�
	public void fire() {
		/*
		 * 	super �� �θ� ��ü�� �������� ����Ű�� ����� �̴�.
		 *  super.fire() �������� ����� �� �θ� �޼ҵ带
		 *  ȣ���ϴ� ǥ�����̴�.
		 */
		super.fire();	//super.	�θ������� ����Ű�� ��
						//�θ� �ִ� �޼ҵ� ����� ��
		System.out.println("�� �� �ָ� �����ϰ� ��!");
	}
	
	/*
	 * SniperGun ��ü �����ϸ�,
	 * 	Heap ������ Gun(�θ�) ��ü ���������, 
	 * 	�� �Ʒ� SniperGun(�ڽ�) ��ü �������
	 * 	�׸��� �� ���� �ϳ��� ������ �ϳ��� ������(16)���� ������
	 *  
	 *  �� �������� stack ������ gun1 �̶�� ������ ���
	 *  
	 *  �θ� ��ü���� void fire(){} 
	 *  �ڽ� ��ü���� @override void fire(){} �־� (������)
	 *  
	 *  16 �� ���� �� fire �޼ҵ� ȣ��	gun1.fire();
	 *  => ������ ���� ���� �θ�� �ڽ� ��ü �� �� �ִ� void fire(){} �߿�
	 *     *������ �� ��* �ҷ���
	 *  
	 *  �׷��� �θ� ��ü�� �� ��ü(�θ�+�ڽ�)�� �����ϱ� ���� �߿��� �ڵ尡 ������� ���� �־�
	 *  ���� �� ���� ������ �� �޼ҵ� �ȿ����θ��� �޼ҵ� ȣ������� ��
	 *  =>  @override
	 *  	void fire(){
	 *  		super.fire();
	 *  	}
	 */
}
