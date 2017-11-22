package test.main;

import test.armory.Bullet;
import test.armory.Gun;

public class MainClass09 {
	public static void main(String[] args) {
		//Bullet b= new Bullet();
		//new Gun(b);
		Gun g1= new Gun(new Bullet());
			//¥ı¿ÃªÛ ∏‚πˆ« µÂ(private Bullet bullet;) null æ∆¥‘
		g1.fire();	
		
		Gun g2= new Gun(null);
		g2.fire();
	}
}
