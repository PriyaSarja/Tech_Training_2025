package vvce;

public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = MyCar.getCar();
		c1.startEngine();
		c1.move();
		c1.stop();
	}
}
interface Car{
	public void startEngine();
	public void move();
	public void stop();
	
}
class BMW implements Car{
	public void startEngine(){
		System.out.println("Engine Starts");
		
	}
	public void move(){
		System.out.println("Car moves");
		
	}
	public void stop(){
		System.out.println("Car stops");
		
	}
}
class MyCar{
	public static Car getCar() {
		return new BMW();	
	}
}


