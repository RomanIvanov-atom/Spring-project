package project.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);

        System.out.println(classicalMusic.getSong());

//        Music rockMusic = context.getBean("musicRockBean", Music.class);
//        MusicPlayer rockMusicPlayer = new MusicPlayer(rockMusic);
//        rockMusicPlayer.playMusic();
//
//        Music jazzMusic = context.getBean("musicJazzBean", Music.class);
//        MusicPlayer jazzMusicPlayer = new MusicPlayer(jazzMusic);
//        jazzMusicPlayer.playMusic();
//
//        Music classicalMusic = context.getBean("musicClassicalBean", Music.class);
//        MusicPlayer classicalMusicPlayer = new MusicPlayer(classicalMusic);
//        classicalMusicPlayer.playMusic();
//
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//
//        musicPlayer.playMusic();

        context.close();
    }
}
