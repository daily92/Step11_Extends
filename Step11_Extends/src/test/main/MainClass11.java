package test.main;

import test.armory.Bullet;
import test.armory.SniperGun;

public class MainClass11 {
	public static void main(String[] args) {
		SniperGun gun1= new SniperGun(new Bullet());
		gun1.fire();
		
		//run 해보면
		//부모의 메소드 (빵~)
		//자식에서 재정의된 메소드 (좀 더 멀리 정밀하게 빵!) 
		//둘 다 호출됨을 볼 수 있다!
		//SniperGun.java 가서 fire() 보면 super.fire(); 있어서 그런 듯?
	}
}
