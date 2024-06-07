package Myassignment;

public class Method {
	int d=30;
	static int f=90;
	int display1() {
		return(80);
		}
	static int display2() {
		return(70);
	}

public static void main(String[] args) {
	Method m1= new Method();
	System.out.println(m1.d);
	System.out.println(m1.display1());
	System.out.println(Method.f);
	System.out.println(Method.display2());
	}
}

