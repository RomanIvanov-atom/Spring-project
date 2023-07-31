package project.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private final Music music1;
    private final Music music2;
    private final Music music3;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2,
                       @Qualifier("jazzMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
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

    public String playMusic() {
        return "Playing 3 songs:\n" + music1.getSongFromList() + ",\n " +
                music2.getSongFromList() + ",\n " +
                music3.getSongFromList() + ".";
    }

//    public void playMusic() {
//        for (Music music : musicList) {
//            System.out.println("Now is playing " + music.getSong());
//        }
//    }
//}
}