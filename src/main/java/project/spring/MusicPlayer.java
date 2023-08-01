package project.spring;

import org.springframework.beans.factory.annotation.Value;

public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;
    private final ClassicalMusic classicalMusic;
    private final RockMusic rockMusic;
    private final JazzMusic jazzMusic;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, JazzMusic jazzMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.jazzMusic = jazzMusic;
    }

    public String playMusic() {
        return "Playing: " + classicalMusic.getSong() + ", " +
                rockMusic.getSong() + ", " +
                jazzMusic.getSong() + ".";
    }
    public void playMusic(MusicGenre genre) {
        switch (genre) {
            case CLASSIC -> System.out.println(classicalMusic.getRndSongFromList());
            case ROCK -> System.out.println(rockMusic.getRndSongFromList());
            case JAZZ -> System.out.println(jazzMusic.getRndSongFromList());
        }
    }
}