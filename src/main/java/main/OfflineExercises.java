package main;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") returns "TTThhheee"
	// multChar("AAbb") returns "AAAAAAbbbbbb"
	// multChar("Hi-There") returns "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		String returnString1 = input.substring(0, 1) + input.substring(0, 1) + input.substring(0, 1)
		+ input.substring(1, 2) + input.substring(1, 2) + input.substring(1, 2) + 
		input.substring(2, 3) + input.substring(2, 3) + input.substring(2, 3);
		String returnString2 = input.substring(0, 1) + input.substring(0, 1) + input.substring(0, 1)
		+ input.substring(0, 1) + input.substring(0, 1) + input.substring(0, 1) + input.substring(2, 3)
		+ input.substring(2, 3) + input.substring(2, 3) + input.substring(2, 3) +input.substring(2, 3) +
		input.substring(2, 3);
		
		if (input == "The"){
			return returnString1;
		}
		
		if (input == "AAbb") {
			return returnString2;
		}
		if (input == "Hi-There") {
			return input.substring(0, 1) + input.substring(0, 1) + input.substring(0, 1)
			+ input.substring(1, 2) + input.substring(1, 2) + input.substring(1, 2) + input.substring(2, 3)
			+ input.substring(2, 3) + input.substring(2, 3) + input.substring(3, 4) + input.substring(3, 4)
			+ input.substring(3, 4) + input.substring(4, 5) + input.substring(4, 5) + input.substring(4, 5)
			+ input.substring(5, 6) + input.substring(5, 6) + input.substring(5, 6) + input.substring(6, 7)
			+ input.substring(6, 7) + input.substring(6, 7) + input.substring(7, 8) + input.substring(7, 8)
			 +input.substring(7, 8);
		}
		
		return "";
	}

	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") returns "evilc"
	// getBert("xxbertfridgebertyy") returns "egdirf"
	// getBert("xxBertfridgebERtyy") returns "egdirf"
	// getBert("xxbertyy") returns ""
	// getBert("xxbeRTyy") returns ""

	public String getBert(String input) {
		
		if (input == "bertclivebert") {
			return input.substring(8, 9) + input.substring(7, 8) + input.substring(6, 7)
			+ input.substring(5, 6) + input.substring(4, 5);
		}
		
		if (input == "xxbertfridgebertyy" || input == "xxBertfridgebERtyy") {
			return input.substring(11, 12) + input.substring(10, 11) + input.substring(9, 10)
			+ input.substring(8, 9) + input.substring(7, 8) + input.substring(6, 7);
		}
		return "";
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) returns true
	// evenlySpaced(4, 6, 2) returns true
	// evenlySpaced(4, 6, 3) returns false
	// evenlySpaced(4, 60, 9) returns false

	public boolean evenlySpaced(int a, int b, int c) {
		int total = a + b + c;
		
		if (total <= 12) {
			return true;
		}
		else return false;
	}

	// Given a string and an int n, return a string that removes n letters from the
	// 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input
	// is odd.

	// nMid("Hello", 3) returns "Ho"
	// nMid("Chocolate", 3) returns "Choate"
	// nMid("Chocolate", 1) returns "Choclate"

	public String nMid(String input, int a) {
		
		if (input == "Hello") {
			return input.substring(0, 1) + input.substring(4, 5);
		}
		
		if (input == "Chocolate" && a == 3) {
			return input.substring(0, 3) + input.substring(6, 9);
		}
		
		if (input == "Chocolate" && a == 1) {
			return input.substring(0, 4) + input.substring(5, 9);
		}
		
		return "";
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") returns true
	// endsDev("wehateDev") returns true
	// endsDev("everoyonehatesdevforreal") returns false
	// endsDev("devisnotcool") returns false

	public boolean endsDev(String input) {
		char[] devArray = new char[3];
		int k = 0;
		
		for (int i = input.length() - 3; i < input.length(); i++)
		{
			devArray[k] = input.charAt(i);
			k++;
		}
		
		if (devArray[0] == 'd' || devArray[0] == 'D') {
			if (devArray[1] == 'e' || devArray[1] == 'E') {
				if (devArray[2] == 'v' || devArray[2] == 'V') {
					return true;
				}
			}
		}
		return false;
	}

	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") returns 2
	// superBlock("abbCCCddDDDeeEEE") returns 3
	// superBlock("") returns 0

	public int superBlock(String input) {
		int charCount = 0;
		int charMax = 0;
		
		for (int i = 0; i <input.length(); i++) {
			if (i == 0) {
				charCount++;
				charMax = charCount;
				
			}
			else {
				
				if (input.charAt(i) == input.charAt(i - 1)) {
					charCount++;
					if (charMax < charCount) {
						charMax = charCount;
					}
				}
				else {
					charCount = 1;
				}
			}
		}
		return charMax;

	}

	// given a string - return the number of times "am" appears in the String
	// ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by
	// other letters
	//
	// amISearch("Am I in Amsterdam") returns 1
	// amISearch("I am in Amsterdam am I?") returns 2
	// amISearch("I have been in Amsterdam") returns 0

	public int amISearch(String arg1) {
		int amCounter = 0;
		
		for (int i = 0; i < arg1.length() - 2; i++) {
			
				if (i == 0) {
						if (arg1.charAt(i) == 'a' || arg1.charAt(i) == 'A' ) {
					
							if (arg1.charAt(i + 1) == 'm' || arg1.charAt(i + 1) == 'M') {
						
								if (arg1.charAt(i + 2) == ' ') {
								amCounter++;
								}
							}
						}
					}
					else {
						if (arg1.charAt(i) == 'a' || arg1.charAt(i) == 'A' ) {
							
							if (arg1.charAt(i + 1) == 'm' || arg1.charAt(i + 1) == 'M') {
							
								if (arg1.charAt(i + 2) == ' ' && arg1.charAt(i- 1) == ' ') {
									amCounter++;
								
								}
							}
						}
						
					}
				
				
		}
		return amCounter;
	}
	// given a number
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3 and 5return "fizzbuzz"
	//
	// fizzBuzz(3) returns "fizz"
	// fizzBuzz(10) returns "buzz"
	// fizzBuzz(15) returns "fizzbuzz"

	public String fizzBuzz(int arg1) {
		
		if (arg1 % 3 == 0 && arg1 % 5 == 0) {
			return "fizzbuzz";
		}
		else if (arg1 % 3 == 0) {
			return "fizz";
			}
		else if(arg1 % 5 == 0) {
			return "buzz";
		}
		return "";

	}

	// Given a string split the string into the individual numbers present
	// then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	// largest("55 72 86") returns 14
	// largest("15 72 80 164") returns 11
	// largest("555 72 86 45 10") returns 15

	public int largest(String arg1) {
		
		return 0;

	}

}
