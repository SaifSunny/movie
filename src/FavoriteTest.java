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
        favorite.addFavorite("The Shawshank Redemption");
        favorite.addFavorite("The Godfather");

        // Act
        List<Movie> favoriteMovies = favorite.getFavoriteMovies();

        // Assert
        assertEquals(2, favoriteMovies.size());
        assertTrue(favoriteMovies.stream().anyMatch(movie -> movie.getTitle().equals("The Shawshank Redemption")));
        assertTrue(favoriteMovies.stream().anyMatch(movie -> movie.getTitle().equals("The Godfather")));
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