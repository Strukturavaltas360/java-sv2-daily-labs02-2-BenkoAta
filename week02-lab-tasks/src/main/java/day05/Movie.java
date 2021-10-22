package day05;

public class Movie {
    private String title;
    private int yearOfProduction;
    private int noOfRatings;
    private int sumOfRatings;
    private double avgRating;

    public Movie(String title, int yearOfProduction) {
        this.title = title;
        this.yearOfProduction = yearOfProduction;
    }

    public double rate(int rating) {
        noOfRatings++;
        sumOfRatings += rating;
        avgRating = (double) sumOfRatings / noOfRatings;
        return avgRating;
    }

    public double getAvgRating() {
        return avgRating;
    }
}
