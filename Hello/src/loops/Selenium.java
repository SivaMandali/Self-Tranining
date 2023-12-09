package loops;

public class Selenium extends Automation {
	public void m3() {
		System.out.println("Child class Method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Selenium obj=new Selenium();
     obj.m1();
     obj.m3();
     obj.m2();
     obj.abc=33;
     System.out.println(obj.abc);
	}

}
