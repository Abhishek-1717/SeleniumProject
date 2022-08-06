package objectCasting;

public class B extends A{
	
	void xyz()
	{
		System.out.println("child class");
	}

	public static void main(String[] args) {
		
		//A aa=new B();
		//aa.abc();
		
		B bb=(B) new A();
		bb.abc();
		bb.xyz();

	}

}
