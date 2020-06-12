package katas;

import model.Movie;
import util.DataUtil;

/*
    Goal: Retrieve the largest rating using reduce()
    DataSource: DataUtil.getMovies()
    Output: Double
*/
public class Kata5 {
    public static Double execute() {
        return DataUtil.getMovies()
                .stream()
                .map(Movie::getRating)
                .reduce(0.0, Double::max);
    }
}
