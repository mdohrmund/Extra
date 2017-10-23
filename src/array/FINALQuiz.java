package array;
import java.util.Scanner;
public class FINALQuiz {
	private static String[] questions = {"What does abuela mean in English? \nA) mom \nB) brother \nC) Grandma", "What does cantar mean in English? \nA to sing \nB to drink \nC to run", 
		"What does el centro comercial mean in English? \nA mall \nB pencil \nC tv show", "What does comer mean in English? \nA to draw \nB to write \nC to eat",
		"What does hacer la tarea mean in English? \nA to exercise \nB to do homework \nC to shop","What does juegos de mesa mean in English? \nA board games \nB to play football \nC table", 
		"What does 'leer' mean in English? \nA to fish \nB to read \nC to hunt",
		"What does 'playa' mean in English? \nA boy \nB pool \nC beach", "What does 'trabajar' mean in English? \nA to be short \nB to work \nC to sleep",
		"What does 'siempre' mean in English? \nA always \nB sometimes \nC never"};
	private static String[] answers = {"C", "A", "A", "C", "B", "A", "B", "C", "B", "B"};
	private static final double maxCorrect = answers.length;
	private static double correctAnswers = 0.0;
	private static Scanner in = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user = "Yes";
	
		while (user.equalsIgnoreCase("Yes")) {
		endGame();
		System.out.println("Would you like to play again?");
		user = in.nextLine();
		}
		in.close();
	}
	
	
	
	private static void endGame() {
		for(int i = 0; i < questions.length; i++) {
			System.out.println(questions[i]);
			System.out.print("Answer >> ");
			String playerAnswer = in.nextLine();
			
			while (!playerAnswer.equalsIgnoreCase("A") &&
					!playerAnswer.equalsIgnoreCase("B") &&
					!playerAnswer.equalsIgnoreCase("C")) {
				System.out.println("Please enter A, B, or C");
				System.out.print("Answer >> ");
				playerAnswer = in.nextLine();
			}
			
			if(playerAnswer.equalsIgnoreCase(answers[i])) {
				System.out.println("Correct!");
				correctAnswers++;
			} else {
				System.out.println("Wrong!");
			}
			}
		System.out.println("You scored " + ((correctAnswers/maxCorrect) * 100) + "%");
 	}

}
