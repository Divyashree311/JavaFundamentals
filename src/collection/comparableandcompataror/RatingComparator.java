package collection.comparableandcompataror;

import java.util.Comparator;

public class RatingComparator implements Comparator<MovieComparator> {
    @Override
    public int compare(MovieComparator o1, MovieComparator o2) {
        if (o1.getRating() < o2.getRating()) return -1;
        if (o1.getRating() > o2.getRating() ) return  1;
        return 0;
    }
}
