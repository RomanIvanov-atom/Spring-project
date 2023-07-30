package project.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

//    private List<Music> musicList = new ArrayList<>();
//    private String name;
//    private int volume;

//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public int getVolume() {
//        return volume;
//    }
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }

//    public MusicPlayer(List<Music> musicList) {
//        this.musicList = musicList;
//    }

    public void playMusic() {
        System.out.println("1st song is playing " + classicalMusic.getSong());
        System.out.println("2nd song is playing " + rockMusic.getSong());
    }

//    public void playMusic() {
//        for (Music music : musicList) {
//            System.out.println("Now is playing " + music.getSong());
//        }
//    }
//}
}