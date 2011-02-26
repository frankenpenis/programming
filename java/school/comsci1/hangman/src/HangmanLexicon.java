/*A program containing words
 *  to play hangman game
 *
 */

 public class HangmanLexicon {
 	private int wordCount = 10;
 	public int getWordCount(){
 		return 4;
 	}
 	public String getWord(int index){
 		switch (index){
 		 case 0: return "HOW";
 		 case 1: return "NOW";
 		 case 2: return "BROWN";
 		 case 3: return "COW";
 		
 		 default: return "UNKNOWN";
 		 }
 		 	
 		}//end getWord
 	}//end Class
