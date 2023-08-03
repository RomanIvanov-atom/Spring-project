package project.spring;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class MusicPlayer {

    private final List<Music> musicList;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        int rnd = ThreadLocalRandom.current().nextInt(musicList.size());
        System.out.println("wtf");
        return "Playing: " + musicList.get(rnd).getRndSongFromList() + " with volume " + this.volume;
    }
}