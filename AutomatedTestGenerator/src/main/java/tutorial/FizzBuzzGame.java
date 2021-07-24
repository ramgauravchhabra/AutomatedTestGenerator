package tutorial;

public class FizzBuzzGame {

	public String fizzOrBuzz(Integer number) {
		if(number % 5 == 0 && number % 3 == 0) {
			return "FIZZ-BUZZ";
		} else if(number % 5 == 0) {
			return "BUZZ";
		} else if(number % 3 == 0) {
			return "FIZZ";
		}
		return null;
	}
}
