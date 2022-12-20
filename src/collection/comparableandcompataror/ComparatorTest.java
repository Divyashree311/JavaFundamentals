package collection.comparableandcompataror;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorTest {
    public static void main(String[] args) {
        ArrayList<MovieComparator> list = new ArrayList<>();
        list.add(new MovieComparator("KGF 1", 4.5, 2019));
        list.add(new MovieComparator("KGF 2", 4, 2021));
        list.add(new MovieComparator("Kantara", 5, 2022));

        System.out.println("Movies before sorting ");

        for (MovieComparator movies : list) {
            System.out.println("Name: " + movies.getName() + " Rating " + movies.getRating() + " Year " + movies.getYear());
        }


        System.out.println("----------------------------------------------------------------");


        RatingComparator ratingComparator = new RatingComparator();

        Collections.sort(list, ratingComparator);

        System.out.println("Movies after  rating sorting ");

        for (MovieComparator movies : list) {
            System.out.println("Name: " + movies.getName() + " Rating " + movies.getRating() + " Year " + movies.getYear());
        }

        System.out.println("----------------------------------------------------------------");

        NameComapartor nameComapartor = new NameComapartor();
        Collections.sort(list, nameComapartor);

        System.out.println("Movies after name Comapartor sorting ");

        for (MovieComparator movies : list) {
            System.out.println("Name: " + movies.getName() + " Rating " + movies.getRating() + " Year " + movies.getYear());
        }

        System.out.println("----------------------------------------------------------------");

        YearComparator yearComparator = new YearComparator();
        Collections.sort(list, yearComparator);

        System.out.println("Movies after year Comparator sorting ");

        for (MovieComparator movies : list) {
            System.out.println("Name: " + movies.getName() + " Rating " + movies.getRating() + " Year " + movies.getYear());
        }


    }
}
