package chapter14.test5;

public class InterfaceVolation {
	public static void main(String[] args) {
		A a = new B();
		a.f();
		System.out.println(a.getClass().getName());
		if(a instanceof B){
			B b = (B) a;
			b.g();
		}
	}
}