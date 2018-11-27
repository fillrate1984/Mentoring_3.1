package com;

import com.Animals;

public class Cat extends Animals {
    @Override
    public void play() {
        rootLogger.info("Cat's playing");
    }

    @Override
    public void voice() {
        rootLogger.info("Meow");
    }
}
