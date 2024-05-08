import java.util.HashMap;
import java.util.Map;

public class MovieListingApp {

    // a hash map to store movies
    private final Map<String, Movie> movieMap;

    public MovieListingApp() {
        this.movieMap = new HashMap<>();
        initializeMovies();
    }

    private void initializeMovies() {

        Movie movie1 = new Movie("The Shawshank Redemption", "Tim Robbins, Morgan Freeman", "Drama", "1994-09-10", "$25 million");
        Movie movie2 = new Movie("The Godfather", "Marlon Brando, Al Pacino", "Crime", "1972-03-14", "$6-7 million");
        Movie movie3 = new Movie("The Dark Knight", "Christian Bale, Heath Ledger", "Action", "2008-07-18", "$185 million");
        Movie movie4 = new Movie("Pulp Fiction", "John Travolta, Uma Thurman", "Crime", "1994-10-14", "$8-8.5 million");
        Movie movie5 = new Movie("The Lord of the Rings: The Return of the King", "Elijah Wood, Viggo Mortensen", "Fantasy", "2003-12-17", "$94 million");
        Movie movie6 = new Movie("Schindler's List", "Liam Neeson, Ben Kingsley", "Biography", "1993-12-15", "$22 million");
        Movie movie7 = new Movie("Fight Club", "Brad Pitt, Edward Norton", "Drama", "1999-10-15", "$63 million");
        Movie movie8 = new Movie("Forrest Gump", "Tom Hanks, Robin Wright", "Drama", "1994-07-06", "$55 million");
        Movie movie9 = new Movie("Inception", "Leonardo DiCaprio, Joseph Gordon-Levitt", "Action", "2010-07-16", "$160 million");
        Movie movie10 = new Movie("The Matrix", "Keanu Reeves, Laurence Fishburne", "Action", "1999-03-31", "$63 million");

        // Adding movies to the map
        movieMap.put(movie1.getTitle(), movie1);
        movieMap.put(movie2.getTitle(), movie2);
        movieMap.put(movie3.getTitle(), movie3);
        movieMap.put(movie4.getTitle(), movie4);
        movieMap.put(movie5.getTitle(), movie5);
        movieMap.put(movie6.getTitle(), movie6);
        movieMap.put(movie7.getTitle(), movie7);
        movieMap.put(movie8.getTitle(), movie8);
        movieMap.put(movie9.getTitle(), movie9);
        movieMap.put(movie10.getTitle(), movie10);
    }


}
