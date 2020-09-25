import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Movie movie = new Movie();
		String choice;
		String s;
		
		do {
			System.out.println("Enter the title of the movie:");
			movie.setTitle(input.nextLine()); // reads movie title
			
			System.out.println("Enter the movie's rating:");
			movie.setRating(input.nextLine()); //reads movie rating
			
			System.out.println("Enter the number of tickets sold for this movie:");
			movie.setSoldTickets(input.nextInt());//reads number of tickets sold
			
			System.out.println(movie.toString());
			
			System.out.println("Would you like to enter another movie? (y or n):");
			choice = input.nextLine();
			choice = input.nextLine();
			
			String yn = choice.toLowerCase(); //Lets the user put in yes
			char c = yn.charAt(0);			  //or no with it not being
			s = Character.toString(c);        //case sensitive
		} while (s.equals("y"));
		
		System.out.println("Thank you! Goodbye.");
	}

}
