package day05;

public class ViewerMain {
    public static void main(String[] args) {
        Movie movie = new Movie("Rambo 23", 2023);
        Viewer viewer = new Viewer();
        int rating = 5;
        viewer.watchMovie(movie, rating);
        System.out.println("Értékelés: " + rating + ", átlag: " + movie.getAvgRating());
        rating = 4;
        viewer.watchMovie(movie, rating);
        System.out.println("Értékelés: " + rating + ", átlag: " + movie.getAvgRating());
        viewer.watchMovie(movie, rating);
        System.out.println("Értékelés: " + rating + ", átlag: " + movie.getAvgRating());
        rating = 1;
        viewer.watchMovie(movie, rating);
        System.out.println("Értékelés: " + rating + ", átlag: " + movie.getAvgRating());
    }
}
