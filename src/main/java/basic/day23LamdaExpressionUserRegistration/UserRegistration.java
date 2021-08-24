package basic.day23LamdaExpressionUserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface ValidateUserDetails {
	public Boolean validateUserDetails(String name);
}

public class UserRegistration {
	public static void main(String[] args) {

		ValidateUserDetails fName = (name) -> {
			String firstName = name;
			String regex = "^([A-Z][a-z]{2,})$";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(firstName);
			return m.matches();
		};
		System.out.println(fName.validateUserDetails("Mohammad"));

		ValidateUserDetails lName = (name) -> {
			String lastName = name;
			String regex = "^([A-Z][a-z]{2,})$";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(lastName);
			return m.matches();
		};
		System.out.println(lName.validateUserDetails("Mohsin"));

		ValidateUserDetails emailId = (name) -> {
			String email = name;
			String regex = "^([a-zA-Z0-90_.+-]+)@([a-z0-9]+).([a-z]{2,4})(.[a-z]{2,4})?$";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(email);
			return m.matches();
		};
		System.out.println(emailId.validateUserDetails("mdmohsin41439@gmail.com"));

		ValidateUserDetails mobileNumber = (name) -> {
			String mobileNum = name;
			String regex = "^(91 )[897][0-9]{9}$";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(mobileNum);
			return m.matches();
		};
		System.out.println(mobileNumber.validateUserDetails("91 9908514276"));

		ValidateUserDetails passWord = (name) -> {
			String password = name;
			String regex = "[a-zA-Z0-9]{7,}#";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(password);
			return m.matches();
		};
		System.out.println(passWord.validateUserDetails("Md78678#"));
	}

	public boolean validateUserDetails(String string) {
		String firstName = string;
		String regex = "^([A-Z][a-z]{2,})$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(firstName);
		return m.matches();
	}
}
