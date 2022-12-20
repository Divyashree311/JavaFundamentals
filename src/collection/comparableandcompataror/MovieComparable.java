package collection.comparableandcompataror;

import java.util.ArrayList;
import java.util.Collections;

public class MovieComparable implements Comparable<MovieComparable>{
    private String name;
    private double rating;
    private int year;

    @Override
    public int compareTo(MovieComparable m) {
        return this.year-m.year ;
    }

    public MovieComparable(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }



    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }


    public static void main(String[] args) {
        ArrayList<MovieComparable> movieComparables = new ArrayList<>();
        movieComparables.add(new MovieComparable("KGF 1",4.5,2019));
        movieComparables.add(new MovieComparable("KGF 2",4,2021));
        movieComparables.add(new MovieComparable("Kantara",5,2022));

        System.out.println("Movies before sorting ");

        for (MovieComparable movies: movieComparables){
            System.out.println("Name: " + movies.name + " Rating " + movies.rating + " Year " + movies.year);
        }


        Collections.sort(movieComparables);

        System.out.println("Movies after sorting ");

        for (MovieComparable movies: movieComparables){
            System.out.println("Name: " + movies.name + " Rating " + movies.rating + " Year " + movies.year);
        }




    }

}
