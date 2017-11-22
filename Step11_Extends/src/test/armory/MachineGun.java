package test.armory;
//MachineGun �� �����Ƿ��� Gun �־�� �ϰ�
//Gun �����Ƿ��� Bullet ��ü �ʿ���
//�ֳ��ϸ�, ������ �� �� �������Ƿ�, default ������ ���
//new Gun(); �Ұ� => bullet ���� �޾ƾ߸� ����!!!! ex. new Gun(new Bullet);

//�ڽ� Ŭ������ �����ڿ��� �޾Ƽ� �θ� Ŭ������ �����ڷ� �������ִ� ���� ���!
public class MachineGun extends Gun{
	
	// �ڽ� �����ڿ��� �θ� �����ڿ� �ʿ��� ��(bullet)�� ���� �޾Ƽ�
	public MachineGun(Bullet bullet) {
		// �θ� �����ڿ��� �Ѱ��ش�.
		// �θ� �����ڸ� ȣ���ϴ� �ڵ�� ���� ù �ٿ� �;� �Ѵ�.
		super(bullet);	//super() �θ������ ȣ���ϴ� ��
	}
	
	// �޼ҵ� ����
	public void autoFire() {
		//Gun Ŭ�������� private Bullet bullet;
		//field �� ���������ڰ� private �� �ٸ� Ŭ�������� ���� �Ұ�
		//�ٵ� �׷��ٰ� �ؼ� public ���� �ϸ� �� ������ Ŀ
		//�ܺο��� ���� ���ϰ�, ��� ���� �� �ڽĿ��Դ� �����ϰ� ���� ��,
		//���� ������ protected
		//Gun Ŭ�������� protected Bullet bullet;
		if(this.bullet==null) {
			System.out.println("�Ѿ� ��ü�� ��� �߻� �Ұ�");
		}
		System.err.println("��! ��! ��!");
	}
}
