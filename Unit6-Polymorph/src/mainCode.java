
public class mainCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Pond[] ponds = { new Ocean(), new Bay(), new Pond(), new Lake() }; for (Pond
		 * p : ponds) { p.method1(); p.method2(); p.method3(); System.out.println("\n");
		 * }
		 */

		pb5();
		
	}

	public static void pb1() {

		Pond var1 = new Bay();
		Object var2 = new Ocean();
		((Lake) var1).method1();

	}
	public static void pb2() {

		Pond var1 = new Bay();
		Object var2 = new Ocean();
		((Bay) var1).method1(); 


	}
	public static void pb3() {

		Pond var1 = new Bay();
		Object var2 = new Ocean();
		((Pond) var2).method2();


	}
	public static void pb4() {

		Pond var1 = new Bay();
		Object var2 = new Ocean();
		((Lake) var2).method2(); 

	}
	public static void pb5() {

		Pond var1 = new Bay();
		Object var2 = new Ocean();
		((Ocean) var2).method3();


	}
	public static void pb6() {

		Pond var1 = new Bay();
		Object var2 = new Ocean();
		Lake lk1 = new Lake();

		((Bay) lk1).method1();


	}
	
	public static void pb7() {

		Pond var1 = new Bay();
		Object var2 = new Ocean();
		Lake lk1 = (Lake) var2;
		((Bay) lk1).method1();



	}

}
