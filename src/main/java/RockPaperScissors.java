import java.util.Scanner;

public class RockPaperScissors {

	private static Scanner player1;
	private static Scanner player2;

	public static void main(String[] args) {
		
		String[] items = {"Rock","Paper","Scissors"};
		System.out.println("1. Rock	"+" 2. Paper "+" 3. Scissors");
		System.out.println("Player 1: Choose your item: ");
		
		player1 = new Scanner(System.in);
		int choose1 = player1.nextInt();
		System.out.println("Player 2: Choose your item: ");
		player2 = new Scanner(System.in);
		int choose2 = player2.nextInt();
		
		if(choose1 == 1 && choose2 == 2) {
			System.out.println("The Winner is Player 2 with " + items[choose2-1]);
		}
		if(choose1 == 2 && choose2 == 3) {
			System.out.println("The Winner is Player 2 with " + items[choose2-1]);
		}
		if(choose1 == 3 && choose2 == 1) {
			System.out.println("The Winner is Player 1 with "  + items[choose1-1]);
		}
		if(choose1 == 1 && choose2 == 3) {
			System.out.println("The Winner is Player 1 with "+ items[choose1-1]);
		}
		if(choose1 == 3 && choose2 == 2) {
			System.out.println("The Winner is Player 1 with "+ items[choose1-1]);
		}
		if(choose1 > 3 || choose2 > 3) {
			System.out.println("You choose wrong item!");
		}
		else
		{
			System.out.println("You choose the same item!");
		}
		

	}
}