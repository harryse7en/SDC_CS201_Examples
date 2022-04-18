package ArraySort;
import java.util.*;

/* ******** ARRAY SORTING ********
 *    by harryse7en, 12/12/2021
 * 
 * This Java application was created for Study.com course #CS201
 * 
 * Develop a program that asks the user to enter a capital for a U.S. state. Upon receiving the user input,
 * the program reports whether the user input is correct. For this application, the 50 states and their capitals
 * are stored in a two-dimensional array in order by state name. Display the current contents of the array then
 * use a bubble sort to sort the content by capital. Next, prompt the user to enter answers for all the state
 * capitals and then display the total correct count. The user's answer is not case-sensitive.
 */

public class Main {	
	
	public static void main(String[] args) {

		// Variables
		BubbleSort bubble = new BubbleSort();
		Scanner sc = new Scanner(System.in);
		int score = 0;
		String scanline;

		String[][] stateCaps = {
			{"Alabama","Montgomery"},
			{"Alaska","Juneau"},
			{"Arizona","Phoenix"},
			{"Arkansas","Little Rock"},
			{"California","Sacramento"},
			{"Colorado","Denver"},
			{"Connecticut","Hartford"},
			{"Delaware","Dover"},
			{"Florida","Tallahassee"},
			{"Georgia","Atlanta"},
			{"Hawaii","Honolulu"},
			{"Idaho","Boise"},
			{"Illinois","Springfield"},
			{"Indiana","Indianapolis"},
			{"Iowa","Des Moines"},
			{"Kansas","Topeka"},
			{"Kentucky","Frankfort"},
			{"Louisiana","Baton Rouge"},
			{"Maine","Augusta"},
			{"Maryland","Annapolis"},
			{"Massachusetts","Boston"},
			{"Michigan","Lansing"},
			{"Minnesota","St. Paul"},
			{"Mississippi","Jackson"},
			{"Missouri","Jefferson City"},
			{"Montana","Helena"},
			{"Nebraska","Lincoln"},
			{"Nevada","Carson City"},
			{"New Hampshire","Concord"},
			{"New Jersey","Trenton"},
			{"New Mexico","Santa Fe"},
			{"New York","Albany"},
			{"North Carolina","Raleigh"},
			{"North Dakota","Bismarck"},
			{"Ohio","Columbus"},
			{"Oklahoma","Oklahoma City"},
			{"Oregon","Salem"},
			{"Pennsylvania","Harrisburg"},
			{"Rhode Island","Providence"},
			{"South Carolina","Columbia"},
			{"South Dakota","Pierre"},
			{"Tennessee","Nashville"},
			{"Texas","Austin"},
			{"Utah","Salt Lake City"},
			{"Vermont","Montpelier"},
			{"Virginia","Richmond"},
			{"Washington","Olympia"},
			{"West Virginia","Charleston"},
			{"Wisconsin","Madison"},
			{"Wyoming","Cheyenne"}
		};
		
		// Interact with the user
		System.out.println("Hello there human.  I want to play a game with you!");
		System.out.println("How well do you know the capital cities of each US state?\n");
		System.out.println("Here is the list of each state and capital:");

		// Loop to show all elements of the 2D array to the user
		for (int i = 0; i < 50; i++) {
			System.out.print(stateCaps[i][0] + " - " + stateCaps[i][1]);
			if (i < 49) {
				if (i % 2 == 0) {
					System.out.print(",\t\t");
				} else {
					System.out.println(",");
				}
			} else {
				System.out.print("\n\n\n\n");
			}
		}

	   // Sort the 2D array using a Bubble sort
	   bubble.bubbleSort(stateCaps);
	   
	   System.out.println("Ok, now try to name the state for each of these capital cities.");		

	   // Loop to ask the user for answers of all 50 states
	   for (int i = 0; i < 50; i++ ) {
		   System.out.println("What state has the capital of " + stateCaps[i][1] + ": ");
		   // toLowerCase used so user's answer is case insensitive
		   scanline = sc.nextLine().toLowerCase();
		   if (scanline.equals(stateCaps[i][0].toLowerCase())) {
			   System.out.println("Correct!\n");
			   // Increase score for each correct answer
			   score++;
		   } else {
			   System.out.println("Nope, it's actually " + stateCaps[i][0] + "\n");
		   }			
		}
		
		System.out.println("Ok, that's all of them.  You got " + score + " out of 50  (" + ((float)score/50.0)*100.0  + "%)");
		System.out.println("Thanks for playing!");		

		sc.close();
	}
}
