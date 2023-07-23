package project.spring;

public class MusicPlayer {
    private Music music;

    public MusicPlayer() {

    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Now is playing " + music.getSong());
    }
}
