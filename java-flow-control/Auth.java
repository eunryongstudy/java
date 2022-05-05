
public class Auth {

	public static void main(String[] args) {

		String Id = "eunryong";
		String InputId = args[0];
		
		String password = "1111";
		String Inputpwd = args[1];
		
		System.out.println("Hi");
		if(InputId.equals(Id) && Inputpwd.equals(password)) {
			System.out.println("Master!");
		} else {
			System.out.println("Who are you?");
		}

	}

}
