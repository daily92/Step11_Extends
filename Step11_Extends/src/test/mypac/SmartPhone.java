package test.mypac;

public class SmartPhone extends CellPhone{
	public SmartPhone() {
		System.out.println("SmartPhone() 생성자 호출됨!");
	}
	
	public void doInternet() {
		System.out.println("인터넷을 해요!");
	}
	
	// 사진 찍는 메소드 재정의 하기
	@Override
	public void takePicture() {
		//super.takePicture();	//부모 객체의 takePicture() 메소드 호출
								//필요하지 않으면 없애면 돼
		System.out.println("1000 만 화소의 사진을 찍어요! 와우!");
	}
}
