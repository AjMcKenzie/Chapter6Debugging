package gameZone;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 * @author am312792
 *
 */
public class RandomGuess3
{

	public static void main(String[] args) 
	{
		Random r = new Random();
		final int LOW = 0;
		final int HIGH = 9;
		String msg;
		int result = r.nextInt(10) + LOW;
		int result2 = r.nextInt(10) + LOW;
		int result3 = r.nextInt(10) + LOW;
		int userGuess;
		int userGuess2;
		int userGuess3;
		
		for(int x =1; x <= 4; ++x)
		{
		userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose a number between " + LOW + " and " + HIGH));
		userGuess2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose a number between " + LOW + " and " + HIGH));
		userGuess3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose  number between " + LOW + " and " + HIGH));
		
		if(userGuess == result && userGuess2 == result2 && userGuess3 == result3)//All numbers
		{
			msg ="\n You win a million dollars!!";
		}
		if(userGuess == result && userGuess2 != result2 && userGuess3 != result3)//First number
		{
			msg = "\n You got the first guess right.";
		}
		if(userGuess != result && userGuess2 == result2 && userGuess3 != result3)//Second number
		{
			msg = "\n You got the second guess right.";
		}
		if(userGuess != result && userGuess2 != result2 && userGuess3 == result3)//Third number
		{
			msg = "\n You got the third guess right.";
		}
		else
			msg = "\n Your a loser, get out!!";
		
		JOptionPane.showMessageDialog(null, "The numbers are " + result + ", " + result2 + ", and " + result3 + msg);
		
		}
		
	}

}
