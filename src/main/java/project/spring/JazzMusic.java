package project.spring;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class JazzMusic implements Music {
    List<String> jazzSongs = Arrays.asList("Song1-Jazz", "Song2-Jazz", "Song3-Jazz");

    @Override
    public String getSong() {
        return "some JAZZ composition";
    }

    @Override
    public String getRndSongFromList() {
        int rnd = ThreadLocalRandom.current().nextInt(0, jazzSongs.size());
        return jazzSongs.get(rnd);
    }
}
