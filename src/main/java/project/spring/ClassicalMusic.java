package project.spring;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Component
public class ClassicalMusic implements Music {
    List<String> classicalSongs = Arrays.asList("Song1-Classic", "Song2-Classic", "Song3-Classic");

    @Override
    public String getSong() {
        return "some CLASSIC music";
    }

    @Override
    public String getSongFromList() {
        int rnd = ThreadLocalRandom.current().nextInt(0, classicalSongs.size());
        return classicalSongs.get(rnd);
    }
}
