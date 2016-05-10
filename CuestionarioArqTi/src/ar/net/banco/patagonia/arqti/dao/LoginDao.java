package ar.net.banco.patagonia.arqti.dao;

public class LoginDao {

	
	public static boolean validate(String user, String pwd) {
		Boolean error = false;
		
		if (user.equals("")) {
			
			error = true;
		}

		else if (pwd.equals("")) {
			
			error = true;
		} else if (!user.equalsIgnoreCase(pwd)) {
			
			error = true;
		} else {
			error = false;
		}

		if (error) {
			return false;
		} else {
			return true;
		}
		
	}
	

}
