package lotto;
import java.util.*;

public class LottoDriver {

	public static void main(String[] args) { 
		int[] numbers = new int[5];
		int[] powerball = new int[1];
		int option;

		Scanner kb = new Scanner(System.in);
		System.out.print("Select an option\n");
		System.out.println("1: Powerball \n2: Florida Lotto");
		option = kb.nextInt(); 
		
		if (option == 1){
			System.out.println("Your numbers are:");
			powerBallNumbers();
			System.out.println("Powerball:");
			powerBall(powerball);
		}
		if (option == 2){
			//		System.out.print("Your numbers are:");
			//		powerBallNumbers(numbers);
		}
		kb.close();
	}

	public static int[] powerBallNumbers(){
		ArrayList<Integer> balls = new ArrayList<Integer>();
		for (int i = 0; i < 62; i++)
			balls.add(i);

		Collections.shuffle(balls);

		int[] result = new int[5];
		for (int i  = 0; i < 5; i++)
			result[i] = balls.get(i);

		return result;
	}

	public static int powerBall(int[] array){
		List<Integer> balls = new ArrayList<Integer>(42);
		for (int i = 0; i < 26; i++)
			balls.add(i);

		Collections.shuffle(balls);
		int result = balls.get(0);
		return result;

	}

}
