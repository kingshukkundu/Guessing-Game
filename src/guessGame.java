import java.util.Scanner;
import java.util.Random;
public class guessGame {
	public static void main(String[] args) {
		Random rand= new Random();
		Scanner in=new Scanner(System.in);
		
		boolean game =true;
		int a;
		while(game) {
			System.out.println("Guess a number between 1 to 100:");
			int numberOfTries = 1;
			int rand_int= rand.nextInt(100);
			boolean winGame = false;
			 while(!winGame) {
				 String line= null;
				 lineLoop:
				 while (line == null) {
				      line = in.nextLine();
				      try {
				        a = Integer.valueOf(line);
				        break lineLoop;
				      } catch (NumberFormatException e) {
				        System.out.println("Expected numeric value, not: '" + line + "', please try again.\n");
				        line = null;
				      }
				    }
				/* while (!in.hasNextInt()) {
			        System.out.println("That's not a valid input!");
			        in.next(); 
			        } 
				   a= in.nextInt(); */
				a = Integer.valueOf(line);
				if(rand_int == a) {
					System.out.println("You win. Number of tries = " + numberOfTries);
					winGame = true;
					}
				else if(a> rand_int) {
						System.out.println("Try a smaller number");
						numberOfTries++;
					}
				else if(a< rand_int) {
					System.out.println("Try a larger number");
					numberOfTries++;
					}
				
				}
			System.out.println("Do you want to play again?");
			System.out.println("Type Yes or Y to play again and No or N to quit"); 
				boolean playAgainCheck = true;
				while (playAgainCheck) {
					Scanner input = new Scanner(System.in);
				    String answer = input.nextLine();
				    answer = answer.replaceAll("\\s+", "");
				if ( answer.equalsIgnoreCase("yes") || "y".equalsIgnoreCase(answer)) {
					System.out.println("You are awesome");
					//playAgainCheck= false;
					break;   
				}
				else if( answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no")) {
					game= false;
					System.out.print("Have a nice Day. Go enjoy the real world. :D");
					playAgainCheck=false;
				}
				else {
					System.out.println("You did not provide a valid input. Please try again.");
				}
				input.close();
				}		
			}
		in.close();
	}

}		
	

