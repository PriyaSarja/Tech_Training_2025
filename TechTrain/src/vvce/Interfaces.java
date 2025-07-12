package vvce;

public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new B();
		obj.test1();
		obj.test2();
		A.myStaticMethod();

	}

}
interface A{
	static final int coount= 10;
	void test1();
	void test2();
	static void myStaticMethod() {
		System.out.println("Inside static Method");
	}
}
class B implements A{
	public void test1(){
		System.out.println("In class test1");
	}
	public void test2(){
		System.out.println("In class test2");
	}
}
