package test.armory;
//MachineGun 이 생성되려면 Gun 있어야 하고
//Gun 생성되려면 Bullet 객체 필요해
//왜냐하면, 생성자 한 개 생겼으므로, default 생성자 없어서
//new Gun(); 불가 => bullet 인자 받아야만 가능!!!! ex. new Gun(new Bullet);

//자식 클래스의 생성자에서 받아서 부모 클래스의 생성자로 전달해주는 문법 사용!
public class MachineGun extends Gun{
	
	// 자식 생성자에서 부모 생성자에 필요한 값(bullet)을 전달 받아서
	public MachineGun(Bullet bullet) {
		// 부모 생성자에게 넘겨준다.
		// 부모 생성자를 호출하는 코드는 가장 첫 줄에 와야 한다.
		super(bullet);	//super() 부모생성자 호출하는 식
	}
	
	// 메소드 생성
	public void autoFire() {
		//Gun 클래스에서 private Bullet bullet;
		//field 의 접근지정자가 private 라 다른 클래스에서 접근 불가
		//근데 그렇다고 해서 public 으로 하면 넘 위험이 커
		//외부에는 공개 안하고, 상속 관계 내 자식에게는 공개하고 싶을 때,
		//접근 지정자 protected
		//Gun 클래스에서 protected Bullet bullet;
		if(this.bullet==null) {
			System.out.println("총알 객체가 없어서 발사 불가");
		}
		System.err.println("빵! 빵! 빵!");
	}
}
