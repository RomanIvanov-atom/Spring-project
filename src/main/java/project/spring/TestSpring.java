package project.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        Music music = context.getBean("classicalMusic", Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//
//        musicPlayer.playMusic();
//
//        Music music2 = context.getBean("rockMusic", Music.class);
//
//        MusicPlayer rockMusicPlayer = new MusicPlayer(music2);
//
//        rockMusicPlayer.playMusic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        musicPlayer.playMusic(MusicGenre.CLASSIC);
//        musicPlayer.playMusic(MusicGenre.ROCK);
//        musicPlayer.playMusic(MusicGenre.JAZZ);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        // For demo of Prototype ( @Scope("Prototype") in ClassicMusic class )
        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);

        // It's FALSE because of Prototype scope
        System.out.println(classicalMusic1 == classicalMusic2);

        context.close();
    }
}
