package katas;

import model.BoxArt;
import model.Movie;
import util.DataUtil;

import java.util.Collection;

/*
    Goal: Retrieve the url of the largest boxart using map() and reduce()
    DataSource: DataUtil.getMovieLists()
    Output: String
*/
public class Kata6 {
    public static String execute() {
        return DataUtil.getMovies()
                .stream()
                .map(Movie::getBoxarts)
                .flatMap(Collection::stream)
                .reduce(new BoxArt(0, 0, ""), (boxArt, boxArt2)
                        -> (boxArt.getWidth() >= boxArt2.getWidth()) && (boxArt.getHeight() >= boxArt2.getHeight()) ? boxArt : boxArt2)
                .getUrl();
    }
}
