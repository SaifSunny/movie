import java.util.ArrayList;
import java.util.List;

public class Favorite extends MovieListingApp{
    private List<String> favoriteMovies;
    List<Movie> moviesList = getAllMovies();

    public Favorite() {
        this.favoriteMovies = new ArrayList<>();
    }

    // Method to add a movie title to favorites
    public void addFavorite(String movieTitle) {
        if (containsMovie(moviesList, movieTitle)) {
            favoriteMovies.add(movieTitle);
            System.out.println("Movie \"" + movieTitle + "\" added to favorites.");
        } else {
            System.out.println("Movie \"" + movieTitle + "\" not found. Please enter a valid movie title.");
        }
    }

    // Method to remove a movie title from favorites
    public void removeFavorite(String movieTitle) {
        if (favoriteMovies.contains(movieTitle)) {
            favoriteMovies.remove(movieTitle);
            System.out.println("Movie \"" + movieTitle + "\" removed from favorites.");
        } else {
            System.out.println("Movie \"" + movieTitle + "\" not found in favorites.");
        }
    }


    // Method to show details of all favorite movies
    public void showFavoriteMovies() {
        if (favoriteMovies.isEmpty()) {
            System.out.println("You haven't added any favorite movies yet.");
        } else {
            System.out.println("Your Favorite Movies:");
            for (String movieTitle : favoriteMovies) {
                Movie movie = findMovie(moviesList, movieTitle);
                if (movie != null) {
                    System.out.println("Movie Title: " + movie.getTitle());
//                    System.out.println("Cast: " + movie.getCast());
//                    System.out.println("Category: " + movie.getCategory());
//                    System.out.println("Release Date: " + movie.getReleaseDate());
//                    System.out.println("Budget: " + movie.getBudget());
                    System.out.println();
                }
            }
        }
    }

    // Method to get details of a specific movie from favorites
    public void getFavoriteMovie(String movieTitle) {
        Movie movie = findMovie(moviesList, movieTitle);
        if (movie != null) {
            System.out.println("Movie Title: " + movie.getTitle());
            System.out.println("Cast: " + movie.getCast());
            System.out.println("Category: " + movie.getCategory());
            System.out.println("Release Date: " + movie.getReleaseDate());
            System.out.println("Budget: " + movie.getBudget());
        } else {
            System.out.println("Movie \"" + movieTitle + "\" not found in favorites.");
        }
    }

    // find a movie by title
    private Movie findMovie(List<Movie> movies, String movieTitle) {
        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(movieTitle)) {
                return movie;
            }
        }
        return null;
    }

    // check if a movie title exists in the list of all movies
    private boolean containsMovie(List<Movie> movies, String movieTitle) {
        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(movieTitle)) {
                return true;
            }
        }
        return false;
    }
}
