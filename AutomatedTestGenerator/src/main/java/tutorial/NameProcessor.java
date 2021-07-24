package tutorial;

public class NameProcessor {

	public String concatenateFirstNameLastName(String firstName, String lastName) throws Exception {
		if(firstName == null) {
			throw new Exception("First Name cannot be null");
		} else if(lastName == null) {
			throw new Exception("Last Name cannot be null");
		}
		return firstName + lastName;
	}
}
