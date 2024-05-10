import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class FavoriteTest {

    private Favorite favorite;
    private MovieListingApp movieListingApp;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        favorite = new Favorite();
        movieListingApp = new MovieListingApp();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void addFavorite() {
        favorite.addFavorite("The Shawshank Redemption");
        favorite.addFavorite("The Godfather");

        List<Movie> favoriteMovies = favorite.getFavoriteMovies();

        // Assert
        assertEquals(2, favoriteMovies.size());
        assertTrue(favoriteMovies.stream().anyMatch(movie -> movie.getTitle().equals("The Shawshank Redemption")));
        assertTrue(favoriteMovies.stream().anyMatch(movie -> movie.getTitle().equals("The Godfather")));
    }

    @Test
    void removeFavorite() {
        //add movie
        favorite.addFavorite("The Shawshank Redemption");

        favorite.removeFavorite("The Shawshank Redemption"); // should fail
        List<Movie> favoriteMovies = favorite.getFavoriteMovies();

        // Assert
        assertEquals(0, favoriteMovies.size());
        assertTrue(favoriteMovies.isEmpty());

    }

    @Test
    void showFavoriteMovies() {

        assertEquals("", outputStreamCaptor.toString()); //check for empty list

        favorite.addFavorite("The Shawshank Redemption");
        favorite.addFavorite("The Godfather");

        favorite.showFavoriteMovies();

        // Assert
        assertTrue(outputStreamCaptor.toString().contains("The Shawshank Redemption"));
        assertTrue(outputStreamCaptor.toString().contains("The Godfather"));
    }

    @Test
    void getMovieDetails() {
        favorite.addFavorite("The Shawshank Redemption");
        favorite.getMovieDetails("The Shawshank Redemption");

        // Assert
        assertTrue(outputStreamCaptor.toString().contains("Movie Title: The Shawshank Redemption"));
        assertTrue(outputStreamCaptor.toString().contains("Cast: Tim Robbins, Morgan Freeman"));
        assertTrue(outputStreamCaptor.toString().contains("Category: Drama"));
        assertTrue(outputStreamCaptor.toString().contains("Release Date: 1994-09-10"));
        assertTrue(outputStreamCaptor.toString().contains("Budget: $25 million"));
    }
}