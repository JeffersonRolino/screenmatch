public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "The Godfather";
        myMovie.releaseYear = 1972;
        myMovie.durationInMinutes = 175;

        System.out.println(myMovie);
        System.out.println(myMovie.name);
        System.out.println(myMovie.releaseYear);
        System.out.println(myMovie.durationInMinutes);
    }
}