import java.util.*;
import java.util.Random.*;
import java.lang.Object;
public class hangman2
{
    static String magic_word;
    static String guessed_so_far = "";
 
    public static void menu(){ //starts the game asks you if you want to play
        int y;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 for a New Game or 0 to Exit:");
        y = in.nextInt();
 
    }
 
    public static void randomize(){ // contains the dictionary of words, randomizes them and WILL PRINT OUT DASHES(TO COME)
        Random r = new Random();
        int randvalue = r.nextInt(19);
        String x;
        String[] possible_values = new String[] {"Happy", "Apple", "Banana", "Cherry", "Plum", "Kiwi", "Peach", "Starfruit", "Carrot", "Tomato", "Potatoe", "Broccoli", "Pepper",
                "Onion", "Necterine", "Clementine", "Grape", "Honeydew", "Peas", "Leeks" };
        magic_word = possible_values[randvalue];
        System.out.println("You Have 6 Incorrect Guesses Left");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(magic_word); // makes string muteable
        for(int i= 1; i<= magic_word.length(); i++){ //prints out dashes
            System.out.print("_ ");
        }
    }
 
    public static boolean isinword(String letter) { 
        boolean res = false;
 
        for(int i = 0; i < magic_word.length(); i++) {
            if (Character.toString(magic_word.charAt(i)).equalsIgnoreCase(letter)) {
                res = true;
                System.out.println("true");
                break;
            }
        }
 
        return res;
    }
 
    public static void guesser(){
        String z;
        int i = 6; //incorrect guesses counter
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter a letter"); // asks for the user to enter a letter
        z = in.nextLine();
        if(i > 0){  
            if(isinword(z)){ //if z is in the word then it will not subtract the number of incorrect guesses
                if(true){
                    System.out.print(magic_word.charAt(i));
                    System.out.println("You Have "+i+" incorrect guesses left");
                } 
                else {
                    i--;
                    System.out.println("_ ");
                    System.out.println("You Have "+i+" incorrect guesses left.");
                    }
            }
            if(i > 0)
                guesser();
        }
    }
 
    public static void main(String[]args){
        System.out.println("Welcome to Hangman!");
        int y = 1;
        menu();
        if(y == 1){
            randomize();
            guesser();
        }else if( y != 0){
            System.out.println("Please Enter 1  for a new game or 0 to exit");
        }else{
            System.out.println("Goodbye");
        }
    }
}