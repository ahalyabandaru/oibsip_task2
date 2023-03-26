import java.util.Scanner;

public class NumberGuess {

	public static void guessingNumber(int K)
	{
		
		Scanner sc = new Scanner(System.in);

		int number = 1 + (int)(100* Math.random());

		int i, guess;

        

		for (i = 0; i < K; i++) {

			System.out.println("Guess the number:");

			guess = sc.nextInt();

			if (number == guess) {
				System.out.println("CONGRATULATIONS !!!");

			    System.out.println(" You guessed the number.");

				break;
			}

			else 
                if (number > guess && i != K - 1) {
				
                    System.out.println("The number is greater than " + guess);
			
                }
			else 
                if (number < guess && i != K - 1) {
				System.out.println("The number is less than " + guess);
			
            }
		}

		if (i == K) {
			System.out.println("You have exhausted "+ K+" trials.");

            System.out.println("YOU LOST !!!!");

			System.out.println("The number was " + number);
		
        }
	}

	
	public static void main(String arg[])
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("        NUMBER GUESSING GAME        ");

		System.out.println("A number is chosen  between 1 to 100. ");

        System.out.println("Enter number of trails : ");

        int K=sc.nextInt();

		System.out.println( "Guess the number within "+K+" trials.");

		guessingNumber(K);
	}
}
