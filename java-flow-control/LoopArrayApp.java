
public class LoopArrayApp {

	public static void main(String[] args) {
		
		String[] users = new String[3];
		users[0] = "eunryong";
        users[1] = "Lee";
        users[2] = "Kim";
        
        for(int i = 0; i<users.length; i++) {
        	System.out.println(users[i]+",");
        }

	}

}
