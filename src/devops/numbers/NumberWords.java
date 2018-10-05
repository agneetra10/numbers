package devops.numbers;

public class NumberWords {
	
	public static final String[] units = { "", "One", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
			"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"Eighteen", "Nineteen" };

	public static final String[] tens = { 
			"", "",	"Twenty", "Thirty",	"Forty", "Fifty", "Sixty", "Seventy", "Eighty",	"Ninety"
			};

	public String toWords( int number ) {
		String result = "" ;
		if (number < 0 || number > 999) {
			result = "Number out of range";
		}
		else if (number > 0 && number < 20) {
			result = units[number];
		}
		else if (number >= 20 && number <= 99) {
			result = tens[number / 10] + " " + units[number % 10];
		}
		else {
			if ((number / 10) % 10 == 1) {
				result = units[number / 100] + " Hundred " + units[number % 100];
			} else {
				result = units[number / 100] + " Hundred " + tens[(number / 10) % 10] + " " + units[number % 10];
			}
		}
		return result.trim() ;
	}
}
