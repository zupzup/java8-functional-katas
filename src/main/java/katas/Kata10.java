package katas;

import com.codepoetics.protonpack.StreamUtils;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import model.MovieList;
import util.DataUtil;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Goal: Create a datastructure from the given data:

    We have 2 arrays each containing lists, and videos respectively.
    Each video has a listId field indicating its parent list.
    We want to build an array of list objects, each with a name and a videos array.
    The videos array will contain the video's id and title.
    In other words we want to build the following structure:

    [
        {
            "name": "New Releases",
            "videos": [
                {
                    "id": 65432445,
                    "title": "The Chamber"
                },
                {
                    "id": 675465,
                    "title": "Fracture"
                }
            ]
        },
        {
            "name": "Thrillers",
            "videos": [
                {
                    "id": 70111470,
                    "title": "Die Hard"
                },
                {
                    "id": 654356453,
                    "title": "Bad Boys"
                }
            ]
        }
    ]

    DataSource: DataUtil.getLists(), DataUtil.getVideos()
    Output: the given datastructure
*/
public class Kata10 {
    public static List<Map> execute() {
        List<Map> lists = DataUtil.getLists();
        List<Map> videos = DataUtil.getVideos();

        //return ImmutableList.of(ImmutableMap.of("name", "someName", "videos", ImmutableList.of(
        //ImmutableMap.of("id", 5, "title", "The Chamber"),
        //ImmutableMap.of("id", 3, "title", "Fracture")
        //)));
        return DataUtil.getLists()
                .stream()
                .map(listMap -> ImmutableMap.of(
                        "name", listMap.get("name"),
                        "videos", DataUtil.getVideos()
                                .stream()
                                .filter(filterMap -> filterMap.get("listId").equals(listMap.get("id")))
                                .map(videoMap -> ImmutableMap.of(
                                        "id", videoMap.get("id"),
                                        "title", videoMap.get("title")))
                                .collect(Collectors.toList())))
                .collect(Collectors.toList());
    }
}
