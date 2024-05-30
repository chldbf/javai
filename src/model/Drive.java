package javai;

import model.Benz;
import model.Car;
import model.Genesis;
import model.Lambor;
import model.Porche;

public class Drive {
	public static void main(String[] args) {
		extracted(new Lambor());		
		extracted(new Porche());
		extracted(new Benz());
		extracted(new Genesis());
	}

	private static void extracted(Car car) {
		car.speedup(100);		
		System.out.println(car.getSpeed());
	}
}
