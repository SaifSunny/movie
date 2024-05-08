import java.util.List;
import java.util.Scanner;

public class Main {

    public static void favorite(){
        Scanner scanner = new Scanner(System.in);
        Favorite fav = new Favorite();
        int choice;

        do {
            System.out.println("1. All Favorite Movies");
            System.out.println("2. Search Favorite Movies");
            System.out.println("3. Add Favorite Movie");
            System.out.println("4. Remove Favorite Movie");
            System.out.println("5. Back to Menu");

            System.out.println("Enter your Choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    fav.showFavoriteMovies();
                    break;
                case 2:
                    System.out.println("Enter Movie Title: ");
                    String x = scanner.nextLine();
                    fav.getFavoriteMovie(x);
                    break;
                case 3:
                    System.out.println("Enter Movie Title: ");
                    String m = scanner.nextLine();
                    fav.addFavorite(m);
                    break;
                case 4:
                    System.out.println("Enter Movie Title: ");
                    String n = scanner.nextLine();
                    fav.removeFavorite(n);
                    break;
                case 5:
                    System.out.println("Going back to the main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }


    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        MovieListingApp movieList = new MovieListingApp();
        int choice;

        do {
            System.out.println("1. All Movies");
            System.out.println("2. Search Movie");
            System.out.println("3. Movie Detail");
            System.out.println("4. My Favorite Movies");
            System.out.println("0. Exit");
            System.out.println();
            System.out.println("Enter your Choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("\nAll Movie Titles:\n");
                    for (Movie movie : movieList.getAllMovies()) {
                        System.out.println(movie.getTitle());
                    }
                    System.out.println();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter Movie Title: ");
                    String m = scanner.nextLine();
                    List<Movie> searchResults = MovieListingApp.searchMovies(m);
                    if (searchResults.isEmpty()) {
                        System.out.println("No Movie Found");
                    } else {
                        System.out.println("\nSearch Results:\n");
                        for (Movie movie : searchResults) {
                            System.out.println(movie.getTitle());
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Enter Movie Title: ");
                    String n = scanner.nextLine();
                    movieList.displayMovieDetails(n);
                    System.out.println();
                    break;
                case 4:
                    favorite();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        scanner.close();

    }

    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your email address: ");
//        String email = scanner.nextLine();
        String email = "example@example.com";
        System.out.println("Email address entered: " + email);

        UserRegistration ur = new UserRegistration();
        boolean status = ur.registerUser(email);

//        scanner.close();

        if (status){
            menu();
        }
    }
}