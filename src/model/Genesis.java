package model;

public class Genesis  implements Car {
	public int speed;
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int speedup(int km) {
		this.speed = this.speed + km;
		return this.speed;
	}

	public boolean stop() {
		this.speed = 0;
		return false;
	}

	public boolean isStart() {
		// TODO Auto-generated method stub
		return false;
	}
}
