package test.auto;

//상속 받았지만 부모의 특정 메소드를 재정의 하고 싶을 때
public class Sedan extends Car{
	// 부모의 메소드 재정의(Override) 하기
		//여기 커서 두고 ctrl + space => drive 메소드, enter => todo 는 지움
		//부모의 메소드 중에서 재정의 하고 싶은 거 (새로운 메소드 이름 넣으면 안돼! 주의)
	@Override
	public void drive() {
		System.out.println("세단은 부드럽게 달려요~!");
	}
}
