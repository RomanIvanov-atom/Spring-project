package project.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private Music music;
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

    public MusicPlayer(Music music) {
        this.music = music;
    }

    @Autowired
    public void setMusic(Music music) {
        this.music = music;
    }
//    public MusicPlayer(List<Music> musicList) {
//        this.musicList = musicList;
//    }

    public void playMusic() {
        System.out.println("Now is playing " + music.getSong());
    }

//    public void playMusic() {
//        for (Music music : musicList) {
//            System.out.println("Now is playing " + music.getSong());
//        }
//    }
//}
}