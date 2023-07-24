package project.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

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

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparison = firstMusicPlayer == secondMusicPlayer;

        System.out.println(comparison);

        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

//        musicPlayer.playMusic();
//
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//
//        musicPlayer.playMusic();

        context.close();
    }
}
