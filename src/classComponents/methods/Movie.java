package classComponents.methods;

public class Movie {
    //instance variables
    int movieId;
    String movieName;
    static String producerName ="ABC Film";

    //instance method
    String getMovieName() {
        //we can access the instance variables from an instance method directly
        return movieName;
    }

    int getMovieId() {
        return movieId;
    }
    static String getProducerName(){
        return producerName;
    }

    public static void main(String[] args) {
        Movie movie = new Movie();
        System.out.println("Movie Id is " + movie.getMovieId());
        System.out.println("Movie name is " + movie.getMovieName());

        //accessing the static method
        System.out.println(Movie.getProducerName());
        System.out.println(movie.getProducerName());
        System.out.println(getProducerName());
    }
}
