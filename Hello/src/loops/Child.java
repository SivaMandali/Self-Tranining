package loops;

public class Child extends Inheritance {
	int xyz;
	public void m2() {
		System.out.println("Child Class Method");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj=new Child();
		System.out.println (obj.abc=23);
		System.out.println(obj.xyz=33);
		obj.m1();
		obj.m2();
		

	}

}
