public class ValidateSignup {
    private String username;
    
    private char[] password;

    public ValidateSignup(String username, char[] password) {
        this.username = username;
        this.password = password;
    }
    
    public static boolean validateUsername(String username){
        return username != null && username.matches("([A-Za-z0-9_]+)");
        
    }
    public static boolean validatePassword(char[] password){
    	//fix potential sql injection via unfiltered password.
        return password != null && password.length > 6 && password.length < 30;
    }
    
    
}