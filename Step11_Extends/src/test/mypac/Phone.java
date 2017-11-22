package test.mypac;
//Class 정의 할 때 extends Object 는 생략 가능
//즉, 안 써도 object 는 상속됨
//따라서 MainClass01 에서 p1. 하면 p1 의 메소드 외에도 
//object 로부터 상속받은 method 들 여러 개 뜸
public class Phone extends Object{
//c.f.	http://nukestorm.tistory.com/87	 생성자 설명
//		http://hunit.tistory.com/155
	// default 생성자를 명시적으로 정의하기
	public Phone() {
		System.out.println("Phone() 생성자 호출됨");
	}
		//(1) 생성자를 하나도 정의 하지 않았을 경우
		// : 아무것도 적지 않아도 public Phone(){} 있어 (default 생성자)
	
		//그런데 (2) 생성자를 하나라도 정의할 경우
		// : 위의 default 생성자 없어
		//public Phone(int num) {
		//	
		//}
	
	// 멤버 메소드
	public void call() {
		System.out.println("전화를 걸어요");
	}
}
