package project.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ClassicalMusic implements Music {
    private final List<String> classicalSongs = Arrays.asList("Song1-Classic", "Song2-Classic", "Song3-Classic");

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "some CLASSIC music";
    }

    @Override
    public String getRndSongFromList() {
        int rnd = ThreadLocalRandom.current().nextInt(0, classicalSongs.size());
        return classicalSongs.get(rnd);
    }
}
