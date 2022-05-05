
public class Auth {

	public static void main(String[] args) {

		String Id = "eunryong";
		String InputId = args[0];
		
		System.out.println("Hi");
		if(InputId.equals(Id)) {
			System.out.println("Master!");
		} else {
			System.out.println("Who are you?");
		}

	}

}
