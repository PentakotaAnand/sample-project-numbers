package numbers;

public class NumberWords {
	public static final String[] units = { "", "One", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
			"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"Eighteen", "Nineteen" };
	
	public static final String[] tens = { "","","Twenty","Thirty","Forty","Fifty",
			"Sixty","Seventy","Eighty","Ninety"};
	
	public String toWords( int number ) {
		if (number < 0) {
			return "Number out of range";
		}

		if (number < 20) {
			return units[number];
		}

		if (number < 100) {
			return tens[number / 10] + ((number % 10 != 0) ? " " : "") + units[number % 10];
		}

		if (number < 1000) {
			return units[number / 100] + " Hundred" + ((number % 100 != 0) ? " " : "") + toWords(number % 100);
		}
		
		return "Number out of range";
	}

}
