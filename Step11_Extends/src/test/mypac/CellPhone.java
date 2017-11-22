package test.mypac;
// 본 클래스명 + extends + 상속받고 싶은 클래스명
public class CellPhone extends Phone{	//Phone Class 를 상속 받기
	public CellPhone() {
		System.out.println("CellPhone() 생성자 호출됨");
	}
	
	// 이동 중에 전화를 거는 메소드
	public void mobileCall() {
		System.out.println("이동 중에 전화를 걸어요");
	}
	
	// 사진 찍는 메소드
	public void takePicture() {
		System.out.println("100 만 화소의 사진을 찍어요");
	}
}
