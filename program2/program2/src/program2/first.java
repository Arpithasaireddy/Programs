package program2;

public class first {

	public static void main(String[] args) {
		String s = "hey 123 my world";

		System.out.println("print vowels: ");
		printVowels(s);

		System.out.println("print consonents");
		printConsonents(s);

		System.out.println("print digits");
		printDigits(s);
	}

	static void printVowels(String s) {

		for (int i = 0; i < s.length(); i++) {

			if ((s.charAt(i) == 'a') || (s.charAt(i) == 'e')
					|| (s.charAt(i) == 'i') || (s.charAt(i) == 'o')
					|| (s.charAt(i) == 'u'))

				System.out.println(s.charAt(i));
		}
	}

	static void printConsonents(String s) {
		for (int i = 0; i < s.length(); i++) {

			if ((s.charAt(i) != 'a') && (s.charAt(i) != 'e')
					&& (s.charAt(i) != 'i') && (s.charAt(i) != 'o')
					&& (s.charAt(i) != 'u'))

				System.out.println(s.charAt(i));
		}
	}

	static void printDigits(String s) {

		for (int i = 0; i < s.length(); i++) {

			if ((s.charAt(i) == '0') || (s.charAt(i) == '1')
					|| (s.charAt(i) == '2') || (s.charAt(i) == '3')
					|| (s.charAt(i) == '4') || (s.charAt(i) == '5')
					|| (s.charAt(i) == '6') || (s.charAt(i) == '7')
					|| (s.charAt(i) == '8') || (s.charAt(i) == '9'))

				System.out.println(s.charAt(i));
		}
	}
}

	
