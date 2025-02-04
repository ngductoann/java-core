public class App {
    public static void main(String[] args) throws Exception {

        // Movie theMovie = new Movie("Star Wars");
        // theMovie.watchMovie();

        Movie theMovie = Movie.getMovie("Adventure", "Star Wars");
        theMovie.watchMovie();
    }
}
