package test.armory;
/*
 * 	[ 접근 지정자 ]
 * 		접근 지정자를 붙일 수 있는 곳은 4 곳 : class, 생성자, 필드 , 메소드
 * 
 *  class 접근 지정자	(import 에 영향을 미침)
 *  
 *  	1. public	: 전체 공개
 *  	2. default	: 같은 패키지 내에서만 접근 가능	//안 적으면 자동으로 default 임
 *  
 *  생성자, 필드, 메소드의 접근 지정자
 *  
 * 		1. public	: 전체 공개
 *  	2. protected: 같은 패키지 | 상속 관계의 자식(다른 패키지도 가능)에서 접근 가능 
 *  	3. default	: 같은 패키지 내에서만 접근 가능
 *  	4. private	: 같은 클래스 | 같은 객체 내에서만 접근 가능
 */
public class Gun {
	// 멤버 필드
		//생성만 해 놓으면 null 상태
		//생성자의 인자로 전달해서 어떤 값을 넣어줘야 null 이 아님
	protected Bullet bullet;
	
	// 생성자
		//생성자를 하나라도 정의하는 순간 기본 (default) 생성자 (public Gun(){})사라져
		//(c.f. 단, default 생성자 명시적으로 정의해주면 가능)
		//=> new Gun(); 안됨! 
		//(지금 상태에선 생성자의 인자로 Bullet type 객체 넣어줘야)
	public Gun(Bullet bullet) {
		this.bullet= bullet;
	}
	
	// 메소드
	public void fire() {
		if(bullet==null) {
			System.out.println("총알 객체가 없어서 사용불가");
			return;  // 메소드 종료
		}
			//syse + ctrl + space	(붉은 글씨)
		System.err.println("빵~");
	}
}
