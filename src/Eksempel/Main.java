package Eksempel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        List<Movie> movieList = new ArrayList<>();

        movieList.add(new Movie("Titanic", 1000000, 1997, 195));
        movieList.add(new Movie("The Wolf of Wall Street", 1001001, 2013, 180));
        movieList.add(new Movie("American Sniper", 265000, 2014, 134));
        movieList.add(new Movie("The Fast and the Furious", 75750, 2001, 104));

        List<Movie> streamMovie1 = movieList.stream()
                .filter(m -> m.getMinutes() >= 180 && m.getMovieName().startsWith("T"))
                .collect(Collectors.toList());
        streamMovie1.forEach(s -> System.out.println(s));


        List<Movie> streamMovie2 = movieList.stream()
                .filter(m -> m.getLikes() < 500000 && m.getMinutes() > 100)
                .collect(Collectors.toList());
        streamMovie2.forEach(t -> System.out.println(t));

        ZeroArguments zeroArguments = () -> true;
        System.out.println(zeroArguments.only());

        OneArguments<Integer> oneArguments = t -> t + t;
        System.out.println(oneArguments.test(47));

        TwoArguments<Integer, Integer> twoArguments = (t, s) -> (t * s);
        {
            System.out.println(twoArguments.test(320, 47));


        }
    }
}
