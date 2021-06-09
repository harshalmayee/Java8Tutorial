package com.company.Lambda.ComparatorExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MovieComparator {

    public static void main(String[] args) {
       Movie m1=new Movie("Inception",110);
       Movie m2=new Movie("GodFather",200);
       Movie m3=new Movie("Forest Gump",130);
       Movie m4=new Movie("Avengers",150);

       List<Movie> listOfMovies=new ArrayList<>();
       listOfMovies.add(m1);
       listOfMovies.add(m2);
       listOfMovies.add(m3);
       listOfMovies.add(m4);

       System.out.println("Before Sorting....");
       for (int i=0;i<listOfMovies.size();i++){
           Movie movie=(Movie)listOfMovies.get(i);
           System.out.println(movie);
       }

       //Sort by MovieName using Anonymous Compator Old Way
        Collections.sort(listOfMovies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getMovieName().compareTo(o2.getMovieName());
            }
        });

       // Using Lambda Expression
       Collections.sort(listOfMovies,(o1,o2)->o1.getMovieName().compareTo(o2.getMovieName()));

       System.out.println("After Sorting...");
       for(int i=0;i<listOfMovies.size();i++){
           Movie movie=(Movie)listOfMovies.get(i);
           System.out.println(movie);
       }



    }
}
