package Tryout;

class Movie {
    String movieName;
    String movieDir;
    static String type;

    public Movie() {
        this.movieName = "OMG";
        this.movieDir = "Somnath";
    }

    public Movie(String movieName, String movieDir) {
        this.movieName = movieName;
        this.movieDir = movieDir;
    }

    public void displayMovieInfo() {
        System.out.println(movieName + " " + movieDir + " " + type);
    }

    public void displayMovieInfo(int rating) {
        System.out.println(movieName + " " + movieDir + " " + rating + " "+  type);
    }

}

public class Classes {
    public static void main(String[] args) {
        Movie mov = new Movie("HelloWorld","Arun");
        Movie.type = "Theatrics";
        mov.displayMovieInfo();
        mov.displayMovieInfo(4);
        Movie mov2 = new Movie("HelloWorld1","Arun2");
        mov2.displayMovieInfo();
        mov2.displayMovieInfo(4);
        Movie mov3 = new Movie();
        mov3.displayMovieInfo();
        mov3.displayMovieInfo(4);


    }
}
