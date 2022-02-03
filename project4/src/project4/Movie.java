package project4;

//Part of your job is to fully javadoc this class, all methods and
//all attributes
/**
 * Creates a Movie class with attributes: title, star (who was the 
 * star of the movie), numMinutes (the movie's runtime), budget 
 * (the production cost), and trueStory (if the movie is based 
 * on a true story or not)
 * @author Justin Homme
 * @version 02/22/21
 */
public class Movie {

		private String title;
		
		private String star;
		
		private int numMinutes;
		
		private double budget;
		
		private boolean trueStory;
		
		/**
		 * Constructor for Movie
		 * @param title
		 * @param star
		 * @param numMinutes
		 * @param budget
		 * @param trueStory
		 */
		public Movie(String title, String star, int numMinutes, 
				double budget, boolean trueStory){
			this.title = title;
			this.star = star;
			this.numMinutes = numMinutes;
			this.budget = budget;
			this.trueStory = trueStory;
		}
		
		/**
		 * returns the title as a String
		 * @return title
		 */
		public String getTitle(){
			return title;
		}
		
		/**
		 * takes in a String "title" and assigns it to the title attribute of Movie
		 * @param title
		 */
		public void setTitle(String title) {
			this.title = title;
		}
		
		/**
		 * returns the star of the movie as a String
		 * @return star
		 */
		public String getStar(){
			return star;
		}
		
		/**
		 * takes in a String "star" and assigns it to the star attribute of Movie
		 * @param star
		 */
		public void setStar(String star) {
			this.star = star;
		}
		
		/**
		 * returns the length of the movie (in minutes) as an integer
		 * @return numMinutes
		 */
		public int getNumMinutes(){
			return numMinutes;
		}
		
		/**
		 * takes in an integer "numMinutes" and assigns it to the numMinutes
		 * attribute of Movie
		 * @param numMinutes
		 */
		public void setNumMinutes(int numMinutes) {
			if(numMinutes > 0) {					// This is to make sure a negative amount
				this.numMinutes = numMinutes;		// of time is not passed through
			}	
		}
		
		/**
		 * returns the budget of the movie (in Millions) as an integer
		 * @return budget
		 */
		public double getBudget(){
			return budget;
		}
		
		/**
		 * takes in the budget (in millions) as an integer and assigns
		 * it to the budget parameter of Movie
		 * @param budget
		 */
		public void setBudget(double budget) {
			if(budget >= 0) {					// This is to ensure that a negative budget
				this.budget = budget;			// is not passed through
			}	
		}
		
		/**
		 * returns a boolean value (true or false) to the
		 * claim that the movie is based on a true story
		 * @return trueStory
		 */
		public boolean isTrueStory(){
			return trueStory;
		}
		
		/**
		 * takes in a boolean value "trueStory" and assigns it 
		 * to the trueStory parameter of Movie
		 * @param trueStory
		 */
		public void setTrueStory(boolean trueStory) {
			this.trueStory = trueStory;
		}
		
		/**
		 * calculates the cost per minute of the movie and
		 * returns that calculation as a double
		 * @return (budget * 1000000) / numMinutes
		 */
		public double getPricePerMinute(){
			return (budget * 1000000) / numMinutes;	// This multiplies the budget by 1 million
		}											// since it is kept in units of 1 million and 
													// divides by the movie's length
		/**
		 * returns one of two slightly varying strings based on 
		 * the boolean value held in "trueStory"
		 * @return a String
		 */
		public String toString(){
			if (trueStory == true) {
				return "The movie \"" + title + "\" starred " + star + ". \n" + "With a budget of $"
						+ budget + " million and a run time of " + numMinutes + " minutes, it cost $" 
						+ getPricePerMinute() + " per minute. \n" + "This movie was based on "
						+ "a true story.";
			} else {
				return "The movie \"" + title + "\" starred " + star + ". \n" + "With a budget of $"
						+ budget + " million and a run time of " + numMinutes + " minutes, it cost $" 
						+ getPricePerMinute() + " per minute. \n" + "This movie was not based on "
						+ "a true story.";
			}
		}
		
		//DO NOT alter this main method
		//The main method that will print information on 4 example movies.

			public static void main(String[] args) {
				Movie logan = new Movie("Logan",
						"Patrick Stewart", 137, 127, false);
				Movie arrival = new Movie("Arrival",
						"Amy Adams", 116, 47, true);
				Movie lawrence = new Movie("Lawrence of Arabia",
						"Peter O'Toole", 216, 15, true);
				Movie temple = new Movie("Temple Grandin",
						"Claire Danes", 107, 21.374, true);
				
				System.out.println(logan + "\n");
				System.out.println(arrival + "\n");
				System.out.println(lawrence + "\n");
				System.out.println(temple + "\n");
				
				System.out.println("Changing Logan's star...");
				logan.setStar("Hugh Jackman");
				
				System.out.println("Changing Arrival's true story status...");
				arrival.setTrueStory(false);
				
				System.out.println("Changing Temple Grandin's budget...");
				temple.setBudget(14);

				System.out.println();
				System.out.println(logan + "\n");
				System.out.println(arrival + "\n");
				System.out.println(lawrence + "\n");
				System.out.println(temple + "\n");
			}

	}
