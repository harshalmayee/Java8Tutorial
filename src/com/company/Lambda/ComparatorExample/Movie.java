package com.company.Lambda.ComparatorExample;

public class Movie {

    private String movieName;
    private long duration;

    public Movie(String movieName, long duration) {
        this.movieName = movieName;
        this.duration = duration;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", duration=" + duration +
                '}';
    }
}
