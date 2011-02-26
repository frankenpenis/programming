/*Programming Assignment #6  Item 1
* Tyler Groves
*  12/8/2010
*/

import java.util.*;
public class Hangman {

Random randNum = new Random();
HangmanLexicon hnglex = new HangmanLexicon();
public static char [] currentWordArray;
public static char [] RightGuessArray;
public static char [] availGuessArray = { 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o', 
		'p','q','r','s','t','u','v','w','x','y','z'};
public static char [] currGuessArray = availGuessArray;
String selectedWord;
static int gameOver = 0;

public Hangman() {
	int totalWords = hnglex.getWordCount();
}

public void beginPlay() {
	selectedWord = hnglex.getWord(randNum.nextInt(4)).toLowerCase();
	currentWordArray = selectedWord.toCharArray();
	RightGuessArray = new char[currentWordArray.length];
	for (int i = 0;i < RightGuessArray.length;i++) {
		RightGuessArray[i] = '-';
	}
	System.out.println("Welcome to Hangman!");
	System.out.print("Current Word: ");
	System.out.print(RightGuessArray);
	System.out.print("\n");
		this.guess();
}

public void guess() {
	Scanner console = new Scanner(System.in);
	int maxTries = 9;
	
    while(gameOver != 1) {

        System.out.println("Please enter a letter: ");
        char guessedLetter = console.next().toLowerCase().charAt(0);
    		if(isinword(guessedLetter)) {
    			System.out.println("Correct!");
    			System.out.print("Current Word: ");
    			System.out.print(RightGuessArray);
    			System.out.print("\n");
        		
        	}
        	else {
        		System.out.println("Wrong!");
        		System.out.print("Current Word: ");
        		System.out.print(RightGuessArray);
        		System.out.print("\n");
        		maxTries--;
        		System.out.println("You have " + maxTries + " tries left");
        		
        	}
        	int dashCount = 0;
          	for (int i = 0;i < RightGuessArray.length; i++) {
        		if (RightGuessArray[i] == '-') {
        			dashCount++;
        		}
        	}
    	    if (maxTries == 0) { gameOver = 1; }
    	    if (dashCount == 0) { gameOver = 1; }
 
    }

}

public static boolean isinword(char letter) { 
	boolean res = false;
	for (int i = 0; i < currentWordArray.length; i++) {
		if(currentWordArray[i] == letter) {
			RightGuessArray[i] = letter;
			remove(letter);
			res = true;
			
		}
	}
	return res;
 
}

public static void remove(char c)
{
	  int size = 26;
	  for(int i = 0; i < size; i++) {
	        if(availGuessArray[i] == c)
	    break;
	  for(int k = i; k < size; k++) {
		  currGuessArray[k] = availGuessArray[k+1];
	  size--;
	  }
	  }
	}
}
