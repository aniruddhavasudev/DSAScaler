package RevisionInterviewbit;
import java.util.ArrayList;
import java.util.List;

public class PasswordValidator {
    public static boolean isWeakPassword(String password, List<String> weakPasswords) {
        // Check if the password is in the dictionary of weak passwords
        if (weakPasswords.contains(password)) {
            return true;
        }

        // Check if a substring of the password is a word in the dictionary of weak passwords
        for (String word : weakPasswords) {
            if (password.contains(word)) {
                return true;
            }
        }

        // Check if the password is all numerical
        if (password.matches("\\d+")) {
            return true;
        }

        // Check if all characters are uppercase or lowercase
        if (password.matches("[A-Z]+") || password.matches("[a-z]+")) {
            return true;
        }
        // Check if the password is shorter than 8 characters
        if (password.length() < 8) {
            return true;
        }

        return false;
    }

    public static List<String> getPasswordStrength(String[] passwords, List<String> weakPasswords) {
    	 List<String> pradyumna = new ArrayList<>();
    	
        for (String password : passwords) {
            if (isWeakPassword(password, weakPasswords)) {
            	pradyumna.add("weak");
            } else {
            	pradyumna.add("strong");
            }
        }
		return pradyumna;
    }
    
   

    public static void main(String[] args) {
        String[] passwords = {"liketoCoDe", "teaMAKEsmehappy", "abracadabra", "password", "blackcoffeelSthebest"};
        List<String> common_words = new ArrayList<>();
        common_words.add("coffee");
        common_words.add("coding");
        common_words.add("happy");
        
       System.out.println((getPasswordStrength(passwords, common_words)));
    }
}