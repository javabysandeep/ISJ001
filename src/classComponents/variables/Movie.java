package classComponents.variables;

public class Movie {
    int movieId;
    String movieName;
    int movieDuration;
    String movieType;

    static  String producerCompany = "Red chillis";
    public static void main(String[] args) {
        System.out.println(producerCompany);

        System.out.println(Movie.producerCompany);

        Movie movieReference = new Movie();
        System.out.println(movieReference.producerCompany);

    }
}
