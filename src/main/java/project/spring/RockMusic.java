package project.spring;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Component
public class RockMusic implements Music {
    List<String> rockSongs = Arrays.asList("Song1-Rock", "Song2-Rock", "Song3-Rock");

    @Override
    public String getSong() {
        return "some ROCK composition";
    }

    @Override
    public String getRndSongFromList() {
        int rnd = ThreadLocalRandom.current().nextInt(0, rockSongs.size());
        return rockSongs.get(rnd);
    }
}
