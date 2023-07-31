package project.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private final ClassicalMusic classicalMusic;
    private final RockMusic rockMusic;
    private final JazzMusic jazzMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, JazzMusic jazzMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.jazzMusic = jazzMusic;
    }

    public void playMusic(MusicGenre genre) {
        switch (genre) {
            case CLASSIC -> System.out.println(classicalMusic.getRndSongFromList());
            case ROCK -> System.out.println(rockMusic.getRndSongFromList());
            case JAZZ -> System.out.println(jazzMusic.getRndSongFromList());
        }
    }
}