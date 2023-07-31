package project.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    @Autowired
    @Qualifier("classicalMusic")
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

//    public MusicPlayer(List<Music> musicList) {
//        this.musicList = musicList;
//    }

    public String playMusic() {
        return "Playing: " + music.getSong();
    }

//    public void playMusic() {
//        for (Music music : musicList) {
//            System.out.println("Now is playing " + music.getSong());
//        }
//    }
//}
}