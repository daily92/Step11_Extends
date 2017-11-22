package test.main;

import test.mypac.CellPhone;
import test.mypac.Phone;
/*
 *  [ extends 상속 ]
 *  
 *  1. 클래스를 상속 받는 문법 학습
 *  2. 상속 받은 클래스를 이용해서 객체 생성했을 때, 
 *     참조값을 받아줄 수 있는 다양한 type 학습	
 *  3. 형변환(casting) 연산자의 활용
 *  4. 자식 생성자에서 부모 생성자에 값을 전달하는 방법
 *  5. 메소드 오버라이딩(재정의) 하는 방법
 *  6. 오버라이딩 한 메소드에서 부모 객체의 메소드를 호출하는 방법
 */
public class MainClass01 {
	public static void main(String[] args) {
		Phone p1= new Phone();
		p1.call();
		
		System.out.println("--------------------");
		
		//어? 나는 분명 CellPhone의 생성자 호출했는데,
		//왜 Phone 의 생성자도 호출 되지? (콘솔에, Phone() 생성자 호출됨 뜸)
		//=> 자식 클래스의 생성자를 호출하면, 
		//	 부모 클래스 생성자 호출 -> 자식 클래스 생성자 호출 순으로 호출 됨
		//객체는 heap 영역에 생성되는데, 그럼 상속 받았을 때 heap 영역은 어케 될까?
		CellPhone p2= new CellPhone();
		
		//.call() 메소드는 CellPhone 클래스에 정의되지 않았지만,
		//Phone 클래스를 상속 받았으므로,
		//부모클래스(Phone)에 정의된 기능이라 쓸 수 있어!
		p2.call();
		p2.mobileCall();
		p2.takePicture();
	}
}
