package test.armory;

public class SniperGun extends Gun {
	// 생성자
		//extends Gun 추가하면 오류 떠, 
		//윗 줄의 SniperGun 에 mouseon 하면 뜨는 알림창에서 add 클릭
	public SniperGun(Bullet bullet) {
		super(bullet);	//super();	부모 생성자 호출
	}
	// fire() 메소드 재정의하기
	@Override	//annotation(주석) //기능은 없고, override 했다는 걸 알게 하는 주석
	public void fire() {
		/*
		 * 	super 는 부모 객체의 참조값을 가리키는 예약어 이다.
		 *  super.fire() 재정의의 대상이 된 부모 메소드를
		 *  호출하는 표현식이다.
		 */
		super.fire();	//super.	부모참조값 가르키는 것
						//부모에 있는 메소드 사용할 때
		System.out.println("좀 더 멀리 정밀하게 빵!");
	}
	
	/*
	 * SniperGun 객체 생성하면,
	 * 	Heap 영역에 Gun(부모) 객체 만들어지고, 
	 * 	그 아래 SniperGun(자식) 객체 만들어져
	 * 	그리고 이 둘은 하나로 묶여서 하나의 참조값(16)으로 관리돼
	 *  
	 *  이 참조값을 stack 영역에 gun1 이라는 변수에 담아
	 *  
	 *  부모 객체에도 void fire(){} 
	 *  자식 객체에도 @override void fire(){} 있어 (재정의)
	 *  
	 *  16 에 점을 찍어서 fire 메소드 호출	gun1.fire();
	 *  => 재정의 했을 때는 부모와 자식 객체 둘 다 있는 void fire(){} 중에
	 *     *재정의 된 것* 불러와
	 *  
	 *  그런데 부모 객체에 저 객체(부모+자식)가 동작하기 위한 중요한 코드가 들어있을 수도 있어
	 *  따라서 이 때는 재정의 된 메소드 안에서부모의 메소드 호출해줘야 해
	 *  =>  @override
	 *  	void fire(){
	 *  		super.fire();
	 *  	}
	 */
}
