package project.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println("Music player's name is: " + musicPlayer.getName());
        System.out.println("Music player's volume is: " + musicPlayer.getVolume());

        System.out.println(musicPlayer.playMusic());

        context.close();
    }
}
