package project.spring;

import org.springframework.stereotype.Component;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "some CLASSIC music";
    }
}
