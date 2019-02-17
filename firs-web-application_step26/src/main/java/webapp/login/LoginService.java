package webapp.login;

public class LoginService {

	public boolean validateUser(String user, String password){
		
		if(user.equalsIgnoreCase("j") && password.equals("j")){
			return true;
		}
		return false;
	}
}

 


 