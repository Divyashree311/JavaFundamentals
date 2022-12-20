package collection.comparableandcompataror;

import java.util.Comparator;

public class YearComparator implements Comparator<MovieComparator> {
    @Override
    public int compare(MovieComparator o1, MovieComparator o2) {
        if (o1.getYear() < o2.getYear()) return -1;
        if (o1.getYear() > o2.getYear() ) return  1;
        return 0;
    }
}