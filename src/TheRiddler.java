import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score=0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer=JOptionPane.showInputDialog(null, "Forward I am heavy, backward I am not. What am I?");

		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(answer.equals("Forward I am ton, backward I am not.")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score+=1;
		}

		// 5. Otherwise, say "wrong" and tell them the answer
		else{
			JOptionPane.showMessageDialog(null, "Dude, that's the wrong answer you succ.");
		}

		// 6. Add some more riddles
		String answer1=JOptionPane.showInputDialog(null, "What's black, white, and red all over?");

		// 2. Make a pop up to show the score.
		
	}
}

