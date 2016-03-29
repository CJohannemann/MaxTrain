package murach.rectangle;

public class GameApp {
	
	public static void main(String[] args) {
		System.out.println("Welcome to the dice game");
		Dice firstDice = new Dice int(6);
		firstDice.roll();
		System.out.println(firstDice.read());
	}

}
