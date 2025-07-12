package vvce;
import java.util.*;

interface Car1
{
	public void startEngine();
	public void moveCar();
	public void stopCar();
}
class BMW1 implements Car1{
	public void startEngine()
	{
		System.out.println("Engine started ");
	}
	public void moveCar()
	{
		System.out.println("car is moving");
	}
	public void stopCar()
	{
		System.out.println("car is stoping");
	}
}
class Audi1 implements Car1{
	public void startEngine()
	{
	System.out.println("Audi started");	
	}
	public void moveCar()
	{
		System.out.println(" Audi is moving");
	}
	
	public void stopCar()
	{
		System.out.println("Audi is stoping");
	}
	
}
class MyCar1 {
	public static Car1 getCar(char type)
	{
		if(type=='B')
		return new BMW1();
		else
			return new Audi1();
	}
}

public class InterfaceMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char type=sc.next().charAt(0);
    Car1 c1=MyCar1.getCar(type);
    c1.startEngine();
    c1.moveCar();
    c1.stopCar();
	}
}
