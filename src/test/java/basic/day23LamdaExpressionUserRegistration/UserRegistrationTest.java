package basic.day23LamdaExpressionUserRegistration;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;



 public class UserRegistrationTest {
	UserRegistration myobj;

	@Before
	public void initialize() {
		myobj = new UserRegistration();
	}

	@Test
	public void shouldReturnTrueIfFirstNameStartsWithCapAndHasMinimumThreeCharacters() {
		assertTrue(myobj.validateUserDetails("Mohammad"));
	}

}
