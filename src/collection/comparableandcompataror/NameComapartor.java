package collection.comparableandcompataror;

import java.util.Comparator;

public class NameComapartor implements Comparator<MovieComparator> {
    @Override
    public int compare(MovieComparator o1, MovieComparator o2) {
        return o1.getName().compareTo(o2.getName());
    }
}