package model;

public class Porche implements Car {	
	private int speed;
	
	public int getSpeed() {
		return speed;
	}
	
	public int speedup(int km) {
		this.speed = this.speed + km;		
		return this.speed;
	}
	
	public boolean stop() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean isStart() {
		// TODO Auto-generated method stub
		return false;
	}

}
