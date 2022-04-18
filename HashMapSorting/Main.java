import java.util.*;

/* ******** HASHMAP SORTING AND SEARCHING ********
 *            by harryse7en, 12/12/2021
 * 
 * This Java application was created for Study.com course #CS201
 * 
 * Now revise the code to store the pairs of each state and its capital in a Map using the HashMap function.
 * Display the content of the Map, then use the TreeMap class to sort the map while using a binary search tree
 * for storage. Next, your program should prompt the user to enter a state and it should then display the capital
 * for the state.
 */

public class Main {

	public static void main(String[] args) {

		// Variables
		HashMap<String,String> hash = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		TreeMap<String,String> tree = new TreeMap<String, String>();
		String scanline;

		String[][] STATE_CAPS = {
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
		
		// Loop to convert the 2D array into a HashMap
		for (int i = 0; i < 50; i++) {
			hash.put(STATE_CAPS[i][0], STATE_CAPS[i][1]);
		}
		
		// Interact with the user
		System.out.println("Hello again human.  I hope you enjoyed our previous game.");
		System.out.println("This time, I have stored all the states and capitals in a HashMap.  Here it is:");
		System.out.println(hash + "\n");
		System.out.println("Wow... you'll notice this list is unsorted and difficult to search! Let's fix that using a TreeMap:");
		// Copy the HashMap data into a TreeMap structure for sorting and searching
		tree.putAll(hash);		
		System.out.println(tree + "\n");
		System.out.println("There, that's much better.  The TreeMap automatically sorted by natural order (alphabetic).");
		System.out.println("Now, if you type the name of any state I will tell you the capital.\n");
		// Do loop will allow the user to keep participating until they are finished
		do {
			System.out.println("Enter state name (case sensitive) or type \"exit\" to quit:  ");
			scanline = sc.nextLine();
			if (tree.containsKey(scanline)) {
				System.out.println("The capital of " + scanline + " is: " + tree.get(scanline));
			} else {
				// Handle the exit command
				if (scanline.equals("exit")) {
					System.out.println("Ok. Thanks for playing with me!");	
				} else {
					// Handle an unknown entry from user
					System.out.println("Sorry, I don't know a state named \"" + scanline + "\"");
				}
			}
		} while (! scanline.equals("exit"));		

		sc.close();
		
	}
}
