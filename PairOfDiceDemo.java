package Program1;

public class PairOfDiceDemo {

	public static void main(String[] args) {
		PairOfDice dice = new PairOfDice();
		
		for (int i = 0; i < 100; i++) {
			dice.rollDice();
			System.out.println(dice);
		}
	}

}
