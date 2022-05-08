
public class WhyMethod {

	public static void main(String[] args) {
		printTwoTimesA("a", "-");
		printTwoTimesA("a", "*");
		printTwoTimesA("b", "^");
		printTwoTimesA("b", "!");
		
	}
		
		public static void printTwoTimesA(String text, String delimiter) {
	        System.out.println(delimiter);
	        System.out.println(text);
	        System.out.println(text);
		

	}

}
