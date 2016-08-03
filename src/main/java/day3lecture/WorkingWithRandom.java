package day3lecture;

public class WorkingWithRandom {

	public static void main(String[] args) {
		
		int numDice = 10;
		int sidesOfDice = 6;
		
		for (int i = numDice; i > 0; i--) {
			
			int diceRoll = (int) ((Math.random() * sidesOfDice) + 1);
			System.out.println(diceRoll);
		}
	}
}
