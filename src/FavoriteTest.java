import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class FavoriteTest {

    private Favorite favorite;
    private MovieListingApp movieListingApp;

    @BeforeEach
    void setUp() {
        favorite = new Favorite();
        movieListingApp = new MovieListingApp();
    }

    @Test
    void addFavorite() {
        favorite.addFavorite("father");

        // Act
        List<Movie> favoriteMovies = favorite.getFavoriteMovies();

        // Assert
        assertEquals(1, favoriteMovies.size());
        assertTrue(favoriteMovies.stream().anyMatch(movie -> movie.getTitle().equals("father"))); // should fail
    }

    @Test
    void removeFavorite() {
    }

    @Test
    void showFavoriteMovies() {
    }

    @Test
    void getFavoriteMovie() {
    }
}