import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class pdaAccept {
	
	Queue<state> states = new LinkedList<state>();

	public static void main(String[] args) {
		File text = new File("/Users/dylandegrood/Documents/GitHub/CS357_Project/CS357_Project/CS352_Proj/src/input.txt");
		
		int totalStates;;
		String[] alphabet;
		String[] stackAlphabet;
		int startState;
		String[] endStates;
		
		Scanner scnr;
		try {
			scnr = new Scanner(text);
			//Reading each line of file using Scanner class
			
			totalStates = scnr.nextInt();
			System.out.println(totalStates);
			scnr.nextLine();
			
			alphabet = scnr.nextLine().split(" ");
			
			stackAlphabet = scnr.nextLine().split(" ");
			for(int i = 0; i < stackAlphabet.length; i++) {
				System.out.println("" + stackAlphabet[i]);
			}
			
			startState = scnr.nextInt();
			scnr.nextLine();
			
			endStates = scnr.nextLine().split(" ");
			for(int i = 0; i < endStates.length; i++) {
				System.out.println("" + endStates[i]);
			}
						
			
	        int lineNumber = 1;
	        while(scnr.hasNextLine()){
	            String line = scnr.nextLine();
	            System.out.println("line " + lineNumber + " :" + line);
	            lineNumber++;
	            
	        }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
