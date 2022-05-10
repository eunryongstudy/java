class print{
	public static String delimiter = "";
	public static void A() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	public static void B() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}

public class MyOOP {
	
	public static void main(String[] args) {
		
		print.delimiter = "----";
		print.A();
		print.A();
		print.B();
		print.B();
		
		print.delimiter = "****";
		print.A();
		print.A();
		print.B();
		print.B();
		
	}

	

}
