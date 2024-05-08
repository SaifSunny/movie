import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

class MovieListingAppTest {

    @Test
    void getAllMovies() {

        MovieListingApp movieList = new MovieListingApp();
        List<Movie> allMovies = movieList.getAllMovies();

        // allMovies are not null and contains the expected number of movies
        assertNotNull(allMovies);
        assertEquals(10, allMovies.size());
    }

    @Test
    void searchMovies() {
        MovieListingApp movieList = new MovieListingApp();
        List<Movie> foundMovies = movieList.searchMovies("The Matrix");

        // found movies is not null and contains at least one movie
        assertNotNull(foundMovies);
        assertFalse(foundMovies.isEmpty());
    }

    @Test
    void displayMovieDetails() {
        MovieListingApp movieList = new MovieListingApp();
        String movieTitle = "The Shawshank Redemption";

        // Redirect System.out to a ByteArrayOutputStream
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        movieList.displayMovieDetails(movieTitle);
        String output = outContent.toString();

        // Assert that the output contains expected information
        assertTrue(output.contains("Movie Title: The Shawshank Redemption"));
        assertTrue(output.contains("Category: Drama"));
    }
}