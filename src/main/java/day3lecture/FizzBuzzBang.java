package day3lecture;

public class FizzBuzzBang {
	
	public static void main(String[] args) {
		
		for (int x = 1; x <= 110; x++)
		
				if ((x % 3 == 0) && (x % 5 == 0) && (x % 7 == 0)) {
					System.out.println("FizzBuzzBang!");
				} else if ((x % 3 == 0) && (x % 5 == 0)) {
					System.out.println("FizzBuzz");
				} else if ((x % 3 == 0) && (x % 7 == 0)) {
					System.out.println("FizzBang");
				} else if ((x % 5 == 0) && (x % 7 == 0)) {
					System.out.println("BuzzBang");
				} else if (x % 3 == 0) {
					System.out.println("Fizz");
				} else if (x % 5 == 0) {
					System.out.println("Buzz");
				} else if (x % 7 == 0) {
					System.out.println("Bang");
				} else {
					System.out.println(x);
				}
		
	}

}
