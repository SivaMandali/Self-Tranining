package loops;

public class Son extends Father{
	int xyz;
	public void m3() {
		System.out.println("Son Class Method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son obj=new Son();
		obj.abc=11;
		obj.pqr=22;
		obj.xyz=33;
		obj.m1();
		obj.m2();
		obj.m3();
		System.out.println(obj.abc);
		System.out.println(obj.pqr);
		System.out.println(obj.xyz);
		

	}

}
