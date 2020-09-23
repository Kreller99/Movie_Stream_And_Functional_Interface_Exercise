package Eksempel;

public class Movie {

    private String movieName;
    private int likes;
    private int prodYear;
    private int minutes;

    public Movie(String movieName, int likes, int prodYear, int minutes) {
        this.movieName = movieName;
        this.likes = likes;
        this.prodYear = prodYear;
        this.minutes = minutes;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getProdYear() {
        return prodYear;
    }

    public void setProdYear(int prodYear) {
        this.prodYear = prodYear;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return "Movie: " + movieName + "\nLikes: " + likes +
                "\nProd. Year: " + prodYear +
                "\nMinutes: " + minutes + "\n";
    }
}
